# 📋 Changelog


### [v1.0.0] – 2025-04-20
✅ Initial Java project setup  
✅ Created all class files and package structure (`Project_Management`)  
✅ Implemented the following Creational Design Patterns:
- Simple Factory (`UserFactory`)
- Factory Method (`TaskFactory`, `CodingTask`)
- Abstract Factory (`DashboardFactory`, `AdminFactory`, `AdminDashboard`)
- Builder (`ReportBuilder`)
- Prototype (`TaskTemplate`)
- Singleton (`DatabaseConnection`)

✅ Added core entity classes:
- `User`
  Task` (abstract with subclasses)
- Report`

✅ Created:
- CreationalPatternsTest.java` → to test all patterns
- PatternTests.java` → to validate patterns using simple assertions
-  ProjectEntities → to correspond with ClassDiagram


## Assignment 11 ## 

| File | Purpose |
|:---|:---|
| Repository.java | Generic CRUD operations using generics |
| UserRepository.java | Specialised repository interface for User |
| InMemoryUserRepository.java | In-memory storage of User entities |
| DatabaseUserRepository.java | Stub for future database storage |
| RepositoryFactory.java | Selects the correct repository based on storage type |
| Updated Main.java | to test repository functionality |

---
