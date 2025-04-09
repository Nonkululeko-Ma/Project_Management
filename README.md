# TaskFlow: Project Management System  

# Project Description   

TaskFlow is a web-based Project Management System designed to help teams and organizations plan, track, and execute projects efficiently.  This system is built based on thorough stakeholder analysis and a well-defined set of functional and non-functional requirements.

The system allows users to  
✔ Create projects  
✔ Assign tasks  
✔ Set deadlines  
✔ Monitor progress  
✔ Collaborate with team members  



#  Features  
- Project Creation & Management  
- Task Assignment & Tracking 
- Deadline Notifications  
- Project Reports & Analytics  
- Team Collaboration & Messaging  


# System Architecture  
For a detailed system architecture, see:  
👉 [ARCHITECTURE.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/ARCHITECTURE.md)



#  System Specification  
For full project specifications, see:  
👉 [SPECIFICATION.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/SPECIFICATION.md)  


# System Requirements Documentation
For full project documentation, see:
👉 [SYSTEM REQUIREMENTS DOCUMENTATION.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/SYSTEM%20REQUIREMENTS%20DOCUMENTS.md)


# Reflection 
For full project reflection, see: 
👉 [REFLECTION.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/SYSTEM_REQUIREMENTS_DOCUMENTS.md)

# Stakeholders
For the full project stakeholders, see:
👉 [STAKEHOLDER.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/STAKEHOLDERS_ANALYSIS.md)

# Test Case Development
   For the full project Test Case Development, see:
