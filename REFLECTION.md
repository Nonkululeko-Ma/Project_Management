# Reflection: Challenges in Balancing Stakeholder Needs

# Key Challenges Faced:

1. Conflicting Priorities (Project Managers vs. Team Members)

- Challenge: Project managers wanted detailed task tracking, including granular progress updates, time estimates, and sub-tasks. This allowed them to closely monitor project timelines and identify potential bottlenecks. However, team members found these detailed tracking requirements cumbersome and time-consuming, preferring a simpler interface with fewer required fields. This led to resistance from team members, who felt they were spending more time on administrative tasks than on actual work.
  
- Initial Solution: We initially implemented the detailed tracking features as requested by the project managers, assuming that the benefits of improved monitoring would outweigh the increased workload for team members.
  
-  Revised Solution:  After receiving feedback from team members, we realized that the detailed tracking was negatively impacting their productivity and morale. To address this, we implemented customizable dashboards for different roles. Project managers could still access the detailed tracking information they needed, while team members could use a simplified interface with only the essential fields.
  
-   Lessons Learned: This experience highlighted the importance of actively soliciting feedback from all stakeholders, not just those in leadership positions. It also demonstrated the need for flexibility in system design, allowing for different user interfaces and workflows to accommodate different needs and preferences.

2. Security vs. Usability (IT Admins vs. All Users)

- Challenge: IT Admins demanded high-security measures, including mandatory multi-factor authentication (MFA) and strong encryption, to protect sensitive project data from unauthorized access. However, these security measures added complexity for users, requiring them to remember multiple passwords and go through additional authentication steps. This led to user frustration and resistance, with some users even attempting to bypass security protocols.
  
-   Initial Solution: We initially implemented mandatory MFA for all users, believing that security should be the top priority.
- 
-  Revised Solution: Recognizing the usability challenges, we explored alternative solutions that could provide a similar level of security without sacrificing user convenience. We decided to offer biometric login (fingerprint or facial recognition) as an alternative to MFA. This allowed users to log in quickly and easily while still maintaining a high level of security.
  
  -  Lessons Learned: This experience taught us that security and usability are not mutually exclusive. By exploring alternative solutions and leveraging modern technologies, it is possible to achieve both high security and a positive user experience. It also underscored the importance of considering the user's perspective when designing security measures.

3. Scalability Concerns (Executives vs. IT Staff/All Users)

- Challenge: Executives wanted large-scale analytics and reporting capabilities to gain insights into project performance and resource allocation across the entire organization. However, processing and analyzing large volumes of data significantly slowed down system performance, impacting all users.
  
-   Initial Solution: We initially attempted to implement the requested analytics using the existing database infrastructure. However, this quickly proved to be unsustainable as the data volume increased.
  
-   Revised Solution: To address the scalability concerns, we implemented indexed databases and optimized queries for reports. This allowed us to process large volumes of data more efficiently, minimizing the impact on system performance. We also explored the possibility of using a separate data warehouse for analytics, but this was deemed too expensive for the current project budget.
  
-   Lessons Learned: This experience highlighted the importance of considering scalability from the outset of the project. It also demonstrated the need for careful database design and query optimization to ensure optimal performance. Furthermore, it showed that there are often trade-offs between functionality, performance, and cost and that it is important to find the right balance for each project.

4. Notifications Overload (Users vs. System)

-   Challenge: Users wanted to receive timely notifications about task assignments, deadlines, and project updates to stay informed and on track. However, too many notifications caused frustration and information overload, leading users to ignore or disable notifications altogether.
-  Initial Solution: We initially implemented a default notification system that sent notifications for every task assignment, deadline, and project update.
-  Revised Solution: To address the notification overload, we allowed customizable notification preferences. Users could choose which types of notifications they wanted to receive and how often. They could also set up notification rules to filter out irrelevant notifications.
-   Lessons Learned: This experience reinforced the importance of user control and customization. By allowing users to tailor the notification system to their individual needs and preferences, we were able to improve their overall experience and ensure that they received only the information they needed.

### Lessons Learned (Expanded)

