package ProjectManagement;

public class AbstractFactory {
    // Notification.java
    public interface Notification {
        void notifyUser(String message);
    }

    // EmailNotification.java
    public static class EmailNotification implements Notification {
        public void notifyUser(String message) { System.out.println("Email: " + message); }
    }

    // SMSNotification.java
    public static class SMSNotification implements Notification {
        public void notifyUser(String message) { System.out.println("SMS: " + message); }
    }

    // NotificationFactory.java
    public interface NotificationFactory {
        Notification createNotification();
    }

    // EmailNotificationFactory.java
    public static class EmailNotificationFactory implements NotificationFactory {
        public Notification createNotification() { return new EmailNotification(); }
    }

    // SMSNotificationFactory.java
    public static class SMSNotificationFactory implements NotificationFactory {
        public Notification createNotification() { return new SMSNotification(); }
    }

}
