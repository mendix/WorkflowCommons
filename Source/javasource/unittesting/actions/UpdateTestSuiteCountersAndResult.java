// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package unittesting.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import unittesting.TestManager;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.UserAction;

public class UpdateTestSuiteCountersAndResult extends UserAction<java.lang.Void>
{
	/** @deprecated use testSuite.getMendixObject() instead. */
	@java.lang.Deprecated(forRemoval = true)
	private final IMendixObject __testSuite;
	private final unittesting.proxies.TestSuite testSuite;

	public UpdateTestSuiteCountersAndResult(
		IContext context,
		IMendixObject _testSuite
	)
	{
		super(context);
		this.__testSuite = _testSuite;
		this.testSuite = _testSuite == null ? null : unittesting.proxies.TestSuite.initialize(getContext(), _testSuite);
	}

	@java.lang.Override
	public java.lang.Void executeAction() throws Exception
	{
		// BEGIN USER CODE
		TestManager.instance().updateTestSuiteCountersAndResult(getContext(), testSuite, true);
		return null;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 * @return a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "UpdateTestSuiteCountersAndResult";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