- Balancing usability, security, and performance requires careful trade-offs and a deep understanding of stakeholder needs. There is rarely a one-size-fits-all solution.
-  Engaging stakeholders early and often throughout the development process is crucial for preventing conflicts and ensuring that the system meets their needs. This includes actively soliciting feedback and incorporating it into the design.
- An Agile methodology is valuable for adapting to changing priorities and requirements as the project evolves. This allows for flexibility and responsiveness to stakeholder feedback. Furthermore, by including stakeholders in sprint reviews and demos, we can ensure that the system is continuously aligned with their needs.
  



1. Understanding and Refining System Requirements
One of the biggest challenges was ensuring that the functional and non-functional requirements from Assignment 4 were accurately reflected in the use case diagram. Initially, some requirements lacked details, making it difficult to determine clear use case boundaries. For example, "Task Assignment" needed refinement to distinguish between assigning a task, tracking its progress, and notifying the assigned team member.

 Solution: Breaking down complex requirements into smaller, well-defined use cases eliminated ambiguities. Additionally, aligning each use case with stakeholder concerns ensured that the system functionality was both necessary and practical.

2. Balancing Stakeholder Needs with System Functionality
The TaskFlow system serves multiple stakeholders, including Project Managers, Team Members, IT Admins, and Company Executives. Each of these roles has different priorities:

Project Managers require detailed task tracking and reporting.
Team Members need an easy-to-use interface for task updates.
IT Admins focus on security, role management, and performance.
Executives require high-level project insights and reports.
This led to conflicts in feature prioritization. For instance, managers wanted real-time reporting, while IT Admins emphasized system performance and security, which could slow down report generation.

 Solution: Implementing role-based access control (RBAC) helped balance these needs. Managers received detailed reports, while Executives accessed high-level summaries without performance overhead.

3. Creating an Effective Use Case Diagram
Another challenge was structuring the UML Use Case Diagram correctly using Mermaid.js. Initial attempts resulted in syntax errors, especially when multiple actors interacted with the same use case.

Solution: Instead of forcing multi-parent connections, each use case was directly linked to the system, simplifying relationships. The revised Mermaid.js diagram correctly visualized user interactions without breaking UML standards.

4. Developing Comprehensive Test Cases
Creating functional and non-functional test cases required ensuring that all system functionalities were fully validated. However, challenges arose when defining:

Acceptance criteria for success/failure scenarios
Testing system security against attacks (e.g., SQL injection, unauthorized access)
Simulating high user loads for performance testing
Solution: A structured test case table was developed, covering:

Basic validation tests (e.g., task creation, role management)
Edge cases (e.g., what happens when invalid data is entered)
Performance & security tests (e.g., how the system handles 1,000 concurrent users)
By systematically tracing test cases back to the functional requirements, we ensured full test coverage.

5. Lessons Learned
Through this assignment, I learned:
✔ Breaking down complex requirements into smaller use cases improves clarity.
✔ Stakeholder needs must be balanced with system constraints.
✔ Mermaid.js requires strict syntax to correctly render UML diagrams.
✔ A well-structured test plan ensures system reliability, security, and scalability.

Overall, translating requirements into actionable use cases and test cases was a challenging but rewarding process. This structured approach will be invaluable in real-world software engineering projects, ensuring that systems are functional, scalable, and secure.


 **Reflection: Agile Planning and Execution in My Project Management App**
Working on my Project Management App using Agile, specifically Kanban, was both a learning experience and a challenge. I started by defining user stories to outline key functionalities, ensuring that every task aligned with the project’s goals. Creating user stories helped me break down complex features into manageable parts. For example, one of my key user stories was:

"As a project manager, I want to create and assign tasks so that my team can track progress and stay organized."

This approach helped in structuring the Product Backlog, where I listed all necessary features, from project creation and task assignment to notifications and reporting. Managing the Product Backlog was challenging because I had to decide which features to develop first. To keep things structured, I used Kanban boards to visualize progress, ensuring that tasks moved from To Do to In Progress and finally to Done.

Sprint Planning was another key part of my Agile workflow. Since I had limited time, I had to break the project into sprints with clear deliverables. In the first sprint, I focused on setting up the project creation feature and task assignment system, which were crucial for the MVP. I added these tasks to the Sprint Backlog and estimated the time required for each. However, estimating time was tricky because some tasks, like user role management, were more complex than expected, leading to delays.

