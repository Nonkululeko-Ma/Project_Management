# 📌 Test Cases for TaskFlow: Project Management System  

 

---

## **1 Functional Test Cases**  

| **Test Case ID** | **Requirement ID** | **Description**               | **Steps** | **Expected Result** | **Actual Result** | **Status** |
|-----------------|-----------------|--------------------------------|----------|----------------------|------------------|---------|
| **TC-001**     | **FR001**        | User Authentication           | 1. Enter valid credentials <br> 2. Click "Login" | User logs in successfully | - | Pending |
| **TC-002**     | **FR002**        | Create a new project          | 1. Login as Project Manager <br> 2. Click "New Project" <br> 3. Enter details <br> 4. Click "Save" | Project is created successfully | - | Pending |
| **TC-003**     | **FR003**        | Assign a task to a team member | 1. Select project <br> 2. Click "Assign Task" <br> 3. Choose team member <br> 4. Click "Assign" | Task appears in team member's dashboard | - | Pending |
| **TC-004**     | **FR004**        | Update task progress          | 1. Login as Team Member <br> 2. Select assigned task <br> 3. Change status to "In Progress" | Task status updates correctly | - | Pending |
| **TC-005**     | **FR005**        | Receive deadline notifications | 1. Task assigned to a user <br> 2. System triggers notification | User receives notification | - | Pending |
| **TC-006**     | **FR006**        | Generate project reports      | 1. Login as Project Manager <br> 2. Click "View Reports" | Report is displayed correctly | - | Pending |
| **TC-007**     | **FR007**        | Manage user roles             | 1. Login as Admin <br> 2. Go to "User Management" <br> 3. Change user role <br> 4. Click "Save" | User role updates correctly | - | Pending |
| **TC-008**     | **FR008**        | Send notifications            | 1. Task updated by manager <br> 2. System sends notification | User receives notification | - | Pending |
| **TC-009**     | **FR009**        | Upload a document             | 1. Click "Attach File" <br> 2. Select document <br> 3. Upload | File uploads successfully | - | Pending |
| **TC-010**     | **FR010**        | Search functionality          | 1. Enter search term <br> 2. Click "Search" | Results display within 2 seconds | - | Pending |

---

## **2 Non-Functional Test Cases**  

| **Test Case ID** | **Requirement ID** | **Description**            | **Test Scenario** | **Expected Result** | **Actual Result** | **Status** |
|-----------------|-----------------|-------------------------|------------------|----------------------|------------------|---------|
| **TC-011**     | **NFR-Usability** | UI accessibility test   | Verify compliance with **WCAG 2.1** guidelines | System meets accessibility standards | - | Pending |
| **TC-012**     | **NFR-Deployability** | Deployment check       | Deploy TaskFlow on **Windows, Linux, and AWS** | Application runs successfully | - | Pending |
| **TC-013**     | **NFR-Maintainability** | API Documentation Test | Ensure API guide includes proper endpoints and descriptions | API is well-documented | - | Pending |
| **TC-014**     | **NFR-Scalability** | Load Testing           | Simulate **1,000 concurrent users** logging in and using the system | System maintains performance | - | Pending |
| **TC-015**     | **NFR-Security** | SQL Injection Test     | Attempt to inject SQL commands into login fields | System blocks attack | - | Pending |
| **TC-016**     | **NFR-Security** | Unauthorized Access    | Try accessing **admin pages** without proper credentials | System denies access | - | Pending |
| **TC-017**     | **NFR-Performance** | Response Time Test    | Execute **search function 100 times** and measure response time | Response time ≤ 2 seconds | - | Pending |
| **TC-018**     | **NFR-Data Backup** | Automatic Backup Test | Simulate system failure, check if backup restores within **15 minutes** | Data is successfully restored | - | Pending |

---

 

