## Release 4.0.1

* We included the OSS clearance report and license file in the module package.

_______

## Release 4.0.0

* We upgraded the module to Mendix 11.0.0-beta.2
* We introduced a new View Entity `WorkflowUserTaskView`, for unified access to user tasks regardless of whether these tasks are in progress or completed. For more information, refer to the Workflow Commons module documentation.
* We removed the state change events microflows `OCh_Workflow_State` and `OCh_WorkflowUserTask_State`, since state-change events are removed in Mendix 11.
* We removed the assignee and key migration microflows that were introduced in version 3.0.0 and 3.6.0 respectively and are no longer applicable. See the first note for more details.
* We added migration logic to perform a one-off migration of your existing data. When using Workflow Commons and upgrading your app to Mendix 11, it is required to perform this migration and update your app accordingly. See the second note for more details.
* We added an icon next to targeted/assigned users to indicate when a user is inactive, only visible for administrators.
* We replaced the List View for displaying assignees with a Data Grid 2 reference set supported feature.
* We fixed an issue where the overdue time was displayed incorrectly in the timeline.
* We updated Atlas Core module compatibility to v3.17.0
* We updated Atlas Web Content module compatibility to v3.8.0
* We updated Data Widgets module compatibility to v2.31.0

Note: When upgrading to v4.0.0 or above, make sure that you are currently using Workflow Commons v3.6.0 or above. If you are using an earlier version, first upgrade to any version between v3.6.0 and (but not including) v4.0.0, using a Mendix 10 version. Perform the required key and/or assignee migrations for all your environments. Any required migration will be shown in the WorkflowAdminCenter page. 

Note: As a result of upgrading to Mendix 11, the microflows and snippets that previously used the `WorkflowCommons.UserTaskView` entity have been replaced with documents that uses `WorkflowCommons.WorkflowUserTaskView` or `System.WorkflowEndedUserTask` as a parameter. If you are using one or more of them in your project, see the list below for replacement. Also, in case you have any logic based on the `WorkflowCommons.UserTaskView` entity, make sure to adapt this accordingly.

Microflows:
* ACT_UserTaskView_ShowUserTask Page → replace with ACT_WorkflowUserTaskView_ShowUserTaskPage
* ACT_UserTaskView_ShowWorkflowAdminPage → replace with ACT_WorkflowUserTaskView_ShowDefaultAdminPage
* ACT_WorkflowView_ShowWorkflowAdminPage → replace with  ACT_Workflow_ShowWorkflowAdminPage

Snippets:
* Snip_UserTaskView_Assignees → replace with Snip_WorkflowUserTaskView_Assignees 
* Snip_UserTaskView_Assignees_Aggregated → replace with Snip_WorkflowUserTaskView_Assignees 
* Snip_UserTaskView_Details → replace with Snip_WorkflowUserTaskView_Details
* Snip_UserTaskView_Header → replace with Snip_UserTask_Header or Snip_WorfkflowEndedUserTask_Header
* Snip_UserTaskView_IncompatibleWarning → replace with Snip_WorkflowUserTaskView_IncompatibleWarning
* Snip_UserTaskView_NameColumn → replace with Snip_WorkflowUserTaskView_NameColumn 
* Snip_UserTaskView_NameColumnWithIcon → replace with Snip_WorkflowUserTaskView_NameColumnWithIcon 
* Snip_UserTaskView_State → replace with Snip_WorkflowUserTaskView_State
* Snip_UserTaskView_TargetUsers → replace with Snip_UserTask_TargetUsers or Snip_WorkflowEndedUserTask_TargetUsers
* Snip_WorkflowView_ActivityTimeline → replace with Snip_Workflow_ActivityTimeline
* Snip_WorkflowView_ActivityTimelineOnly_Full → replace with Snip_Workflow_ActivityTimelineOnly_Full
* Snip_WorkflowView_ActivityTimelineOnly_Tasks → replace with Snip_Workflow_ActivityTimelineOnly_Tasks
* Snip_WorkflowView_AuditTrail → replace with Snip_Workflow_AuditTrail 
* Snip_WorkflowView_CommentsAndAttachments → replace with Snip_Workflow_CommentsAndAttachments
* Snip_WorkflowView_CommentsAndAttachments_Admin → replace with Snip_Workflow_CommentsAndAttachments_Admin
* Snip_WorkflowView_CompletedTaskDetails → replace with Snip_Workflow_TaskDetails
* Snip_WorkflowView_Detail → replace with Snip_Workflow_Detail 
* Snip_WorkflowView_Header → replace with Snip_Workflow_Header 
* Snip_WorkflowView_NotificationArea → replace with Snip_Workflow_NotificationArea
* Snip_WorkflowView_State → replace with Snip_Workflow_State
* Snip_WorkflowView_StateCircleOnly → replace with Snip_Workflow_StateCircleOnly 
* Snip_WorkflowView_TaskTimeline → replace with Snip_Workflow_TaskTimeline
* Snip_WorkflowView_TaskTimeline_WithoutNameandDescription → replace with Snip_Workflow_TaskTimeline_WithoutName
* Snip_WorkflowView_TaskTimelineOnly → replace with Snip_Workflow_TaskTimelineOnly

