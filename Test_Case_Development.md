# Test Cases for TaskFlow

| **Test Case ID** | **Requirement ID** | **Description**                      | **Steps**                                         | **Expected Result**                 | **Actual Result** | **Status** |
|-----------------|-----------------|----------------------------------|-----------------------------------------------|--------------------------------|--------------|---------|
| TC-001         | FR002            | Create a new project            | 1. Login as Project Manager <br> 2. Click "New Project" <br> 3. Enter details <br> 4. Click "Save" | Project is created successfully | -            | Pending |
| TC-002         | FR003            | Assign a task to a team member  | 1. Select project <br> 2. Click "Assign Task" <br> 3. Choose team member <br> 4. Click "Assign" | Task appears in team member's dashboard | - | Pending |
| TC-003         | FR004            | Update task progress            | 1. Login as Team Member <br> 2. Select assigned task <br> 3. Change status to "In Progress" | Task status updates correctly | - | Pending |
| TC-004         | FR006            | Generate report                 | 1. Login as Project Manager <br> 2. Click "View Reports" | Report is displayed correctly | - | Pending |
| TC-005         | FR008            | Send notifications              | 1. Task updated by manager <br> 2. System sends notification | User receives notification | - | Pending |
| TC-006         | FR009            | Upload file                     | 1. Click "Attach File" <br> 2. Select document <br> 3. Upload | File uploads successfully | - | Pending |
| TC-007         | FR007            | Manage user roles               | 1. Login as Admin <br> 2. Go to "User Management" <br> 3. Change user role <br> 4. Click "Save" | User role updates correctly | - | Pending |
| TC-008         | FR010            | Search functionality            | 1. Enter search term <br> 2. Click "Search" | Results display in ≤ 2s | - | Pending |
| TC-009         | NFR-Performance  | Performance test                 | Simulate 1,000 users searching for tasks | Response time ≤ 2 seconds | - | Pending |
| TC-010         | NFR-Security     | Security test                    | Attempt SQL injection attack | System blocks attack | - | Pending |
