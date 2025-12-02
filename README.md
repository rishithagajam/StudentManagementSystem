# Student Management System 📚

A **Java-based Student Management System** that allows efficient management of student information, course registrations, and administrative tasks. Integrated with **MySQL**, it provides a reliable and scalable solution for educational institutions.

---

## Table of Contents

* [Project Overview](#project-overview)
* [Key Features](#key-features)
* [Technologies Used](#technologies-used)
* [Installation](#installation)
* [Usage](#usage)
* [Project Structure](#project-structure)
* [Testing](#testing)
* [Contact](#contact)

---

## Project Overview

This project is designed to simplify **student management operations**. With a clean **MVC architecture**, connection pooling, and a DAO layer, it ensures efficient handling of data and seamless interactions between the user interface and database.

---

## Key Features

* **CRUD Operations:** Manage students, courses, and authorities with ease.
* **MVC Architecture:** Clear separation of Models, Views, and Controllers.
* **Database Connection Pooling:** Efficient resource management using a singleton connection pool.
* **Config Management:** Centralized configuration with the `ConfigLoader` utility.
* **Reusable DAO Layer:** Structured database access with interfaces and implementations.
* **Secure Queries:** SQL queries managed with constants to prevent SQL injection.
* **Multi-threading:** Background database handling ensures smooth user experience.
* **Graceful Shutdown:** Database connections close safely on application exit.

---

## Technologies Used

* **Programming Language:** Java
* **Database:** MySQL
* **Testing:** JUnit 5
* **Build & Compilation:** Command-line or IDE (IntelliJ IDEA / Eclipse)

---

## Installation

1. **Clone the repository**

```bash
git clone https://github.com/rishithagajam/StudentManagementSystem.git
```

2. **Configure database connection**
   Edit `src/main/resources/config.properties`:

```properties
db.url=jdbc:mysql://localhost:3306/your_database
db.username=root
db.password=your_password
```

3. **Add dependencies**
   Include MySQL JDBC driver in the `lib/` folder.

---

## Usage

Compile and run the project using the command line:

```bash
# Navigate to project directory
cd StudentManagementSystem

# Compile
javac -cp .:lib/* -d bin src/main/java/com/StudentManagementSystem/Main.java

# Run
java -cp .:lib/*:bin com.StudentManagementSystem.Main
```

Interact with the CLI to manage students, courses, and administrative tasks.

---

## Project Structure

```
src/
├─ main/java/
│  ├─ Controller/       # Handles user input and interactions
│  ├─ Data/             # DAO interfaces and implementations
│  ├─ Model/            # Entities: Student, Course, Authorities
│  ├─ Util/             # Utilities: ConfigLoader, DatabaseManager
│  └─ View/             # CLI Views for interaction
├─ resources/           # Configuration files
test/                   # JUnit 5 test cases
lib/                    # Required libraries
.vscode/                # VSCode configurations
```

---

## Testing

* **Controller Tests:** Verify behavior of Admin and Student controllers.
* **Utility Tests:** Validate `ConfigLoader` and `DatabaseManager` functionality.
* **Test Resources:** Includes files like `testData.json`, `expectedOutput.txt`, and `testConfig.properties`.

---

## Contact

For any questions or feedback, reach out at:
📧 **[rishithagajam003@gmail.com](mailto:rishithagajam003@gmail.com)**
