package ProjectManagement;

public class Prototype {
    // Task.java
    public static class Task implements Cloneable {
        private String title;
        private String description;
        public Task(String title, String description) {
            this.title = title; this.description = description;
        }
        public Task clone() {
            try { return (Task) super.clone(); }
            catch (CloneNotSupportedException e) { throw new AssertionError(); }
        }
    }
    Task template = new Task("Daily Standup", "Attend scrum meeting");
    Task clonedTask = template.clone();

}
