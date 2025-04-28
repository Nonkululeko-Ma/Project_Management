```mermaid
classDiagram
    class Repository {
        +save(entity)
        +findById(id)
        +findAll()
        +delete(id)
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
