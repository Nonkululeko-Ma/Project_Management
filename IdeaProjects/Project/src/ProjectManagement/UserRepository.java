package ProjectManagement;
import ProjectManagement.ProjectEntities;
import java.util.List;
import java.util.Optional;

public abstract class UserRepository {


    public abstract void save(ProjectEntities.User user);

    public abstract void save(ProjectManagement.SimpleFactory.User user);

    public abstract Optional<ProjectEntities.User> findById(String name);

    public abstract List<ProjectEntities.User> findAll();

    public abstract void delete(String name);

    public interface SimpleFactory extends Repository<ProjectEntities.User, String> {
    }

}
