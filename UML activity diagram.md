%% Activity Diagrams for 8 Workflows

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
![UML activity diagram](https://github.com/user-attachments/assets/906daff3-fa2c-4ff2-a26b-b41d1c99f3b1)
