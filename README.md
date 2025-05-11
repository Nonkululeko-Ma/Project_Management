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

---

# Technologies  will be Used  
- Frontend React.js  
- Backend Node.js (Express.js)  
- Database MongoDB  
- Hosting AWS / Firebase  
- Authentication JWT  
  ## UML activity diagram ##
  ![UML activity diagram](https://github.com/user-attachments/assets/6e56f1c3-b535-43de-aa39-e14b81f50f8e)

 ## state transition diagram ##
 For full project specifications, see:  



👉 [User Stories](https://github.com/YourUsername/YourRepoName/blob/main/USER_STORIES.md)  
👉 [Product Backlog](https://github.com/YourUsername/YourRepoName/blob/main/PRODUCT_BACKLOG.md)  
 👉 [Sprint Planning](https://github.com/YourUsername/YourRepoName/blob/main/SPRINT_PLANNING.md)  
👉[Reflection on Agile Planning](https://github.com/YourUsername/YourRepoName/blob/main/REFLECTION.md)  

## ASSIGNMENT 7 ## 
| Column        | Purpose                                       |
|--------------|---------------------------------------------|
| To Do       | Tasks that need to be started              |
| In Progress | Tasks currently being worked on            |
| Testing     | Tasks undergoing QA/testing                |
| Blocked     | Tasks waiting for external dependencies    |
| Done        | Completed tasks                            |



| Feature            | GitHub Projects     | Trello             | Jira              |
|------------------|------------------|----------------|----------------|
| Best Use Case  | Software Development | General Task Management | Enterprise Agile Teams |
| Automation      | Yes (Kanban workflows) | No (Manual updates) | Yes (Advanced automation) |
| Issue Tracking | Yes (Linked to code) | No | Yes (Detailed issue tracking) |
| Complexity     | Moderate | Simple | Complex |


GitHub Projects is a great option for development teams because it integrates directly with repositories. While Trello is more user-friendly, it lacks automation. Jira is the most powerful but can be overwhelming for small teams.



### ASSIGNMENT 9 ## 

# Project Management System - Assignment 9 Deliverables
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

## Links to Files

## ASSIGNMENT 10 ## 
## OUTPUT ##
![Screenshot (323)](https://github.com/user-attachments/assets/ea58f627-17ad-4955-9176-2f80dda880ab)

 Implemented Simple Factory for User creation.
- Implemented Factory Method for Report generation.
- Implemented Abstract Factory for Notification types.
- Implemented Builder pattern for Project entity.
- Implemented Prototype pattern for Task cloning.
- Implemented Singleton pattern for Configuration management.


## ASSIGNMENT 11 ## 

#  Repository Layer - ProjectManagement

## Overview
This layer handles persistence operations for domain entities using a clean Repository Pattern approach.  
Initially, an in-memory storage (HashMap) is implemented for fast testing. Future storage (like a database) is also prepared.

## Components

##  Repository Layer 

| Component | Description |
|:---|:---|
| Repository.java | Generic CRUD operations using Generics |
| UserRepository.java | Specialised interface for User persistence |
| InMemoryUserRepository.java | In-memory HashMap implementation |
| DatabaseUserRepository.java | Stub for future database support |
| RepositoryFactory.java | Factory to switch between MEMORY and DATABASE repositories |
---
## Storage Abstraction
- Factory Pattern is used via "RepositoryFactory".
- Allows easy switching from memory to database in the future.

## Future-Proofing
- "DatabaseUserRepository" stub included.
- New storage systems (e.g., JSON, REST API) can easily be added.

## Class Diagram
Link for diagram 

👉  https://github.com/Nonkululeko-Ma/Project_Management/blob/main/Mermaid.md


👉 https://github.com/Nonkululeko-Ma/Project_Management/blob/main/CHANGELOG.md

![Screenshot (328)](https://github.com/user-attachments/assets/99d045a7-cafc-4ba1-bccb-25a348fda628)
![Screenshot (329)](https://github.com/user-attachments/assets/f2f1d8ce-884a-4f57-ad0a-f0ee77113c63)



## ASSIGNMENT 13 ## 

![Screenshot (345)](https://github.com/user-attachments/assets/483204ce-ed58-48e6-b35c-19b68e2e6237)
![Screenshot (346)](https://github.com/user-attachments/assets/f839ed37-b017-476f-8b4a-29441d47c71e)
![Screenshot (356)](https://github.com/user-attachments/assets/8ba5d3d0-e22e-4158-8d12-d9e4ab60a5aa)

## Deliverable 2 ##
ci.yml screenshot
![Uploading image.png…]()

![Screenshot (354)](https://github.com/user-attachments/assets/4cf9a388-347c-40fe-b8b7-09b33b4cd050)
![Screenshot (355)](https://github.com/user-attachments/assets/0cf1316d-2c56-441f-8add-abeaf587269a)

##  How to Run Tests Locally

To run all tests locally using Maven:
 Make sure you have Java and Maven installed
And then cd IdeaProjects/Project since my src is inside the ideaproject, you have to cd it in order to read it.

# Run all the tests
mvn test


# How the CI/CD Pipeline Works #

Every time you push code or open a pull request (PR) to the main branch, GitHub Actions automatically runs.
It grabs your code, sets up Java, and runs all the tests for you.
If any tests fail, the PR can’t be merged, so no broken code sneaks into main.
Once your PR passes all tests and gets merged into main, the pipeline builds a release artifact (a JAR file).
You can download this artifact from the GitHub Actions page under the Artifacts section - super useful for deploying or sharing your build.

## How to Show the PR Workflow in Action ##
Create a PR targeting the main branch.
If your code has failing tests, GitHub will block the merge and show the failing checks right on the PR page. This makes sure everyone’s code is solid before it gets merged.
When your PR passes all tests and gets merged, the pipeline builds and uploads the release artifact. You can find it in the GitHub Actions run under Artifacts - just grab a screenshot to prove it!



