// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package expenserequestexample.proxies;

public class FinanceControllerApproveExpenseWFUserTask extends system.proxies.WorkflowUserTask
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Description("Description"),
		StartTime("StartTime"),
		DueDate("DueDate"),
		EndTime("EndTime"),
		Outcome("Outcome"),
		State("State"),
		Reason("Reason"),
		WorkflowUserTask_TargetUsers("System.WorkflowUserTask_TargetUsers"),
		WorkflowUserTask_Assignee("System.WorkflowUserTask_Assignee"),
		WorkflowUserTask_Workflow("System.WorkflowUserTask_Workflow"),
		WorkflowUserTask_WorkflowUserTaskDefinition("System.WorkflowUserTask_WorkflowUserTaskDefinition");

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

	public FinanceControllerApproveExpenseWFUserTask(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask"));
	}

	protected FinanceControllerApproveExpenseWFUserTask(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject financeControllerApproveExpenseWFUserTaskMendixObject)
	{
		super(context, financeControllerApproveExpenseWFUserTaskMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask", financeControllerApproveExpenseWFUserTaskMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask");
	}

	/**
	 * @deprecated Use 'FinanceControllerApproveExpenseWFUserTask.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask(context, mendixObject);
	}

	public static expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask.initialize(context, mendixObject);
	}

	public static java.util.List<expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask> result = new java.util.ArrayList<expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask" + xpathConstraint))
			result.add(expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask.initialize(context, obj));
		return result;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask that = (expenserequestexample.proxies.FinanceControllerApproveExpenseWFUserTask) obj;
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
		return "ExpenseRequestExample.FinanceControllerApproveExpenseWFUserTask";
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