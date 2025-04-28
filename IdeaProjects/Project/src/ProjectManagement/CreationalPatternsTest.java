package ProjectManagement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreationalPatternsTest {

    // 🔹 Simple Factory Tests
    @Test
    public void testSimpleFactory_Admin() {
        SimpleFactory.User user = SimpleFactory.UserFactory.createUser("Admin", "Alice");
        assertEquals("Admin", user.getRole());
    }

    @Test
    public void testSimpleFactory_TeamMember() {
        SimpleFactory.User user = SimpleFactory.UserFactory.createUser("TeamMember", "Charlie");
        assertEquals("Team Member", user.getRole());
    }

    // 🔹 Factory Method Tests
    @Test
    public void testFactoryMethod_ProgressReport() {
        FactoryMethod.ReportFactory factory = new FactoryMethod.ProgressReportFactory();
        FactoryMethod.Report report = factory.createReport();
        assertTrue(report instanceof FactoryMethod.ProgressReport);
    }

    @Test
    public void testFactoryMethod_TaskReport() {
        FactoryMethod.ReportFactory factory = new FactoryMethod.TaskReportFactory();
        FactoryMethod.Report report = factory.createReport();
        assertTrue(report instanceof FactoryMethod.TaskReport);

    }

    // 🔹 Abstract Factory Tests
    @Test
    public void testAbstractFactory_EmailNotification() {
        AbstractFactory.NotificationFactory factory = new AbstractFactory.EmailNotificationFactory();
        AbstractFactory.Notification notification = factory.createNotification();
        assertTrue(notification instanceof AbstractFactory.EmailNotification);
    }

    @Test
    public void testAbstractFactory_SMSNotification() {
        AbstractFactory.NotificationFactory factory = new AbstractFactory.SMSNotificationFactory();
        AbstractFactory.Notification notification = factory.createNotification();
        assertTrue(notification instanceof AbstractFactory.SMSNotification);
    }

    // 🔹 Singleton Test
    @Test
    public void testSingleton() {
        Singleton.Configuration config1 = Singleton.Configuration.getInstance();
        Singleton.Configuration config2 = Singleton.Configuration.getInstance();
        assertSame(config1, config2);
    }

    // 🔹 Prototype Test
    @Test
    public void testPrototypeTaskCloning() {
        Prototype.Task original = new Prototype.Task("Standup", "Scrum meeting");
        Prototype.Task clone = original.clone();
        assertNotSame(original, clone);
    }

    // 🔹 Builder Test
    @Test
    public void testBuilderProjectCreation() {
        Builder.Project project = new Builder.Project.ProjectBuilder("AI Chatbot")
                .description("Smart bot")
                .deadline("2025-06-01")
                .client("ABC Corp")
                .build();
        assertNotNull(project);
    }
}

