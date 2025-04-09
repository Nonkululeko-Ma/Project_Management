%% Activity Diagrams for 8 Workflows
```mermaid
%% 1. User Registration
flowchart TD
    A(Start) --> B[User Enters Details]
    B --> C{Details Valid?}
    C -- No --> D[Show Error]
    C -- Yes --> E[Save User]
    E --> F[Send Verification Email]
    F --> G(End)

%% 2. Create Project

    A1(Start) --> B1[User Enters Project Info]
    B1 --> C1[Validate Info]
    C1 --> D1[Save Project]
    D1 --> E1(End)

%% 3. Create Task

    A2(Start) --> B2[User Creates Task]
    B2 --> C2[Assign Task to Member]
    C2 --> D2[Notify User]
    D2 --> E2(End)

%% 4. Update Task Status

    A3(Start) --> B3[Select Task]
    B3 --> C3[Choose New Status]
    C3 --> D3[Update Status in System]
    D3 --> E3[Notify Team]
    E3 --> F3(End)

%% 5. Report Issue

    A4(Start) --> B4[User Creates Issue]
    B4 --> C4[Describe Problem]
    C4 --> D4[Attach Screenshot]
    D4 --> E4[Save Issue]
    E4 --> F4(End)

%% 6. Add Comment

    A5(Start) --> B5[User Writes Comment]
    B5 --> C5[Submit Comment]
    C5 --> D5[Comment Appears Under Task]
    D5 --> E5(End)

%% 7. Generate Report

    A6(Start) --> B6[Admin Selects Data Range]
    B6 --> C6[System Fetches Data]
    C6 --> D6[Generate Report File]
    D6 --> E6[Download Option Available]
    E6 --> F6(End)

%% 8. Notification Handling

    A7(Start) --> B7[System Sends Notification]
    B7 --> C7{User Opens Notification?}
    C7 -- No --> D7[Keep Unread]
    C7 -- Yes --> E7[Mark as Read]
    E7 --> F7(End)


```mermaid
stateDiagram-v2
    %% Project Object
    state Project {
        [*] --> Created
        Created --> InProgress : Team Starts Work
        InProgress --> Completed : All Tasks Done
        InProgress --> OnHold : Blockers
        OnHold --> InProgress : Issue Solved
        Completed --> Archived : Closed by Admin
    }

    %% Task Object
    state Task {
        [*] --> ToDo
        ToDo --> InProgress : Assigned
        InProgress --> Done : Task Finished
        InProgress --> Blocked : Issue Found
        Blocked --> InProgress : Issue Resolved
    }

    %% User Account Object
    state UserAccount {
        [*] --> Registered
        Registered --> Active : Email Verified
        Active --> Suspended : Rule Break
        Suspended --> Active : Reinstated
        Active --> Deleted : User Deletes
    }

    %% Issue Object
    state Issue {
        [*] --> Open
        Open --> InProgress : Assigned Dev
        InProgress --> Resolved : Fix Done
        Resolved --> Closed : Verified
        Resolved --> Reopened : Bug Not Fixed
    }

    %% Notification Object
    state Notification {
        [*] --> Unread
        Unread --> Read : User Opens
        Read --> Archived : Auto Clean
    }

    %% Role Object
    state Role {
        [*] --> Guest
        Guest --> User : Registered
        User --> Admin : Granted Access
        Admin --> User : Downgrade
    }

    %% Comment Object
    state Comment {
        [*] --> Draft
        Draft --> Posted : User Submits
        Posted --> Edited : User Updates
        Posted --> Deleted : User Removes
        Edited --> Posted : Save Changes
    }

    %% Report Object
    state Report {
        [*] --> Generated
        Generated --> Reviewed : Admin Checks
        Reviewed --> Approved : Valid Report
        Reviewed --> Rejected : Invalid Data
        Approved --> Archived : For Records
    }








## Class Diagram for Project Management System ##

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