_______

## Release 3.12.1

* We changed the length of the `Reason` attribute in the `WorkflowAuditTrailRecord` entity to unlimited.
* We fixed the warnings in the module where applicable.

_______

## Release 3.12.0

* We upgraded the module to Mendix 10.17.0 
* We updated Data Widgets module compatibility to v2.28.1
* We fixed an issue where the `Reason` field was not displayed for `Paused` workflow instances after locking a workflow definition. We updated the conditional visibility to show the `Reason` field if available, regardless of the workflow state.
* We fixed an issue where switching between the `Minimal`, `Default` and `All` views did not work correctly for the Audit Trail.
* We added compatibility for changes in the System module that were introduced with Mendix 10.17.0

_______

## Release 3.11.0

* We added 'Manage task assignments' page. This page provides the workflow administrator the ability to manage the assignment and targeting of user tasks based on a selected user. This is typically done when a user is leaving the organization or a group/role.
* We updated Data Widgets module compatibility to v2.26.0

_______

## Release 3.10.0

* We added a constant `DueDateExpirationInDays` to configure the period in days for which the workflows/user tasks are to be considered almost due. 
* We added visual indicators that indicates workflows/user tasks that are almost due based on the constant `DueDateExpirationInDays` or overdue in pages `Task Inbox`, `Task Dashboard`, `Default Workflow Admin` and `Workflow Definition View`. 
* We added `Due in x day(s)` counters to the `Workflow Dashboard` for workflows/user tasks. Where the value of `x` is the `DueDateExpirationInDays` constant value.
* We fixed a bug in the calculation of the overdue counters in the `Workflow Dashboard`.

_______

## Release 3.9.0

* We upgraded the module to Mendix 10.14.0
* We replaced the usage of the `WorkflowWaitForTimer` image with the `WorkflowTimer` image.
* We added compatibility for changes in the System module that were introduced with Mendix 10.14.0.

_______

## Release 3.8.1

* We fixed an issue in the Task Inbox and Task Dashboard pages where the ‘Assignee(s)' column did not display the Assignee name(s).

_______

## Release 3.8.0

* We upgraded the module to Mendix 10.12.0
* We updated Data Widgets module compatibility to v2.21.2
* We added an option to select if you want to keep the target users or re-run user targeting when retrying a workflow that has a failed user task.
* We added a confirmation pop-up to all actions in the Workflow Admin page.
* We added the microflows ‘ACT_UserTask_AssignToUser’ and ‘ACT_UserTask_AssignToUsers' to the ‘Use me’ folder, that can be used to assign user(s) to a user task. The 'ACT_UserTask_AssignToUsers’ microflow is only applicable for multi-user tasks.

_______

## Release 3.7.0

* We added a scheduled event to clean-up expired audit trail logs. Refer to module documentation for more details and how to set it up.
* We fixed inconsistent log node names.

_______

## Release 3.6.0

* We introduced the audit trail feature to track all events and actions that have taken place in the workflows in your application. Refer to the module documentation for more details on how to configure a workflow event handler for audit trails.
* We added a key attribute to WorkflowView and UserTaskView entities, that uniquely identifies the workflow and user task instances. The value is helpful for correlating audit trail data to the related workflow or user task.

