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


## Assignment 6##

I encountered several challenges throughout the project that tested my project management skills. One of the main difficulties was in utilizing the user story framework, which proved to be more complex than anticipated. Crafting clear and concise user stories that accurately reflected the needs of the app was a task that required constant revisions. Additionally, when I started working on the product backlog, I realized the importance of prioritizing tasks effectively. Creating the sprint planning and sprint backlog also posed challenges, as it was difficult to estimate realistic timeframes for each task while keeping the scope manageable. Working with the Kanban method was another hurdle, as I had to maintain a constant flow of tasks, ensuring that each item progressed smoothly from one stage to the next. The time constraints added to the complexity, making it difficult to keep up with the workload. Lastly, defining milestones for the project was a challenge, as there were so many details to consider, and I had to ensure that each milestone was achievable within the time limits. Despite these challenges, the experience taught me valuable lessons in time management, task prioritization, and the importance of thorough planning in a project management context.

## ASSIGNMENT 9 ##
While working on the domain model and class diagram, I faced a few challenges. One of the main challenges was deciding which objects to include in the domain model. At first, I thought of adding too many objects, but later I realised that would make the diagram too complicated and messy. I had to focus only on the important entities like User, Project, Task, Issue, Report, Comment, and Notification.

Another challenge I faced was defining relationships between objects. Sometimes I was not sure if I should use association, composition, or inheritance. I had to go back and check my previous assignments, like my use cases and state diagrams, to make sure that the relationships made sense. For example, I struggled a bit when connecting Task with User and Project, but finally I managed to show that a Task belongs to a Project and is assigned to a User.
Adding methods for each class was also tricky because I didn’t want to overload the diagram with too many functions. I only included the main methods like createProject(), updateStatus(), reportIssue(), and generateReport(), which are all directly linked to the system’s main functions from previous assignments.

This class diagram aligns well with my previous assignments. For example:

The User class supports user registration and login from Assignment 5 (Use Cases).
The Task class connects with the task workflow from Assignment 8 (State Diagrams).
The Project, Task, and Issue objects are all directly linked to functional requirements from Assignment 4.
The relationships between objects also follow the activity flows I created before.

One of the trade-offs I made was avoiding inheritance because my system didn’t really have objects that needed it. Instead, I used simple relationships like association and composition to keep the diagram clear and easy to understand. I also avoided adding extra technical details to keep the class diagram focused on the business logic of the project.
From this assignment, I learned a lot about object-oriented design. I now understand that a class diagram is not just about drawing boxes but about carefully showing how the system works in real life. I learned how important it is to balance between keeping the diagram simple but still detailed enough to explain the system properly. I also learned that working with diagrams helps to think deeply about the system before writing any code. Overall, this task really helped me improve my planning and system design skills. It showed me the importance of organising data, defining clear relationships, and thinking about future system development.
