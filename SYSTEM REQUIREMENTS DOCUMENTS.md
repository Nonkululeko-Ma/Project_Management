# System Requirements Document (SRD)

# 1. Functional Requirements

1.  User Authentication: The system shall allow users to securely register, log in, and log out.
    - Acceptance Criteria: Users must be able to log in with valid credentials within 3 seconds.  Failed login attempts should be logged.
      
2.  Project Creation: The system shall allow project managers to create new projects with a name, description, start date, and end date.
   - Acceptance Criteria: Project creation should be completed within 5 seconds.  The system must validate input data (e.g., the end date cannot be before the start date).
     
3.  Task Assignment: The system shall allow project managers to assign tasks to team members with a description, deadline, and priority.
   - Acceptance Criteria:  Task assignment should be completed within 3 seconds. Notifications will be sent to the user assigned the task and to the Project Manager.
     
4.     Task Progress Tracking: The system shall allow team members to update the progress of their assigned tasks (e.g., "To Do," "In Progress," "Completed").
     - Acceptance Criteria: The team member can update the progress. Project Manager should be able to view the changes.
       
5.  Deadline Notifications: The system shall send email notifications to team members and project managers when a task deadline is approaching or has passed.
    - Acceptance Criteria: Email Notifications.
      
6.  Reporting: The system shall generate reports on project progress, task completion rates, and resource allocation.
    - Acceptance Criteria: Accurate report.
      
7.  User Roles and Permissions: The system shall implement role-based access control to restrict access to sensitive features and data.
    - Acceptance Criteria: Only Admins can manage user roles and permissions.
      
8.  Communication: The system shall provide a messaging feature for team members to communicate and collaborate on tasks.
    - Acceptance Criteria: Users can send each other messages.
      
9. File Sharing: The system shall allow users to share files and documents related to tasks and projects.
    - Acceptance Criteria: Documents are viewable after uploading.
      
10. Search Functionality: The system shall enable users to quickly search for tasks, projects, and documents.
    - Acceptance Criteria: Search results displayed in under 3 seconds.

# 2. Non-Functional Requirements

# Usability

-   The user interface shall be intuitive and easy to navigate.  It should comply with WCAG 2.1 accessibility standards.
-   The system shall provide clear and concise error messages.

# Deployability

  - The system shall be deployable on Windows, AWS and/or Firebase.
  - The deployment process shall be automated.

# Maintainability

-   The codebase shall be well-documented with an API guide for future integrations.
-   The system shall be modular to allow for easy updates and modifications.

# Scalability

-   The system shall support at least 1,000 concurrent users during peak hours.
-  The system shall be able to handle a large number of projects and tasks.

# Security

-   All user data shall be encrypted using AES-256.
-   The system shall be protected against common web vulnerabilities (e.g., SQL injection, XSS).

# Performance

-  Search results shall load within 2 seconds.
-  The system shall respond to user requests within 3 seconds.
