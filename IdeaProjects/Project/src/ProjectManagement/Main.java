package ProjectManagement;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Simple Factory ---");
        SimpleFactory.User admin = SimpleFactory.UserFactory.createUser("Admin", "Nonku Magoso");
        SimpleFactory.User pm = SimpleFactory.UserFactory.createUser("ProjectManager", "Siphokazi Cele");
        SimpleFactory.User member = SimpleFactory.UserFactory.createUser("TeamMember", "Nokuthula Nene, Ongeziwe Qwayede");

        System.out.println("Created user: " + admin.getRole() + " - " + admin.name);
        System.out.println("Created user: " + pm.getRole() + " - " + pm.name);
        System.out.println("Created user: " + member.getRole() + " - " + member.name);

        System.out.println("\n--- Factory Method ---");
        FactoryMethod.ReportFactory progressFactory = new FactoryMethod.ProgressReportFactory();
        FactoryMethod.ReportFactory taskFactory = new FactoryMethod.TaskReportFactory();

        FactoryMethod.Report progressReport = progressFactory.createReport();
        FactoryMethod.Report taskReport = taskFactory.createReport();

        progressReport.generate();
        taskReport.generate();

        System.out.println("\n--- Abstract Factory ---");
        AbstractFactory.NotificationFactory emailFactory = new AbstractFactory.EmailNotificationFactory();
        AbstractFactory.NotificationFactory smsFactory = new AbstractFactory.SMSNotificationFactory();

        AbstractFactory.Notification email = emailFactory.createNotification();
        AbstractFactory.Notification sms = smsFactory.createNotification();

        email.notifyUser("Project deadline extended.");
        sms.notifyUser("Daily standup at 9AM.");

        System.out.println("\n--- Builder ---");
        Builder.Project project = new Builder.Project.ProjectBuilder("AI Chatbot")
                .description("Smart assistant chatbot")
                .deadline("2025-06-01")
                .client("University")
                .build();

        System.out.println("Project built: " + project);

        System.out.println("\n--- Prototype ---");
        Prototype.Task originalTask = new Prototype.Task("Daily Standup", "Attend scrum meeting");
        Prototype.Task copiedTask = originalTask.clone();

        System.out.println("Original task cloned successfully.");

        System.out.println("\n--- Singleton ---");
        Singleton.Configuration config1 = Singleton.Configuration.getInstance();
        Singleton.Configuration config2 = Singleton.Configuration.getInstance();

        if (config1 == config2) {
            System.out.println("Singleton verified: Both configurations are the same instance.");
        }

        // ------------------------------
        // Assignment 11: Repository Layer Testing
        // ------------------------------
        System.out.println("\n--- Repository Layer Test ---");

        UserRepository repo = RepositoryFactory.getUserRepository("MEMORY");

        ProjectEntities.User user = new ProjectEntities.User("Admin", "Nonkululeko");

        repo.save(user);

        Optional<ProjectEntities.User> foundUser = repo.findById("Nonkululeko");

        if (foundUser.isPresent()) {
            System.out.println("✅ User found: " + foundUser.get().getName());
        } else {
            System.out.println("❌ User not found.");
        }

        repo.delete("Nonkululeko");

        if (repo.findById("Nonkululeko").isEmpty()) {
            System.out.println("✅ User successfully deleted.");
        }
    }
}
