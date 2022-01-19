package filehandling;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Scanner;

import org.apache.commons.io.IOUtils;

import com.mendix.core.Core;
import com.mendix.core.objectmanagement.member.MendixBoolean;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

import system.proxies.FileDocument;

public class FileHandling {
	
	private static final String LOGNODE = "FileHandling";
	
	public static void base64DecodeToFile(IContext context, String encoded, FileDocument targetFile) throws Exception
	{
		if (targetFile == null)
			throw new IllegalArgumentException("Source file is null");
		if (encoded == null)
			throw new IllegalArgumentException("Source data is null");

		byte [] decoded = Base64.getDecoder().decode(encoded.getBytes());

		try  (
			ByteArrayInputStream bais = new ByteArrayInputStream(decoded);
		) {
			Core.storeFileDocumentContent(context, targetFile.getMendixObject(), bais);
		}
	}
	
	public static String base64EncodeFile(IContext context, FileDocument file) throws IOException
	{
		if (file == null)
			throw new IllegalArgumentException("Source file is null");
		if (!file.getHasContents())
			throw new IllegalArgumentException("Source file has no contents!");

		try (
			InputStream f = Core.getFileDocumentContent(context, file.getMendixObject())
		) {
			return Base64.getEncoder().encodeToString(IOUtils.toByteArray(f));
		}
	}
	
	public static Boolean duplicateFileDocument(IContext context, IMendixObject toClone, IMendixObject target) throws Exception {
		if (toClone == null || target == null) {
			throw new Exception("No file to clone or to clone into provided");
		}

		MendixBoolean hasContents = (MendixBoolean) toClone.getMember(context, FileDocument.MemberNames.HasContents.toString());
		if (!hasContents.getValue(context)) {
			return false;
		}

		try (
			InputStream inputStream = Core.getFileDocumentContent(context, toClone)) {
			Core.storeFileDocumentContent(context, target, (String) toClone.getValue(context, system.proxies.FileDocument.MemberNames.Name.toString()), inputStream);
		}

		return true;
	}

	public static Boolean duplicateImage(IContext context, IMendixObject toClone, IMendixObject target, int thumbWidth, int thumbHeight) throws Exception {
		if (toClone == null || target == null) {
			throw new Exception("No file to clone or to clone into provided");
		}

		MendixBoolean hasContents = (MendixBoolean) toClone.getMember(context, FileDocument.MemberNames.HasContents.toString());
		if (!hasContents.getValue(context)) {
			return false;
		}

		try (
			InputStream inputStream = Core.getImage(context, toClone, false)) {
			Core.storeImageDocumentContent(context, target, inputStream, thumbWidth, thumbHeight);
		}

		return true;
	}

	public static Boolean storeURLToFileDocument(IContext context, String url, IMendixObject __document, String filename) throws IOException {
		if (__document == null || url == null || filename == null) {
			throw new IllegalArgumentException("No document, filename or URL provided");
		}

		final int MAX_REMOTE_FILESIZE = 1024 * 1024 * 200; //maximum of 200 MB
		try {
			URL imageUrl = new URL(url);
			URLConnection connection = imageUrl.openConnection();
			//we connect in 20 seconds or not at all
			connection.setConnectTimeout(20000);
			connection.setReadTimeout(20000);
			connection.connect();

			int contentLength = connection.getContentLength();

			//check on beforehand the size of the remote file, we don't want to kill the server by providing a 3 terabyte image.
			Core.getLogger(LOGNODE).trace(String.format("Remote filesize: %d", contentLength));

			if (contentLength > MAX_REMOTE_FILESIZE) { //maximum of 200 mb
				throw new IllegalArgumentException(String.format("Wrong filesize of remote url: %d (max: %d)", contentLength, MAX_REMOTE_FILESIZE));
			}

			InputStream fileContentIS;
			try (InputStream connectionInputStream = connection.getInputStream()) {
				if (contentLength >= 0) {
					fileContentIS = connectionInputStream;
				} else { // contentLength is negative or unknown
					Core.getLogger(LOGNODE).trace(String.format("Unknown content length; limiting to %d", MAX_REMOTE_FILESIZE));
					byte[] outBytes = new byte[MAX_REMOTE_FILESIZE];
					int actualLength = IOUtils.read(connectionInputStream, outBytes, 0, MAX_REMOTE_FILESIZE);
					fileContentIS = new ByteArrayInputStream(Arrays.copyOf(outBytes, actualLength));
				}
				Core.storeFileDocumentContent(context, __document, filename, fileContentIS);
			}
		} catch (IOException ioe) {
			Core.getLogger(LOGNODE).trace(String.format("A problem occurred while reading from URL %s: %s", url, ioe.getMessage()));
			throw ioe;
		}

		return true;
	}

	public static Long getFileSize(IContext context, IMendixObject document) {
		final int BUFFER_SIZE = 4096;
		long size = 0;

		if (context != null) {
			byte[] buffer = new byte[BUFFER_SIZE];

			try (
				InputStream inputStream = Core.getFileDocumentContent(context, document)) {
				int i;
				while ((i = inputStream.read(buffer)) != -1) {
					size += i;
				}
			} catch (IOException e) {
				Core.getLogger(LOGNODE).error("Couldn't determine filesize of FileDocument '" + document.getId());
			}
		}

		return size;
	}
	
	public static String readStringFromURL(String requestURL) throws IOException
	{
	    try (Scanner scanner = new Scanner(new URL(requestURL).openStream(),
	            StandardCharsets.UTF_8.toString()))
	    {
	        scanner.useDelimiter("\\A");
	        return scanner.hasNext() ? scanner.next() : "";
	    }
	}
		
	public static String stringFromFile(IContext context, FileDocument source) throws IOException
	{
		if (source == null)
			return null;
		try (
			InputStream f = Core.getFileDocumentContent(context, source.getMendixObject());
		) {
			return IOUtils.toString(f, StandardCharsets.UTF_8);
		}
	}

	public static void stringToFile(IContext context, String value, FileDocument destination) throws IOException	{
		if (destination == null)
			throw new IllegalArgumentException("Destination file is null");
		if (value == null)
			throw new IllegalArgumentException("Value to write is null");

		try (
			InputStream is = IOUtils.toInputStream(value, StandardCharsets.UTF_8)
		) {
			Core.storeFileDocumentContent(context, destination.getMendixObject(), is);
		}
	}
}
