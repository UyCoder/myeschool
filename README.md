# E-School Management System

## Overview
This project is an online school management system that allows administrators, teachers, students, and parents to manage and access information related to the school. The project includes modules for managing grades, classes, teachers, students, and personal information. It also includes a login and authentication system for controlling access to the different modules.

## 🚀 Features
- Student information management
- Teacher information management
- Class schedule management
- Assignment management
- Attendance tracking
- Grade management
- Parent and student portals
- Communication tools for teachers, parents, and students
- Reporting and analytics

## Requirements
- Functionality requirement analysis
- Database design
- Login control
- Grade module
- Class module
- Teacher module
- Student module
- Administrator module
- Personal information management module
- Access control

### Screenshots of the user interface:

<details>
<summary><strong>Show more</strong></summary>

![02](https://user-images.githubusercontent.com/50663127/160109171-202eda6d-4102-4a77-9f27-b330af5a24f4.PNG)

</details>

### Screenshots for swagger file

<details> 
 <summary><strong>Show more</strong></summary> 

![08](https://user-images.githubusercontent.com/50663127/160109272-9a1d3c56-af65-4edb-8cc2-1790a10f013f.PNG)

</details>

## Challenges and solutions
- `Challenge 1`: Issues with interface documentation and testing during front-end and back-end separation. 
  - `Solution`: Utilizing swagger2 for interface documentation and testing.

- `Challenge 2`: Issues with maintaining the validity of login verification using cookie and session. 
  - `Solution`: Implementing token-based authentication for login verification.

- `Challenge 3`: Different permissions for administrators, teachers, and students after login. 
  - `Solution`: Querying different tables based on user type and displaying different pages based on user type.

- `Challenge 4`: Data security issues. 
  - `Solution`: Implementing MD5 encryption for passwords and performing password verification in ciphertext form.

## 📖 Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

## 🔧 Technologies and Tools Used
- HTML, CSS, and JavaScript for front-end development
- Vue.js as the JavaScript framework
- JSON for data transfer
-  Java and Spring Boot for back-end development
-   MySQL as the database management system
-   JDBC for database connectivity
-   Swagger for API documentation
-   Mybatis Plus for database access
-   Maven for project management and dependency management
-   Git for version control
-   Tomcat as the application server
-   IntelliJ IDEA as the development environment
-   Postman for API testing
-   Chrome as the web browser


## Project Structure
The project is structured as follows:
<details> 
 <summary><strong>Show more</strong></summary> 

```shell
myeschool
├── config
├── controller
├── mapper
├── pojo
├── service
│   └── impl
└── util 
```
</details>

- The `config` directory contains the configuration files for the project.
- The `controller` directory contains the controllers that handle the incoming requests and provide the appropriate responses.
- The `mapper` directory contains the mappers that interact with the database.
- The `pojo` directory contains the plain old Java objects (POJOs) that represent the entities in the system.
- The `service` directory contains the services that handle the business logic of the system. The `impl` subdirectory contains the implementation of these services.
- The `util` directory contains utility classes used throughout the project.

### Whole project file structure
<details> 
 <summary><strong>Show more</strong></summary>

```shell
───myeschool
    │   MyeschoolApplication.java
    │
    ├───config
    │       MyConfig.java
    │       Swagger2Config.java
    │
    ├───controller
    │       AdminController.java
    │       ClazzController.java
    │       GradeController.java
    │       StudentController.java
    │       SystemController.java
    │       TeacherController.java
    │
    ├───mapper
    │       AdminMapper.java
    │       ClazzMapper.java
    │       GradeMapper.java
    │       StudentMapper.java
    │       TeacherMapper.java
    │
    ├───pojo
    │       Admin.java
    │       Clazz.java
    │       Grade.java
    │       LoginForm.java
    │       Student.java
    │       Teacher.java
    │
    ├───service
    │   │   AdminService.java
    │   │   ClazzService.java
    │   │   GradeService.java
    │   │   StudentService.java
    │   │   TeacherService.java
    │   │
    │   └───impl
    │           AdminServiceImpl.java
    │           ClazzServiceImpl.java
    │           GradeServiceImpl.java
    │           StudentServiceImpl.java
    │           TeacherServiceImpl.java
    │
    └───util
            AuthContextHolder.java
            CreateVerifiCodeImage.java
            JwtHelper.java
            MD5.java
            Result.java
            ResultCodeEnum.java
            UploadFile.java

```

</details>


### Usage
- Clone the repository
- Configure the database connection in the config package
- Build and run the application with the command mvn spring-boot:run
- Access the application in your browser at http://localhost:9001
- Use the API documentation provided by Swagger to test the different endpoints
- Use Postman to test the different endpoints
- Use chrome to test the application

### How to run the project
1. Clone the project from the repository
2. Import the project in intellij idea and run the maven command "mvn clean install"
3. Run the project as Spring Boot Application
4. Access the API documentation using Swagger at http://localhost:9001/swagger-ui.html


## API documentation
API documentation can be accessed through swagger-ui by running the project on localhost and visiting the endpoint: http://localhost:9001/swagger-ui.html


## 📦 Installing
1. Clone the repository to your local machine
```
git clone https://github.com/UyCoder/myeschool.git
```
2. Import the project to your preferred IDE as a Maven project
3. Update the application.properties file with your MySQL credentials
4. Build the project using Maven
```
mvn clean install
```
5. Deploy the project to Tomcat
## 🛠 Built With
- Spring Boot - The web framework used
- Mybatis Plus - ORM framework
- Vue.js - JavaScript framework
- Maven - Dependency Management
## 🤝 Contributing
Please read ```CONTRIBUTING.md``` for details on our code of conduct, and the process for submitting pull requests to us.

## 📈 Versioning
We use ```SemVer``` for versioning. For the versions available, see the tags on this repository.

## 👨‍💻 Contact me
Author: [Ahmed Bughra](https://www.linkedin.com/in/ahmed-bughra/)
</br>
You can find me there: </br>
[<img src='https://www.pngall.com/wp-content/uploads/2016/07/Linkedin-Download-PNG.png' alt='linkedin' height='20'>](https://www.linkedin.com/in/ahmed-bughra/) [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='20'>](https://github.com/Uycoder)
[<img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRYcIooQ9bkjqGM1p-kwFPb0h4zZEVDzzRS3uhdg1sySKkvvNTE_wm5WTQWK36k7LH744w&usqp=CAU' alt='hackerrank' height='20'>](https://www.hackerrank.com/ahmedbughra)  [<img src='https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/Stack_Overflow_icon.svg/768px-Stack_Overflow_icon.svg.png' alt='stackoverflow' height='20'>](https://stackoverflow.com/users/16111723/ahmad-ali)

<p align="right">(<a href="#Table-of-contents">Table of Contents</a>)</p>