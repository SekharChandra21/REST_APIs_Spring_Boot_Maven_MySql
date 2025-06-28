# 🎓 Student Management System - Spring Boot Maven + MySQL

A simple RESTful API for managing student records using **Spring Boot**, **Spring Data JPA**, and **MySQL **.

---

## 🚀 Features

- View all students
- Retrieve student by ID
- Connects to MySQL
- Auto-creates table using JPA
- Easy to extend with Create, Update, Delete APIs

---

## 🛠️ Tech Stack

- **Java 17+**
- **Spring Boot 3.5**
- **Spring Data JPA**
- **MySQL**
- **Maven** for dependency management

---

## ⚙️ Getting Started

### 1. Clone the Repository

```
git clone https://github.com/your-username/student-management-api.git
cd student-management-api

```

### 2. Configure Database
Check src/main/resources/application.properties:
```
spring.datasource.url=jdbc:mysql:localhost:3306/your_database_name
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 3. Build and Run the App

```
mvn clean install
mvn spring-boot:run
```

### Project Structure
├── model/
│   └── StudentDetails.java
├── repository/
│   └── StudentRepo.java
├── controller/
│   └── StudentRecordsHandler.java
├── StudentDemoApplication.java
└── resources/
    └── application.properties
