package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(mendixsso.actions.CalculateOpenIDFromUUID.class);
    registrator.registerUserAction(mendixsso.actions.DecryptString.class);
    registrator.registerUserAction(mendixsso.actions.EncryptString.class);
    registrator.registerUserAction(mendixsso.actions.ExtractUUIDFromOpenID.class);
    registrator.registerUserAction(mendixsso.actions.FindOrCreateUserWithUserInfo.class);
    registrator.registerUserAction(mendixsso.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(mendixsso.actions.GetTokenEndpointURI.class);
    registrator.registerUserAction(mendixsso.actions.GetUserInfoEndpointURI.class);
    registrator.registerUserAction(mendixsso.actions.GetUserProfileFromUserInfoJSON.class);
    registrator.registerUserAction(mendixsso.actions.InitializeUserMapper.class);
    registrator.registerUserAction(mendixsso.actions.LogOutUser.class);
    registrator.registerUserAction(mendixsso.actions.StartSignOnServlet.class);
    registrator.registerUserAction(objecthandling.actions.clone.class);
    registrator.registerUserAction(objecthandling.actions.commitInSeparateDatabaseTransaction.class);
    registrator.registerUserAction(objecthandling.actions.copyAttributes.class);
    registrator.registerUserAction(objecthandling.actions.createObjectListFromObject.class);
    registrator.registerUserAction(objecthandling.actions.deepClone.class);
    registrator.registerUserAction(objecthandling.actions.deleteAll.class);
    registrator.registerUserAction(objecthandling.actions.deleteInSeparateTransaction.class);
    registrator.registerUserAction(objecthandling.actions.deleteWithoutEvents.class);
    registrator.registerUserAction(objecthandling.actions.EndTransaction.class);
    registrator.registerUserAction(objecthandling.actions.getCreatedByUser.class);
    registrator.registerUserAction(objecthandling.actions.getGUID.class);
    registrator.registerUserAction(objecthandling.actions.getLastChangedByUser.class);
    registrator.registerUserAction(objecthandling.actions.getOriginalValueAsString.class);
    registrator.registerUserAction(objecthandling.actions.getTypeAsString.class);
    registrator.registerUserAction(objecthandling.actions.memberHasChanged.class);
    registrator.registerUserAction(objecthandling.actions.objectHasChanged.class);
    registrator.registerUserAction(objecthandling.actions.refreshClassByObject.class);
    registrator.registerUserAction(objecthandling.actions.StartTransaction.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
    registrator.registerUserAction(taskqueuehelpers.actions.GetProcessedQueueCount.class);
    registrator.registerUserAction(taskqueuehelpers.actions.GetQueueCounts.class);
    registrator.registerUserAction(taskqueuehelpers.actions.MapToChartParameters.class);
    registrator.registerUserAction(unittesting.actions.FindAllUnitTests.class);
    registrator.registerUserAction(unittesting.actions.ReportStepJava.class);
    registrator.registerUserAction(unittesting.actions.RunAllUnitTestsWrapper.class);
    registrator.registerUserAction(unittesting.actions.RunUnitTest.class);
    registrator.registerUserAction(unittesting.actions.StartRemoteApiServlet.class);
    registrator.registerUserAction(unittesting.actions.StartRunAllSuites.class);
    registrator.registerUserAction(unittesting.actions.ThrowAssertionFailed.class);
  }
}
