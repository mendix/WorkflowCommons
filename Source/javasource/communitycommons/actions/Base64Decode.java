// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import communitycommons.StringUtils;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Converts a base64 encoded string to the plain, original string
 */
public class Base64Decode extends UserAction<java.lang.String>
{
	private final java.lang.String encoded;

	public Base64Decode(
		IContext context,
		java.lang.String _encoded
	)
	{
		super(context);
		this.encoded = _encoded;
	}

	@java.lang.Override
	public java.lang.String executeAction() throws Exception
	{
		// BEGIN USER CODE
		return StringUtils.base64Decode(encoded);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Base64Decode";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
