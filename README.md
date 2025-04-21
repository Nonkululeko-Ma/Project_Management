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
![state transition diagram](https://github.com/user-attachments/assets/899f1624-f95f-4fef-8f12-0182a093d162)

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

