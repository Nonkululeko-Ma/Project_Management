# Domain Model for Project Management System #

| Entity        | Attributes                          | Methods                            | Relationships                                  |
|---------------|-------------------------------------|-----------------------------------|------------------------------------------------|
| User          | userID, name, email, role, status   | register(), login(), updateProfile() | Can create Projects, assigned to Tasks       |
| Project       | projectID, title, description, status | createProject(), archiveProject()  | Created by User, contains Tasks               |
| Task          | taskID, title, description, status, deadline | assignTask(), updateStatus()      | Belongs to Project, assigned to User          
| Issue         | issueID, title, description, status  | reportIssue(), closeIssue()        | Linked to Task, reported by User              |
| Comment       | commentID, content, date             | addComment(), deleteComment()      | Belongs to Task or Issue, created by User     |
| Report        | reportID, title, dateGenerated       | generateReport(), downloadReport() | Linked to Project                             |
| Notification  | notificationID, message, date, status| sendNotification(), markAsRead()   | Sent to User                                  |


## Project Management Rules ##
- A User can create many Projects.
- A Project can have many Tasks.
- A Task belongs to one Project.
- A Task is assigned to only one User.
- A User can report multiple Issues.
- Comments can be added to Tasks or Issues.
- A Report is generated from a Project.
- A Notification is sent to a specific User.
