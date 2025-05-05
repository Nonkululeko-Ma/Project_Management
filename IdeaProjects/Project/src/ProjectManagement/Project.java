package ProjectManagement;

public class Project {
    private String id;
    private String name;
    private String description;
    private String status = "Pending"; // Default status

    // Constructors
    public Project() {}

    public Project(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = "Pending";
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
