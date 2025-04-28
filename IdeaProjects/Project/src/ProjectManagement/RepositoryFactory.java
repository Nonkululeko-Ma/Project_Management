package ProjectManagement;

import ProjectManagement.UserRepository;
import ProjectManagement.InMemoryUserRepository;


public class RepositoryFactory {



        public static UserRepository getUserRepository(String storageType) {
            switch (storageType.toUpperCase()) {
                case "MEMORY":
                    return new InMemoryUserRepository();
                case "DATABASE":
                    throw new UnsupportedOperationException("Database storage not implemented yet!");
                default:
                    throw new IllegalArgumentException("Invalid storage type: " + storageType);
            }
        }
    }


