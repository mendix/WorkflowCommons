---
title: "Workflow Commons"
#parent: "Modules: https://docs.mendix.com/appstore/modules/"
#menu_order: 300
#description: "Describes usage and implementation of companion module Workflow Commons, to be used with Workflows"
#tags: ["Workflow","Workflow Commons","Module","Workflow Commons Implementation"]
---

## 1 Introduction

The Workflow commons module provides an out of the box starter experience for anyone that would like to build a workflow in their application.

### 1.1 Typical Use Cases

This module allows Mendix developers with little to no experience in building workflows to start with standardized options for implementing and monitoring workflows.

### 1.2 Features

* Dashboards for monitoring workflows, for administrators, initiators and executors of workflows
* Page templates to generate task pages, task admin, an inbox and several different dashboards
* Attachments layer on top of workflows
* Comments section to use with workflows

### 1.3 Limitations

* Requires Mendix SSO to fully function directly after installation, when you do not want to use Mendix SSO you will have to copy contents to your own module and use the templates to build the pages.

### 1.4 Prerequisites

As workflows is only available on Mendix 9+ workflow commons requires at least Mendix 9.0.5

### 1.5  Dependencies

* [Datagrid 2](/appstore/modules/data-grid-2)
* [Mendix SSO](appstore/modules/mendix-sso) (Atlas UI 3 supported version) (may be avoided when following the optional steps in the Installation section)
* [Atlas Core & Atlas Web Content](/appstore/modules/atlas-ui-resources)

## 2 Installation

1. Download and install Workflow commons into your application
2. Download and install Datagrid 2 module (if not already available)
3. Download and install Atlas Core module (if not already available)
4. Download and install Atlas Web Content module  (if not already available)
5. Download and install Mendix SSO Atlas UI 3.0 version (if not already available) (regular Mendix SSO version is not compatible with Atlas UI 3.0)
6. Follow the next steps only if you want to run the module without Mendix SSO (only in Studio Pro)
--1. Open `WorkflowCommons` module in the `App Explorer`
--2. Browse to `UseMe` > `Pages`
--3. Open the `MendixSSOUserVariant` folder
--4. Select all pages + the microflow in there (multi select by selecting the first and then keep `CTRL` pressed to select the others)
--5. Right click and choose `Exclude from project`
--6. Open the `SystemUserVariant` folder
--7. Select all pages + the microflow in there (multi select by selecting the first and then keep `CTRL` pressed to select the others)
--8. Right click and choose `Include in project`

## 3 Configuration

1. Set up navigation
--1. Add `TaskInbox` to your navigation
--2. Add `TaskDashboard` to your navigation
--3. Add `WorkflowAdminCenter` to your navigation
--4. Add `MyInitiatedWorkflows` to your navigation
2. Add the `Administrator` and `User` module roles to the required `Project roles`
--*. `Administrator` 
----* administers workflows;
----* views workflow performance int he admin workflow dashboard.
--*. `User`
----* executes workflows by completing usertasks
----* views personal performance in MyTaskDashboard

## 4 Usage

### 4.1 Page templates

#### 4.1.1 My Initiated Workflows
Used by users that initiate workflows and want to keep track of their progress. A user is also able to `Withdraw` a workflow if it is still `In progress` from this area.

#### 4.1.2 Workflow Task Dashboard
Shows users that execute tasks for example a task based dashboard.

#### 4.1.3 Workflow Task Inbox
For users that have to execute tasks this inbox provides a pre-filtered set of datagrids with the option to go to the details of a task and/or assign a task to the user.

#### 4.1.4 User Task Basic/Extended
May be used to generate a task template that contains a timeline, attachments, comments, header and context data section prefilled for a workflow task.