Using Kanban to manage my sprints, I tracked my progress and adjusted priorities based on what was taking longer. There were moments when the workload felt overwhelming, especially when juggling multiple milestones. I had to ensure that tasks were progressing smoothly while also dealing with unexpected challenges. One of the biggest challenges was staying on track with my sprint timelines. Initially, I underestimated the amount of work needed for some features, which caused delays. This led to some tasks spilling over into the next sprint. However, Agile allowed me to adapt and refine my backlog, so I reprioritized and moved non-essential features to later sprints.

Despite the challenges, using Agile and Kanban helped me manage the project efficiently. I learned the importance of proper sprint planning, backlog refinement, and flexibility. Regularly updating my Kanban board kept me focused, and breaking the project into small milestones made the workload more manageable. The ability to adjust my sprint goals and backlog as needed ensured that I delivered a functional MVP while continuously improving the app. Agile allowed me to remain organized, adaptable, and realistic about time management, ultimately making the development process smoother and more structured. For this assignment, I learned a lot.

**Note**
I have also created the User Stories, Sprint Planning, and other necessary Agile documents in Markdown in case my project wasn't successfully built for efficient project tracking.


## Assignment 7 ##

**Challenges in Selecting & Customizing the Template**
Choosing the right template can be tricky because every team have different needs. Some templates may have too many features, making them hard to use, while others may lack important columns like Testing or Blocked. Customizing also takes time, as we need to add the right columns, set WIP limits, and assign tasks properly.

**GitHub vs. Other Tools**
- GitHub is great for developers, linking tasks to code and issues. However, it has fewer built-in templates than some other tools.
- Trello is simple and easy to use, but it lacks advanced tracking features.
- Jira is powerful for Agile teams, with detailed reports and automation, but it can be complex to set up.

In conclusion GitHub is best for coding projects, collaborations, Trello for simple tasks, and Jira for big Agile teams.


## ASSIGNMENT 8 ## 

## Reflection ##

While doing this assignment, one of the main challenges I faced was choosing how much detail to add to the state and activity diagrams. If I add too much information, the diagrams will look complicated and hard to read. But if I added too little, it felt like important steps were missing. Another challenge was ensuring my diagrams matched properly with my previous assignments' user stories and sprint tasks. I had to go back and check if everything connected well.

State diagrams helped me focus more on how a single object behaves and changes over time, like a Task moving from "To Do" to "In Progress" to "Done". On the other hand, activity diagrams show the whole process or workflow, like how a user registers or creates a project step-by-step. Both diagrams are useful but used for different reasons — state diagrams are about object behaviour, and activity diagrams are about process flow. Overall, this task helped me understand how to plan and visualize a system better in a clear way.



## ASSIGNMENT 9 Reflection ##

While working on the domain model and class diagram, I faced a few challenges. One of the main challenges was deciding which objects to include in the domain model. At first, I thought of adding too many objects, but later I realized that would make the diagram too complicated and messy. I had to focus only on the important entities like User, Project, Task, Issue, Report, Comment, and Notification.
Another challenge I faced was defining relationships between objects. Sometimes I was not sure if I should use association, composition, or inheritance. I had to go back and check my previous assignments, like my use cases and state diagrams, to make sure that the relationships made sense. For example, I struggled a bit when connecting Task with User and Project, but finally I managed to show that a Task belongs to a Project and is assigned to a User.

Adding methods for each class was also tricky because I didn’t want to overload the diagram with too many functions. I only included the main methods like createProject(), updateStatus(), reportIssue(), and generateReport() — which are all directly linked to the system’s main functions from previous assignments.

This class diagram aligns well with my previous assignments. For example:
* The User class supports user registration and login from Assignment 5 (Use Cases).
* The Task class connects with the task workflow from Assignment 8 (State Diagrams).
* The Project, Task, and Issue objects all directly link to functional requirements from Assignment 4.
* The relationships between objects also follow the activity flows I created before.

One of the trade-offs I made was avoiding inheritance because my system didn’t really have objects that needed it. Instead, I used simple relationships like association and composition to keep the diagram clear and easy to understand. I also avoided adding extra technical details to keep the class diagram focused on the business logic of the project.

From this assignment, I learned a lot about object-oriented design. I now understand that a class diagram is not just about drawing boxes but about carefully showing how the system works in real life. I learned how important it is to balance between keeping the diagram simple but still detailed enough to explain the system properly. I also learned that working with diagrams helps to think deeply about the system before writing any code. Overall, this task really helped me improve my planning and system design skills. It showed me the importance of organizing data, defining clear relationships, and thinking about future system development.
