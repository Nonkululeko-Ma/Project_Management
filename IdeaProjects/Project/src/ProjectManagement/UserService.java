package ProjectManagement;

import java.util.Optional;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = RepositoryFactory.getUserRepository("MEMORY");
    }

    public void saveUser(ProjectEntities.User user) {
        userRepository.save(user);
    }

    public Optional<ProjectEntities.User> findUserByName(String name) {
        return userRepository.findById(name);
    }

    public void deleteUser(String name) {
        userRepository.delete(name);
    }
}
