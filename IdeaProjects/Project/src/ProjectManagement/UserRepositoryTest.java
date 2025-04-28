package ProjectManagement;

import ProjectManagement.SimpleFactory;
import ProjectManagement.UserRepository;
import ProjectManagement.InMemoryUserRepository;

public class UserRepositoryTest {
    public static void main(String[] args) {

        UserRepository repo = new InMemoryUserRepository() {
            @Override
            public void save(ProjectEntities.User user) {

            }
        };

        ProjectEntities.User user = new ProjectEntities.User("Admin", "Nonkululeko");
        repo.save(user);

        assert repo.findById("Nonkululeko").isPresent();
        assert repo.findAll().size() == 1;

        repo.delete("Nonkululeko");
        assert repo.findById("Nonkululeko").isEmpty();

        System.out.println(" All UserRepository tests passed!");
    }
}