Note: If you want to add the keys to existing WorkflowView and UserTaskView data you need to run a migration, you can either:  
* Use the migration microflow 'ACT_Key_Migrate' (also added to the 'WorkflowAdminCenter' page), or:
* Add the 'ASu_Key_Migrate' microflow to the project's after startup microflow.

_______

## Release 3.5.0

* We added support for React client, introduced as public beta in Mendix 10.7.0. As part of this, we updated all dropdown and reference selector widgets to the new Combo Box widget. 
* We updated Atlas Core module compatibility to v3.14.2 to replace the Static image widget with the Image widget.
* We updated Data Widgets module compatibility to v2.20.0  
* We updated Charts widget compatibility to v5.0.0

Notes:
* Make sure that you have the Combo Box widget installed in your project. If you do not already have it, you can download it from the marketplace. 
* When importing the module in Mendix 10.6.0 or above, you might get consistency error CE6087 for renamed design properties. Right-click and update all renamed design properties in the project.

_______

## Release 3.4.0

* We upgraded the module to Mendix 10.11.0
* We added support for new attribute CanApplyJumpTo that was introduced in Mendix 10.11.0 that indicates whether it is allowed to apply a jump-to option to the workflow in its current state.
* We fixed a bug where Paused user tasks where not displayed with the correct state in the activity timeline.
* We fixed an issue where navigating to the Workflow dashboard page would raise an error when using Postgres as the database.
* We removed the unused charts configuration file from the module.
* We updated Data Widgets compatibility to v2.19.1

_______

## Release 3.3.1

* We fixed an issue in the “TaskDashboard“ page where “My open tasks” and "All open tasks” kept displaying multi-user tasks even after the “current user” selected an outcome and no longer can access them.

Known issues:
* The activity timeline might show the 'Merge of parallel split' activity in the wrong position (incorrect sort order). This will be fixed in a future release of Studio Pro.

_______

## Release 3.3.0

* We upgraded the module to Mendix 10.6.0
* We added a new activity timeline based on the Retrieve workflow activity records microflow action. The new activity timeline is available on the DefaultWorkflowAdmin page and Workflow_Admin page template.
* We replaced the activity timeline in the UserTask_Extended page template and the My initiated workflows page with a timeline similar to the new activity timeline on the Workflow Admin page. The difference is that we only show user tasks and multi-user tasks. The other activities are filtered out from these views.
* We added the Wait for timer activity (icon) to the Jump-to pop-up
* We updated Atlas Web Content compatibility to 3.4.1
* We updated Data Widgets compatibility to v2.11.0

Known issues:
* The activity timeline might show the 'Merge of parallel split' activity in the wrong position (incorrect sort order). This will be fixed in a future release of Studio Pro.

_______

## Release 3.2.0

* We upgraded the module to Mendix 10.3.0
* You can now delete an obsolete workflow definition in the 'Workflow management' page
* We introduced a new wizard to clean-up completed and aborted workflows, you can find this option in the 'Possible actions' menu of the 'Workflow details' page
* We now use the Gallery widget in the 'My initiated workflows' page
* We removed dependency on the 'List view controls' widget
* We added support for the new multi-user task decision method (Microflow)

_______

## Release 3.1.1

* We upgraded the module to Mendix 10.1.0
* We fixed consistency errors 'CE0115' raised on 'Assign' button in 'UserTask_Assign' page due to the new Microflow arguments functionality

_______

## Release 3.1.0

* We upgraded the module to Mendix 10.0.0
* We added support for new multi-user task decision methods (Majority, Threshold)
* We changed the way target users are displayed on the workflow admin page so that it is consistent with the list of assignees
* We changed the way the decision method is retrieved on the workflow admin page

_______

## Release 3.0.0

* We upgraded the module to Mendix 10.0.0-beta2
* We added support for multi-user tasks
* With the introduction of multi-user tasks, assignees are now a reference set. If you used Workflow Commons in your project before and have existing data on user tasks, you will need to migrate your existing assignee data in Workflow Commons. Note: you can only upgrade data from Workflow Commons v2.4.0 or higher, if you currently use a version of WFC before this version, please upgrade to WFC v2.4.0 or higher first. To run the migration, you can either: 
  * Use the migration microflow 'ACT_Assignee_Migration' (also added to the 'WorkflowAdminCenter' page), or:
  * Add the 'ASu_Assignee_Migrate' microflow to the project's after startup microflow to transfer to the new association 'UserTaskView_Assignees'.
