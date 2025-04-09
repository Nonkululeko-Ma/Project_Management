## Class Diagram for Project Management System

```mermaid
classDiagram

class User {
-userID: String
-name: String
-email: String
-role: String
-status: String
+register()
+login()
+updateProfile()
}

class Project {
-projectID: String
-title: String
-description: String
-status: String
+createProject()
+archiveProject()
}

class Task {
-taskID: String
-title: String
-description: String
-status: String
-deadline: Date
+assignTask()
+updateStatus()
}

class Issue {
-issueID: String
-title: String
-description: String
-status: String
+reportIssue()
+closeIssue()
}

class Comment {
-commentID: String
-content: String
-date: Date
+addComment()
+deleteComment()
}

class Report {
-reportID: String
-title: String
-dateGenerated: Date
+generateReport()
+downloadReport()
}

class Notification {
-notificationID: String
-message: String
-date: Date
-status: String
+sendNotification()
+markAsRead()
}

%% Relationships
User "1" -- "0..*" Project : creates
Project "1" -- "0..*" Task : contains
Task "1" -- "0..1" User : assignedTo
Task "1" -- "0..*" Issue : has
Task "1" -- "0..*" Comment : has
Issue "1" -- "0..*" Comment : has
Project "1" -- "0..*" Report : generates
Notification "1" -- "1" User : sentTo



---

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

---


