package ProjectManagement;

import java.util.Optional;

public class UserController {

    private final UserService userService;

    public UserController() {
        this.userService = new UserService(); // We’ll define this service class
    }

    public void createUser(String role, String name) {
        ProjectEntities.User user = new ProjectEntities.User(role, name);
        userService.saveUser(user);
        System.out.println("✅ User created: " + user.getName() + " (" + user.getRole() + ")");
    }

    public boolean getUser(String name) {
        Optional<ProjectEntities.User> user = userService.findUserByName(name);
        if (user.isPresent()) {
            System.out.println("✅ Found user: " + user.get().getName() + " - " + user.get().getRole());
            return true;
        } else {
            System.out.println("❌ User not found: " + name);
            return false;
        }
    }


    public void deleteUser(String name) {
        userService.deleteUser(name);
        System.out.println("🗑️ Deleted user: " + name);
    }
}
