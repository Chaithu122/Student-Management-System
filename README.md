# 🎓 Student Management System
## 🎯 Objective
I develop a Student Management System using Spring Boot, Thymeleaf, and MySQL that demonstrates CRUD operations with a clean MVC architecture, while improving backend development skills and understanding of enterprise Java frameworks.


## 🌐 Live Demo
 Check out the live version of the Student-Management-System here:  
👉[Live Demo](http://localhost:5050)



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

1. Install MySQL 

2. Create a database
```
CREATE DATABASE student_db;
```

3. Configure database credentials in src/main/resources/application.properties:

  ```
 # Database URL
spring.datasource.url=jdbc:mysql://localhost:3306/student_db

# Database username
spring.datasource.username=root

# Database password
spring.datasource.password=your_password

# Hibernate settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

```

4. Optional Settings

- spring.jpa.hibernate.ddl-auto can be set to:

- update → Automatically updates the database schema

- create → Creates a new schema every time (all previous data will be lost)

- validate → Validates the schema without changing it

  Once configured, your Spring Boot application will automatically connect to the MySQL database when you run it.

 ## 📸 Screenshots
 Here are some screenshots of the Student Management System 

 ## 🏠 Home Page

 <img src="https://github.com/user-attachments/assets/f76eed1d-cfba-4f50-810a-6748ef89dac4" alt="homepage"/>

## ➕ Add New Student
<img src="https://github.com/user-attachments/assets/7934b00b-47f7-414f-af08-bdb6c6379814" alt="add new student"/>

## ✏ Edit Student Details
<img src="https://github.com/user-attachments/assets/f8c31d56-4858-4260-8bd0-676037073c73" alt="update page"/>

## 🗑 Delete Student 
<img src="https://github.com/user-attachments/assets/2d491c89-ac91-4156-afea-904efc563e35" alt="deletepage"/>


## 📡 API Documentation

The Student Management System exposes the following REST APIs:

| *HTTP Method* | *Endpoint*               | *Description*                 |
|-----------------|---------------------------|---------------------------------|
| **GET**         | /students               | 📝 Retrieve all students        |
| **GET**         | /students/{id}          | 🔍 Get a student by ID          |
| **POST**        | /students               | ➕ Add a new student             |
| **PUT**         | /students/{id}          | ✏ Update an existing student   |
| **DELETE**      | /students/{id}          | 🗑 Delete a student             |


## 🙏 Acknowledgements
- Special thanks to Spring Boot, Thymeleaf, and MySQL communities for their excellent documentation and support.

- Inspired by various open-source student management projects.

  ## 👤 Author

**Project Name:** Student Management System  

**Author:** Krishna Chaithanya Pigilapu

**Email:** pigilapuchaithanya123@gmail.com

**GitHub**: [https://github.com/Chaithu122](https://github.com/Chaithu122)  

**About the Author:**

**Passionate Java Full Stack Developer** with a strong foundation in **Core Java, Spring Boot, REST APIs, HTML, CSS, JavaScript, and React JS.** Skilled in building **responsive web applications** and **robust backend systems** using clean and maintainable code.  

Possesses a good understanding of **object-oriented programming, database concepts**, and the **full software development lifecycle**. A **quick learner** with a strong interest in contributing to **innovative and collaborative development environments**.




## 📫 Contact Me:


Name: Krishna chaitanya Pigilapu

Email:pigilapuchaithanya123@gmail.com

GitHub: [https://github.com/Chaithu122](https://github.com/Chaithu122) 

LinkedIn[https://www.linkedin.com/in/krishna-chaithanya-pigilapu-655563349/](https://www.linkedin.com/in/krishna-chaithanya-pigilapu-655563349/)

                    
   **🙏 Thank you for taking the time to review this project.**























   








  

 