* The 'UserTaskView_Assignee' association is deprecated, please use the 'UserTaskView_Assignees' association instead. See the note regarding multi-user tasks above.
* We added support for lock/unlock; you can now lock or unlock a workflow definition from the Workflow Management page. If a workflow definition is locked, no new instances of this workflow can be created. When you lock/unlock a workflow definition, you can choose to pause/unpause the running workflow instances.

_______

## Release 2.6.0

* We upgraded the module to Mendix 9.24.0
* We updated Atlas Web Content compatability to v3.4.1
* We updated Atlas Core compatability to v3.12.3

_______

## Release 2.5.0

* We upgraded the module to Mendix 9.20.0
* Starting with Mendix 9.20.0, you can disable the auto-assignment of users when opening a user task. We updated the user task page templates to include the message "You can only complete a task when you are the assigned user" that is displayed when you open a user task page and you are not the assigned user for this user task
* We optimized the 'Refresh' action that is used in the Task Inbox page. For this action we now use the 'Refresh entity' action that is available in the Nanoflow Commons module. This module is included by default when starting a new app. If your app currently does not include the Nanoflow Commons module, please make sure to import Nanoflow Commons from the marketplace when upgrading to v2.5.0 of Workflow Commons

_______

## Release 2.4.0

* We upgraded the module to Mendix 9.19.0
* Attachments outside the scope of a comment now need to be part of your own domain model, and should be associated to the context entity of the Workflow. This is required so you can configure the applicable security settings, since the context of a specific. Workflow is not known in advance in Workflow Commons
    * In Studio, attachments can be added using the ‘File’ property in the Workflow wizard
    * In Studio Pro, attachments can be added using a specialization of System.FileDocument
* As a result: Attachments in Workflow Commons are now (an optional) part of comments. A migration microflow is provided that will create a comment for every workflow instance and link all its existing attachments. If your app requires migration, this option will be shown in the Workflow Admin Center. Until the migration has been executed, existing comments and attachments will not be visible in any of the included pages and snippets. Make sure to create a backup of your data before you execute the migration
* To increase the security of your app we updated the access rules for the WorkflowComment and WorkflowAttachment entities. Users can now only read comments and attachment for the workflows in which they are involved, i.e. they are either a targeted or assigned user in at least one user task of that workflow instance. Users can add new comments and/or attachments and update or delete their own comments as long as the Workflow is ‘In Progress’
* We added support for subworkflows in the Workflow Admin page and page template: whenever a workflow was called from a parent workflow, this is shown in the page header
* We updated the icons that are used in the ‘Jump to Activity’ pop-up

_______

## Release 2.3.1

* We updated Charts module compatibility to version 3.0.1

_______

## Release 2.1.3

* We updated the admin actions in the Workflow Admin page. Failed workflows can now be aborted.

_______

## Release 2.3.0

* We have introduced Jump-to action. For more details on this, please visit https://docs.mendix.com/refguide/jump-to/
* We moved the Workflow Definition View page from Workflow dashboard to Workflow management
* We updated Charts module compatibility to version 3.0.0
* We updated Data Widgets module compatibility to version 2.5.4

_______

## Release 2.2.1

* We fixed the consistency errors raised on Charts widgets for apps created in Mx 9.16.1 with workflows enabled
* We updated Charts module compatibility to version 3.0.0
* We upgraded the module to Mx 9.16.1

_______

## Release 2.2.0

* We updated the admin actions in the Workflow Admin page. Failed workflows can now be aborted.
* We improved user targeting and assignment in the 'Task details' tab of the Workflow Admin page. You can now manage target users from the Workflow Admin page.
* We updated Data Widgets module compatibility to version 2.5.3

_______

## Release 2.1.2

* We updated Data Widgets module compatibility to version 2.5.0

_______

## Release 2.1.1

* We fixed a bug in the 'My Initiated Workflows' page, where the workflow state was not refreshed after withdrawing a workflow
* We improved the error message that is displayed when the required state change event microflows have not been configured in the App Settings

