// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.FeedbackHelper;
import com.mendix.systemwideinterfaces.core.UserAction;

/**
 * Refreshes a certain domain object type in the client. Useful to enforce a datagrid to refresh for example.
 * 
 * - instance : This object is used to identify the type of objects that need to be refreshed. For example passing $currentUser will refresh all System.Account's.
 */
public class refreshClassByObject extends UserAction<java.lang.Boolean>
{
	private final IMendixObject instance;

	public refreshClassByObject(
		IContext context,
		IMendixObject _instance
	)
	{
		super(context);
		this.instance = _instance;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		if (instance != null) {
		    FeedbackHelper.addRefreshClass(this.getContext(), instance.getType());
		}
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "refreshClassByObject";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
