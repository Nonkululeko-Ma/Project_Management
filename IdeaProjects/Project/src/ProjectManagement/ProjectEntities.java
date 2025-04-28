package ProjectManagement;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectEntities {

    // --------- User Class ---------
    public static class User {
        private String userID;
        private String name;
        private String email;
        private String role;
        private String status;

        public User(String admin, String nonkululeko) {
        }

        public User() {
        }

        public void register() {
            System.out.println(name + " registered.");
        }

        public void login() {
            System.out.println(name + " logged in.");
        }

        public void updateProfile() {
            System.out.println(name + " updated their profile.");
        }

        public String getName() {
            return "";
        }
    }

    // --------- Project Class ---------
    public static class Project {
        private String projectID;
        private String title;
        private String description;
        private String status;
        private List<Task> tasks = new ArrayList<>();
        private List<Report> reports = new ArrayList<>();

        public void createProject() {
            System.out.println("Project created: " + title);
        }

        public void archiveProject() {
            status = "Archived";
            System.out.println("Project archived: " + title);
        }
    }

    // --------- Task Class ---------
    public static class Task {
        private String taskID;
        private String title;
        private String description;
        private String status;
        private Date deadline;
        private User assignedTo;
        private List<Issue> issues = new ArrayList<>();
        private List<Comment> comments = new ArrayList<>();

        public void assignTask(User user) {
            this.assignedTo = user;
            System.out.println("Task assigned to: " + user.name);
        }

        public void updateStatus(String newStatus) {
            this.status = newStatus;
            System.out.println("Task status updated to: " + newStatus);
        }
    }

    // --------- Issue Class ---------
    public static class Issue {
        private String issueID;
        private String title;
        private String description;
        private String status;
        private List<Comment> comments = new ArrayList<>();

        public void reportIssue() {
            System.out.println("Issue reported: " + title);
        }

        public void closeIssue() {
            this.status = "Closed";
            System.out.println("Issue closed: " + title);
        }
    }

    // --------- Comment Class ---------
    public static class Comment {
        private String commentID;
        private String content;
        private Date date;

        public void addComment() {
            System.out.println("Comment added: " + content);
        }

        public void deleteComment() {
            System.out.println("Comment deleted.");
        }
    }

    // --------- Report Class ---------
    public static class Report {
        private String reportID;
        private String title;
        private Date dateGenerated;

        public void generateReport() {
            System.out.println("Report generated: " + title);
        }

        public void downloadReport() {
            System.out.println("Downloading report: " + title);
        }
    }

    // --------- Notification Class ---------
    public static class Notification {
        private String notificationID;
        private String message;
        private Date date;
        private String status;
        private User sentTo;

        public void sendNotification() {
            System.out.println("Notification sent to " + sentTo.name + ": " + message);
        }

        public void markAsRead() {
            this.status = "Read";
            System.out.println("Notification marked as read.");
        }
    }
}
