// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class TaskSummary implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject taskSummaryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.TaskSummary";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NumberOfTasksOverdue("NumberOfTasksOverdue"),
		NumberOfTasksInProgress("NumberOfTasksInProgress"),
		NumberOfTasksFailed("NumberOfTasksFailed"),
		NumberOfTasksCompleted("NumberOfTasksCompleted"),
		TaskAverageHandlingTime("TaskAverageHandlingTime"),
		TasksHandledInTime("TasksHandledInTime"),
		DashboardContext_TaskSummary("WorkflowCommons.DashboardContext_TaskSummary");

		private final java.lang.String metaName;

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

	public TaskSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected TaskSummary(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskSummaryMendixObject)
	{
		if (taskSummaryMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, taskSummaryMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.taskSummaryMendixObject = taskSummaryMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static workflowcommons.proxies.TaskSummary initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.TaskSummary(context, mendixObject);
	}

	public static workflowcommons.proxies.TaskSummary load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.TaskSummary.initialize(context, mendixObject);
	}

	/**
	 * @return value of NumberOfTasksOverdue
	 */
	public final java.lang.Integer getNumberOfTasksOverdue()
	{
		return getNumberOfTasksOverdue(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksOverdue
	 */
	public final java.lang.Integer getNumberOfTasksOverdue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksOverdue.toString());
	}

	/**
	 * Set value of NumberOfTasksOverdue
	 * @param numberoftasksoverdue
	 */
	public final void setNumberOfTasksOverdue(java.lang.Integer numberoftasksoverdue)
	{
		setNumberOfTasksOverdue(getContext(), numberoftasksoverdue);
	}

	/**
	 * Set value of NumberOfTasksOverdue
	 * @param context
	 * @param numberoftasksoverdue
	 */
	public final void setNumberOfTasksOverdue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksoverdue)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksOverdue.toString(), numberoftasksoverdue);
	}

	/**
	 * @return value of NumberOfTasksInProgress
	 */
	public final java.lang.Integer getNumberOfTasksInProgress()
	{
		return getNumberOfTasksInProgress(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksInProgress
	 */
	public final java.lang.Integer getNumberOfTasksInProgress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksInProgress.toString());
	}

	/**
	 * Set value of NumberOfTasksInProgress
	 * @param numberoftasksinprogress
	 */
	public final void setNumberOfTasksInProgress(java.lang.Integer numberoftasksinprogress)
	{
		setNumberOfTasksInProgress(getContext(), numberoftasksinprogress);
	}

	/**
	 * Set value of NumberOfTasksInProgress
	 * @param context
	 * @param numberoftasksinprogress
	 */
	public final void setNumberOfTasksInProgress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksinprogress)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksInProgress.toString(), numberoftasksinprogress);
	}

	/**
	 * @return value of NumberOfTasksFailed
	 */
	public final java.lang.Integer getNumberOfTasksFailed()
	{
		return getNumberOfTasksFailed(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksFailed
	 */
	public final java.lang.Integer getNumberOfTasksFailed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksFailed.toString());
	}

	/**
	 * Set value of NumberOfTasksFailed
	 * @param numberoftasksfailed
	 */
	public final void setNumberOfTasksFailed(java.lang.Integer numberoftasksfailed)
	{
		setNumberOfTasksFailed(getContext(), numberoftasksfailed);
	}

	/**
	 * Set value of NumberOfTasksFailed
	 * @param context
	 * @param numberoftasksfailed
	 */
	public final void setNumberOfTasksFailed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksfailed)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksFailed.toString(), numberoftasksfailed);
	}

	/**
	 * @return value of NumberOfTasksCompleted
	 */
	public final java.lang.Integer getNumberOfTasksCompleted()
	{
		return getNumberOfTasksCompleted(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksCompleted
	 */
	public final java.lang.Integer getNumberOfTasksCompleted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksCompleted.toString());
	}

	/**
	 * Set value of NumberOfTasksCompleted
	 * @param numberoftaskscompleted
	 */
	public final void setNumberOfTasksCompleted(java.lang.Integer numberoftaskscompleted)
	{
		setNumberOfTasksCompleted(getContext(), numberoftaskscompleted);
	}

	/**
	 * Set value of NumberOfTasksCompleted
	 * @param context
	 * @param numberoftaskscompleted
	 */
	public final void setNumberOfTasksCompleted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftaskscompleted)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksCompleted.toString(), numberoftaskscompleted);
	}

	/**
	 * @return value of TaskAverageHandlingTime
	 */
	public final java.math.BigDecimal getTaskAverageHandlingTime()
	{
		return getTaskAverageHandlingTime(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskAverageHandlingTime
	 */
	public final java.math.BigDecimal getTaskAverageHandlingTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TaskAverageHandlingTime.toString());
	}

	/**
	 * Set value of TaskAverageHandlingTime
	 * @param taskaveragehandlingtime
	 */
	public final void setTaskAverageHandlingTime(java.math.BigDecimal taskaveragehandlingtime)
	{
		setTaskAverageHandlingTime(getContext(), taskaveragehandlingtime);
	}

	/**
	 * Set value of TaskAverageHandlingTime
	 * @param context
	 * @param taskaveragehandlingtime
	 */
	public final void setTaskAverageHandlingTime(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal taskaveragehandlingtime)
	{
		getMendixObject().setValue(context, MemberNames.TaskAverageHandlingTime.toString(), taskaveragehandlingtime);
	}

	/**
	 * @return value of TasksHandledInTime
	 */
	public final java.math.BigDecimal getTasksHandledInTime()
	{
		return getTasksHandledInTime(getContext());
	}

	/**
	 * @param context
	 * @return value of TasksHandledInTime
	 */
	public final java.math.BigDecimal getTasksHandledInTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.TasksHandledInTime.toString());
	}

	/**
	 * Set value of TasksHandledInTime
	 * @param taskshandledintime
	 */
	public final void setTasksHandledInTime(java.math.BigDecimal taskshandledintime)
	{
		setTasksHandledInTime(getContext(), taskshandledintime);
	}

	/**
	 * Set value of TasksHandledInTime
	 * @param context
	 * @param taskshandledintime
	 */
	public final void setTasksHandledInTime(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal taskshandledintime)
	{
		getMendixObject().setValue(context, MemberNames.TasksHandledInTime.toString(), taskshandledintime);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of DashboardContext_TaskSummary
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_TaskSummary() throws com.mendix.core.CoreException
	{
		return getDashboardContext_TaskSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_TaskSummary
	 * @throws com.mendix.core.CoreException
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommons.proxies.DashboardContext result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_TaskSummary.toString());
		if (identifier != null) {
			result = workflowcommons.proxies.DashboardContext.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(workflowcommons.proxies.DashboardContext dashboardcontext_tasksummary)
	{
		setDashboardContext_TaskSummary(getContext(), dashboardcontext_tasksummary);
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param context
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context, workflowcommons.proxies.DashboardContext dashboardcontext_tasksummary)
	{
		if (dashboardcontext_tasksummary == null) {
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), dashboardcontext_tasksummary.getMendixObject().getId());
		}
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return taskSummaryMendixObject;
	}

	@Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final workflowcommons.proxies.TaskSummary that = (workflowcommons.proxies.TaskSummary) obj;
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
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}