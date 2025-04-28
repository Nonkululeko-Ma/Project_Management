package ProjectManagement;

public class SimpleFactory {

    // Base abstract User class
    public static abstract class User extends ProjectEntities.User {
        protected String name;

        public User(String name) {
            this.name = name;
        }

        public abstract String getRole();

        public String getName() {
            return "";
        }
    }

    // Admin class
    public static class Admin extends User {
        public Admin(String name) {
            super(name);
        }

        public String getRole() {
            return "Admin";
        }
    }

    // ProjectManager class
    public static class ProjectManager extends User {
        public ProjectManager(String name) {
            super(name);
        }

        public String getRole() {
            return "Project Manager";
        }
    }

    // TeamMember class
    public static class TeamMember extends User {
        public TeamMember(String name) {
            super(name);
        }

        public String getRole() {
            return "Team Member";
        }
    }

    // UserFactory class
    public static class UserFactory {
        public static User createUser(String type, String name) {
            switch (type) {
                case "Admin":
                    return new Admin(name);
                case "ProjectManager":
                    return new ProjectManager(name);
                case "TeamMember":
                    return new TeamMember(name);
                default:
                    throw new IllegalArgumentException("Unknown user type");
            }
        }
    }

    // Main method to test the factory
    public static void main(String[] args) {
        User admin = UserFactory.createUser("Admin", "Alice");
        User pm = UserFactory.createUser("ProjectManager", "Bob");
        User member = UserFactory.createUser("TeamMember", "Charlie");

        System.out.println(admin.name + " is an " + admin.getRole());
        System.out.println(pm.name + " is a " + pm.getRole());
        System.out.println(member.name + " is a " + member.getRole());
    }
}
