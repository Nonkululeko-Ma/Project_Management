package ProjectManagement;

public class Builder {
    // Project.java
    public static class Project {
        private String name;
        private String description;
        private String deadline;
        private String client;

        private Project(ProjectBuilder builder) {
            this.name = builder.name;
            this.description = builder.description;
            this.deadline = builder.deadline;
            this.client = builder.client;
        }

        public static class ProjectBuilder {
            private String name;
            private String description;
            private String deadline;
            private String client;

            public ProjectBuilder(String name) { this.name = name; }
            public ProjectBuilder description(String desc) { this.description = desc; return this; }
            public ProjectBuilder deadline(String deadline) { this.deadline = deadline; return this; }
            public ProjectBuilder client(String client) { this.client = client; return this; }
            public Project build() { return new Project(this); }
        }
    }
    Project p = new Project.ProjectBuilder("AI Chatbot")
            .description("Builds a smart chatbot")
            .deadline("2025-06-01")
            .build();

}
