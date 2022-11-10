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