_______

## Release 2.1.0

* We updated the module to make use of state change events for Workflow, introduced in Mendix 9.12.0. This version of Workflow Commons requires Mendix 9.12.0 or higher.

* In this version, the following elements are re-introduced:

    * ‘Task Dashboard’ page and template
    * ‘My Initiated Workflows’ page and template
    * ‘Activity Timeline’ snippets
    * Metrics related to completed tasks from the Workflow Dashboard
* This version requires the set-up of event microflows in your App Settings. Please make sure to follow the steps in the 'Readme' snippet included in the module.

_______

## Release 2.0.1

* We updated the Data Widgets module to version 2.3.0

_______

## Release 2.0.0

* We updated the module for the Workflow changes introduced in Mendix 9.10.0. This version of Workflow Commons requires Mendix 9.10.0 or higher.

    * Removed the ‘Task Dashboard’ page and template
    * Removed the ‘My Initiated Workflows’ page and template
    * Removed the ‘Activity Timeline’ snippets
    * Removed the tabs and columns related to completed tasks from the Task Inbox
    * Removed metrics related to completed tasks from the Workflow Dashboard
    * Updated the Data Widgets module to v2.2.2
* The removed pages and snippets will be re-introduced in later releases of Workflow Commons and starter templates.

_______

## Release 1.4.1

* Updated Data Widgets module compatibility to version 2.1.1

_______

## Release 1.4.0

* Updated support for DataWidgets 2.0.2
* Fixed showing wrongfully 'Unassigned' when the Account object has an empty FullName attribute
* Updated support for administration module V2.0.1

_______

## Release 1.3.0

* Upgraded to Mendix 9.6
* Added change state actions to admin pages. See also Mendix 9.6 release notes Change State action.
* Removed Mendix SSO dependency, Workflow Commons now relies on the Administration module for account details
* Fixed a data retrieval bug on the task dashboard page
* Renamed usage of "Instance" as the system module workflow entities since 9.6 will not append that anymore
* Breaking changes:

    * The module now requires the Administration module
    * The module now relies on DataWidgets instead of DataGrid as Data Grid 2 has moved to that new module https://docs.mendix.com/appstore/modules/data-widgets

_______

## Release 1.2.2

* Fixed breaking changes that DG2 v1.2.0 introduced for enum search filters. Used on our workflow instance overviews.

_______

## Release 1.2.1

* Updated data grid 2 included widgets to prevent consistency errors.
* It is strongly advised to update your Data grid 2 module to version 1.2.0+

_______

## Release 1.2.0

* Updated minimum required Mendix version to 9.3.0
* Fixed minor dashboard overdue workflow and usertask bug where it did not include all overdue items.
* Implemented redesign of timeline to be more helpful
    * It now shows the outcome
    * Is a bit more dense
    * And handles unassigned tasks more elegantly
* Added new "My initiated workflows" page, that gives the initiator of a workflow an overview of their initiated workflows
* Added new "My initiated workflows" page template, similair to the previous item
* The my initiated workflows also comes with a withdraw workflow option which lets the initiator abort workflows they initiated if they are still in progress
* Updated dashboard time period filters to now include this year and last 3 months
* Added task inbox refresh button

_______

## Release 1.1.0

* It is now possible to add context information to task inbox grids on the admin page and the task inbox page
* The badge that shows workflow and task instance state no longer renders as a bunch of elements in wysiwyg view and now uses brand colors via dynamic classes
* On the user task page and workflow admin page, the notification box is moved to the sidebar and uses brand colors via classes
* The Workflow TaskDashboard and Workflow TaskInbox page templates now contain preview screenshots when selecting them to create a page
* The generated workflow admin page now contains save and cancel buttons
* As a process admin it is now possible to unassign and (re-)assign to target users
* We refactored the TaskDashboard and WorkflowDashboard datasource logic to optimize performance
* We cleaned up warnings that were a direct cause of logic in the module, the remaining warnings are part of the used widgets
* Fixed an alignment issue on the task inbox pages
* Fixed an access issue with user names on the activity timeline
* For each user task, the selected outcome (if applicable) is now visible in the activity timeline.

_______