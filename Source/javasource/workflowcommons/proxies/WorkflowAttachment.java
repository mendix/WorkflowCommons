// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class WorkflowAttachment extends system.proxies.FileDocument
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.WorkflowAttachment";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		FileID("FileID"),
		Name("Name"),
		DeleteAfterDownload("DeleteAfterDownload"),
		Contents("Contents"),
		HasContents("HasContents"),
		Size("Size"),
		WorkflowAttachment_WorkflowInstance("WorkflowCommons.WorkflowAttachment_WorkflowInstance");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WorkflowAttachment(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowCommons.WorkflowAttachment"));
	}

	protected WorkflowAttachment(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject workflowAttachmentMendixObject)
	{
		super(context, workflowAttachmentMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("WorkflowCommons.WorkflowAttachment", workflowAttachmentMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowCommons.WorkflowAttachment");
	}

	/**
	 * @deprecated Use 'WorkflowAttachment.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommons.proxies.WorkflowAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommons.proxies.WorkflowAttachment.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowcommons.proxies.WorkflowAttachment initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.WorkflowAttachment(context, mendixObject);
	}

	public static workflowcommons.proxies.WorkflowAttachment load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.WorkflowAttachment.initialize(context, mendixObject);
	}

	public static java.util.List<workflowcommons.proxies.WorkflowAttachment> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<workflowcommons.proxies.WorkflowAttachment> result = new java.util.ArrayList<workflowcommons.proxies.WorkflowAttachment>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//WorkflowCommons.WorkflowAttachment" + xpathConstraint))
			result.add(workflowcommons.proxies.WorkflowAttachment.initialize(context, obj));
		return result;
	}

	/**
	 * @return value of WorkflowAttachment_WorkflowInstance
	 */
	public final system.proxies.WorkflowInstance getWorkflowAttachment_WorkflowInstance() throws com.mendix.core.CoreException
	{
		return getWorkflowAttachment_WorkflowInstance(getContext());
	}

	/**
	 * @param context
	 * @return value of WorkflowAttachment_WorkflowInstance
	 */
	public final system.proxies.WorkflowInstance getWorkflowAttachment_WorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		system.proxies.WorkflowInstance result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.WorkflowAttachment_WorkflowInstance.toString());
		if (identifier != null)
			result = system.proxies.WorkflowInstance.load(context, identifier);
		return result;
	}

	/**
	 * Set value of WorkflowAttachment_WorkflowInstance
	 * @param workflowattachment_workflowinstance
	 */
	public final void setWorkflowAttachment_WorkflowInstance(system.proxies.WorkflowInstance workflowattachment_workflowinstance)
	{
		setWorkflowAttachment_WorkflowInstance(getContext(), workflowattachment_workflowinstance);
	}

	/**
	 * Set value of WorkflowAttachment_WorkflowInstance
	 * @param context
	 * @param workflowattachment_workflowinstance
	 */
	public final void setWorkflowAttachment_WorkflowInstance(com.mendix.systemwideinterfaces.core.IContext context, system.proxies.WorkflowInstance workflowattachment_workflowinstance)
	{
		if (workflowattachment_workflowinstance == null)
			getMendixObject().setValue(context, MemberNames.WorkflowAttachment_WorkflowInstance.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.WorkflowAttachment_WorkflowInstance.toString(), workflowattachment_workflowinstance.getMendixObject().getId());
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommons.proxies.WorkflowAttachment that = (workflowcommons.proxies.WorkflowAttachment) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "WorkflowCommons.WorkflowAttachment";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}