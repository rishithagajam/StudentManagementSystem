# Student Management System 📚

A Java-based Student Management System that allows efficient management of student information, course registrations, and administrative tasks. Integrated with MySQL, it provides a reliable and scalable solution for educational institutions.

## 🌐 Live Demo

Visit the project page: [https://rishithagajam.github.io/StudentManagementSystem/](https://rishithagajam.github.io/StudentManagementSystem/)

## 📋 Table of Contents

* [Project Overview](#project-overview)
* [Key Features](#key-features)
* [Technologies Used](#technologies-used)
* [Installation](#installation)
* [Usage](#usage)
* [Project Structure](#project-structure)
* [Testing](#testing)
* [Database Schema](#database-schema)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)

## 📖 Project Overview

This project is designed to simplify student management operations. With a clean MVC architecture, connection pooling, and a DAO layer, it ensures efficient handling of data and seamless interactions between the user interface and database.

## ✨ Key Features

* **CRUD Operations**: Manage students, courses, and authorities with ease
* **MVC Architecture**: Clear separation of Models, Views, and Controllers
* **Database Connection Pooling**: Efficient resource management using a singleton connection pool
* **Config Management**: Centralized configuration with the `ConfigLoader` utility
* **Reusable DAO Layer**: Structured database access with interfaces and implementations
* **Secure Queries**: SQL queries managed with constants to prevent SQL injection
* **Multi-threading**: Background database handling ensures smooth user experience
* **Graceful Shutdown**: Database connections close safely on application exit

## 🛠️ Technologies Used

* **Programming Language**: Java
* **Database**: MySQL
* **Testing**: JUnit 5
* **Build & Compilation**: Command-line or IDE (IntelliJ IDEA / Eclipse)
* **Version Control**: Git & GitHub

## 📥 Installation

### Prerequisites

* Java JDK 8 or higher
* MySQL Server
* Git

### Steps

1. **Clone the repository**
```bash
git clone https://github.com/rishithagajam/StudentManagementSystem.git
cd StudentManagementSystem
```

2. **Set up the database**

Create a MySQL database and import the schema:
```sql
CREATE DATABASE student_management;
USE student_management;
-- Run your schema.sql file here
```

3. **Configure database connection**

Edit `src/main/resources/config.properties`:
```properties
db.url=jdbc:mysql://localhost:3306/student_management
db.username=root
db.password=your_password
```

4. **Add dependencies**

Include MySQL JDBC driver in the `lib/` folder or add it via Maven/Gradle.

## 💻 Usage

### Compile and run the project using the command line:
```bash
# Navigate to project directory
cd StudentManagementSystem

# Compile
javac -cp .:lib/* -d bin src/main/java/com/StudentManagementSystem/Main.java

# Run
java -cp .:lib/*:bin com.StudentManagementSystem.Main
```

### Using IDE

1. Open the project in IntelliJ IDEA or Eclipse
2. Configure the MySQL JDBC driver
3. Run `Main.java`

Interact with the CLI to manage students, courses, and administrative tasks.

## 📂 Project Structure
```
StudentManagementSystem/
│
├── src/
│   ├── main/java/
│   │   ├── Controller/       # Handles user input and interactions
│   │   ├── Data/             # DAO interfaces and implementations
│   │   ├── Model/            # Entities: Student, Course, Authorities
│   │   ├── Util/             # Utilities: ConfigLoader, DatabaseManager
│   │   └── View/             # CLI Views for interaction
│   └── resources/            # Configuration files
│
├── test/                     # JUnit 5 test cases
├── lib/                      # Required libraries
├── .vscode/                  # VSCode configurations
├── README.md                 # Project documentation
└── LICENSE                   # MIT License
```

## 🧪 Testing

The project includes comprehensive test coverage:

* **Controller Tests**: Verify behavior of Admin and Student controllers
* **Utility Tests**: Validate `ConfigLoader` and `DatabaseManager` functionality
* **Test Resources**: Includes files like `testData.json`, `expectedOutput.txt`, and `testConfig.properties`

Run tests using:
```bash
# Using command line
java -cp .:lib/*:bin org.junit.runner.JUnitCore com.StudentManagementSystem.test.AllTests
```

## 🗄️ Database Schema

### Students Table
```sql
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    enrollment_date DATE
);
```

### Courses Table
```sql
CREATE TABLE courses (
    course_id INT PRIMARY KEY AUTO_INCREMENT,
    course_name VARCHAR(100) NOT NULL,
    credits INT
);
```

### Authorities Table
```sql
CREATE TABLE authorities (
    authority_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    role VARCHAR(20) NOT NULL
);
```

## 🤝 Contributing

Contributions are welcome! Please follow these steps:

1. Fork the project
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👤 Author

**Rishitha Gajam**

* GitHub: [@rishithagajam](https://github.com/rishithagajam)
* Portfolio: [https://rishithagajam.github.io/responsive/](https://rishithagajam.github.io/responsive/)
* Project Page: [https://rishithagajam.github.io/StudentManagementSystem/](https://rishithagajam.github.io/StudentManagementSystem/)

## 📧 Contact

For any questions or feedback, reach out at:

📧 **rishithagajam003@gmail.com**

## 🙏 Acknowledgments

* Thanks to all contributors who helped improve this project
* Inspired by modern educational management systems
* Built with best practices in Java development

## ⭐ Show Your Support

Give a ⭐️ if you like this project!

---

Made with ❤️ by Rishitha Gajam
