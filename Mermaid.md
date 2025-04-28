```mermaid
classDiagram
    class Repository~T, ID~ {
        +save(T entity)
        +findById(ID id)
        +findAll()
        +delete(ID id)
    }

    class User

    class UserRepository {
    }

    class InMemoryUserRepository {
        +Map<String, User> storage
    }

    class DatabaseUserRepository {
    }

    Repository <|-- UserRepository
    UserRepository <|-- InMemoryUserRepository
    UserRepository <|-- DatabaseUserRepository
    User --> UserRepository
