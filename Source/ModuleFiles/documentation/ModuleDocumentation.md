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


### 1.3 Prerequisites

As workflows is only available on Mendix 9+ workflow commons requires at least Mendix 9.0.5

### 1.4  Dependencies

* [Data Widgets](/appstore/modules/data-widgets)
* [Atlas Core & Atlas Web Content](/appstore/modules/atlas-ui-resources)

## 2 Installation

1. Download and install Workflow Commons into your application
2. Download and install Data Widgets module (if not already available)
3. Download and install Atlas Core module (if not already available)
4. Download and install Atlas Web Content module  (if not already available)


## 3 Configuration

1. Set up navigation
--1. Add `TaskInbox` to your navigation
--2. Add `TaskDashboard` to your navigation
--3. Add `WorkflowAdminCenter` to your navigation
2. Add the `Administrator` and `User` module roles to the required `Project roles`
--*. `Administrator` 
----* administers workflows;
----* views workflow performance int he admin workflow dashboard.
--*. `User`
----* executes workflows by completing usertasks