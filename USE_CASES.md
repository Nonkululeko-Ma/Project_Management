#  Use Case Specifications for TaskFlow



---

## **1 Use Case Table**
| **Use Case**           | **Actors**             | **Description**                                      | **Preconditions**                      | **Postconditions**                          | **Basic Flow**                                  | **Alternative Flow**                                  |
|------------------------|----------------------|----------------------------------------------------|--------------------------------------|------------------------------------------|------------------------------------------------|------------------------------------------------|
| **Create Project**     | Project Manager      | Allows a manager to create a new project         | Manager is logged in               | New project is available in the system  | 1. Manager enters project details <br> 2. Clicks "Create" <br> 3. System saves project | 1. If missing details, system shows error |
| **Assign Task**        | Project Manager      | Assigns a task to a team member                 | Project exists, user is assigned   | Task is visible to assigned member       | 1. Select project <br> 2. Add task details <br> 3. Assign to user | 1. If invalid user, system shows error |
| **Update Task Progress** | Team Member        | Updates task status                              | Task is assigned to user           | Task status is updated in system        | 1. Select assigned task <br> 2. Change status to "In Progress" or "Done" | 1. If user not assigned, system blocks update |
| **View Reports**       | Project Manager      | Generates project progress reports              | Data exists                         | Report is displayed                     | 1. Click "Generate Report" <br> 2. System compiles and displays report | 1. If no data, system shows "No Data Available" |
| **Receive Notifications** | Team Member       | Notifies users of task updates                  | Task assigned to user               | User receives an alert                  | 1. System detects task update <br> 2. Sends notification | 1. If user disabled notifications, no alert is sent |
| **Upload Documents**   | Team Member          | Allows team members to attach files to tasks    | Task exists                         | File is stored in the system            | 1. Click "Attach File" <br> 2. Select file and upload | 1. If file type not supported, system blocks upload |
| **Manage User Roles**  | IT Admin             | Admin adds, edits, or removes users             | Admin logged in                     | User role is updated                    | 1. Select user <br> 2. Change role <br> 3. Click "Save" | 1. If invalid role, system shows error |
| **Monitor System**     | IT Admin             | Monitors system activity and security logs      | System is online                    | Logs are displayed                      | 1. Admin accesses monitoring dashboard | 1. If system down, alerts are triggered |

-- 