👉 [Test_Case_Development.md](https://github.com/Nonkululeko-Ma/Project_Management/blob/main/Test_Case_Development.md)

# Mermaid Diagram
   For the full User Case diagram, see:
👉 (https://www.mermaidchart.com/app/projects/a35eb643-a2e6-4dfd-9908-113447ce51e5/diagrams/058f43e1-90e0-4ab5-8fb3-fb4ba3bd5937/version/v0.1/edit)
# Technologies  will be Used  
- Frontend React.js  
- Backend Node.js (Express.js)  
- Database MongoDB  
- Hosting AWS / Firebase  
- Authentication JWT

![Untitled diagram-2025-03-16-092900](https://github.com/user-attachments/assets/71a4cb1d-5896-4948-91a5-3058fa29a979)


| **Actor**           | **Role in System**                                      |
|---------------------|--------------------------------------------------------|
| **Project Manager** | Creates projects, assigns tasks, views reports         |
| **Team Member**     | Updates task progress, receives notifications          |
| **Company Executive** | Tracks overall project progress, reviews reports      |
| **IT Admin**        | Manages user roles, ensures system security & uptime   |
| **HR Manager**      | Monitors workload distribution & employee performance  |
| **Clients/Customers** | Receives project updates & final deliverables        |

Generalization:
Both Project Managers & Team Members interact with tasks.
Inclusion:
Receive Notifications is included in several actions (e.g., task assignment).
How It Addresses Stakeholder Concerns:

Managers need task assignment & progress tracking.
Employees require clear notifications & task updates.
IT Admins maintain user security & system monitoring.

**For the Project on GitHub**
👉 https://github.com/users/Nonkululeko-Ma/projects/1


**Assignment 6**

**Kanban Board Customization**
**Overview**
This Kanban board is set up to track project tasks and make work more organized.

**Custom Columns**
To Do – Tasks that need to be started.
In Progress – Tasks that are currently being worked on.
Testing – (New) For tasks being checked for errors before completion.
Blocked – (New) For tasks that are stuck due to issues or missing information.
Done – Completed tasks.

**Linked Issues & Labels**
Issues are linked to match tasks with their GitHub Issues.

**Labels used**

feature → New features
bug → Problems that need fixing
enhancement → Improvements

**Task Assignments**
Tasks are assigned to team members using @mentions.
Each task has a clear description and goal.

## ASSIGNMENT 7 ##
**Kanban Board**
![1](https://github.com/user-attachments/assets/54680e6a-e2e2-4935-86f0-46cfbee1b213)
![3](https://github.com/user-attachments/assets/bd45f69e-e8dd-43a4-b686-bbe0100941c5)

**Issues and Assigned**
![3](https://github.com/user-attachments/assets/e0c5bcc3-444a-4516-ae0b-276cfcca1106)
**Template analysis**
![image](https://github.com/user-attachments/assets/94f7cab2-2a29-424e-91eb-7466c4c4d8e7)


## ASSIGNMENT 8 ## 

![UML activity diagram](https://github.com/user-attachments/assets/265dc0e5-67b3-4555-9447-ae0f0b9a353e)

![state transition diagram](https://github.com/user-attachments/assets/918ea9c9-fa63-41d1-a545-b228ee5fc67d)

**Link for the Mermaid diagrams** 👇

https://www.mermaidchart.com/app/projects/a35eb643-a2e6-4dfd-9908-113447ce51e5/diagrams/058f43e1-90e0-4ab5-8fb3-fb4ba3bd5937/version/v0.1/edit

https://www.mermaidchart.com/app/projects/a35eb643-a2e6-4dfd-9908-113447ce51e5/diagrams/6fad2a50-c757-46a8-8ea5-6369a345a5e5/version/v0.1/edit   


**Diagram 1: Object-Purpose-Related Functional Requirements**

This diagram shows the main objects in the app and what they do. The Project helps track the project status (FR-001). The Task manages the progress of tasks (FR-002). The User Account controls user states (FR-003). Issues help track bugs (FR-004). Notifications send alerts to users (FR-005). Roles control user access (FR-006). The Comment feature lets users post, edit, or delete comments (FR-007). Finally, the Report feature manages the approval of reports (FR-008).

**Diagram 2: Workflow Purpose**

This diagram explains the app’s main workflows. User Registration ensures users enter the right details and verify their email. Create Project lets users start new projects. Create Task allows users to add tasks and assign them to team members. Update Task Status helps track progress. Report Issue lets users report problems. Add Comment lets users give feedback or notes. Generate Report lets admins create reports for the project. Notification Handling lets users manage alerts and updates.

## Integration with Prior Work (Traceability) ##


| Diagram/Workflow                           | Functional Requirement (Assignment 4)                 | Related User Story / Task (Assignment 6)                 |
|--------------------------------------------|-------------------------------------------------------|----------------------------------------------------------|
| User Registration Activity Diagram         | FR-001: Allow user registration                      | US-001: Create user account                              |
| Create Project Activity Diagram            | FR-002: Allow users to create projects               | T-001: Project creation feature                          |
| Create Task Activity Diagram               | FR-003: Allow tasks within projects                  | T-002: Add task functionality                            |
| Update Task Status Activity Diagram        | FR-004: Update task progress                         | T-003: Update task status                                |
| Report Issue Activity Diagram              | FR-005: Report bugs/issues                          | T-004: Issue reporting feature                           |
| Add Comment Activity Diagram               | FR-006: Communicate in tasks                        | T-005: Commenting system                                 |
| Generate Report Activity Diagram           | FR-007: Generate reports                            | T-006: Reporting feature                                 |
| Notification Handling Activity Diagram     | FR-008: Notify users of updates                    | T-007: Notification system                               |



## Explanation of Design Decisions ##

- I used 7 main classes based on the domain model from Task 1.
- The relationships show real-world connections like:
  - One User can create many Projects.
  - Each Project contains many Tasks.
  - Each Task can have Issues or Comments.
  - Issues can have multiple Comments.
  - Reports are generated from Projects.
  - Notifications are sent to Users.
- I included Multiplicity (1, 0..*, 0..1) to show how many objects can exist in the relationship.
- Attributes are private (-), methods are public (+) following UML standards.

