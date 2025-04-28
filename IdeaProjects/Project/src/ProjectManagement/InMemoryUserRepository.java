package ProjectManagement;

import ProjectManagement.ProjectEntities.User;

import java.util.*;

public class InMemoryUserRepository extends UserRepository {

    private final Map<String, User> storage = new HashMap<>();

    @Override
    public void save(User user) {
        storage.put(user.getName(), user);
    }

    @Override
    public void save(ProjectManagement.SimpleFactory.User user) {

    }

    @Override
    public Optional<User> findById(String name) {
        return Optional.ofNullable(storage.get(name));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String name) {
        storage.remove(name);
    }
}
