# 🎓 Student Management System
## 🎯 Objective
I develop a Student Management System using Spring Boot, Thymeleaf, and MySQL that demonstrates CRUD operations with a clean MVC architecture, while improving backend development skills and understanding of enterprise Java frameworks.

🌐 **Live URL:** 

![Live Demo](https://img.shields.io/badge/Visit-Live%20Site-blue?style=for-the-badge&logo=google-chrome)

## 📌 Key Highlights
- ➕ Add new student details
- 📋 View list of all students
- ✏ Edit / Update existing student information
- ❌ Delete student record
- ✅ Server-side validation using Spring Validation
- 🧱 Layered MVC architecture (Controller → Service → Repository → DB)
- 🗄 Data persistence using Spring Data JPA and MySQL
- 📦 Maven based project setup for easy build & run

## 🛠 Tech Stack
**Backend:** Spring Boot, Spring MVC, Spring Data JPA, Hibernate  
**Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap  
**Database:** MySQL  
**Build Tool:** Maven  
**IDE Used:** Spring Tool Suite 

## 📂 Project Structure
```

student-management-system
│
├── src/main/java
│   └── com.web
│       ├── controller
│       ├── model
│       ├── repository
│       ├── service
│       └── StudentManagementSystemApplication.java
│
├── src/main/resources
│   ├── templates
│   ├── static
│   └── application.properties
│
├── pom.xml
└── README.md
```

## 🚀 Installation & Running the Project
Follow these steps to run the Student Management System on your local machine:
1. **Clone the repository**
 ```
git clone <your-repository-link>
```

2. **Open the project in your IDE**
- Recommended: IntelliJ IDEA or Eclipse or Spring Tool Suite


3. **Configure the database**
- Install MySQL or use any preferred database.

- Create a database named: student_db

- Update application.properties with your database credentials:

```
spring.datasource.url=jdbc:mysql://localhost:3306/student_db

spring.datasource.username=root

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```
4. Build the project
- Using Maven:

  ```
   mvn clean install
  
  ```
  
5. Run the project
   
  - Run the main class StudentManagementSystemApplication.java from your IDE
  - Or using Maven:

    ```
    mvn spring-boot:run
    ```

6. Access the application

- Open your browser and go to:

  ```
  http://localhost:8080
  ```

7. Start managing students!
- You can now add, edit, view, and delete student records through the web interface.

## 🗄 Database Configuration
The project uses MySQL to store student data. Follow these steps to set up the database:







  

 















