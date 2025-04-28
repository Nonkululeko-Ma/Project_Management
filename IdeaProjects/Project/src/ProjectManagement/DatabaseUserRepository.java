package ProjectManagement;
import ProjectManagement.ProjectEntities.User;
import java.util.*;

public abstract class DatabaseUserRepository extends UserRepository {   // ✅ implements UserRepository

    @Override
    public void save(ProjectEntities.User user) {
        throw new UnsupportedOperationException("Database storage not implemented yet!");
    }

    @Override
    public Optional<User> findById(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet!");
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Database storage not implemented yet!");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database storage not implemented yet!");
    }
}
