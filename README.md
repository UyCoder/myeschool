# E-School Management System

## 📖 Overview
This project is an online school management system that allows administrators, teachers and students to manage and access information related to the school. The project includes modules for managing grades, classes, teachers, students, and personal information. It also includes a login and authentication system for controlling access to the different modules.

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

## 🛠 Requirements
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
![01](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/01.png)

<details>
<summary><strong>Show more</strong></summary>

![02](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/02-.png)
![03](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/03-.png)
![04](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/04-.png)
![05](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/05-.png)
![06](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/06-.png)
![07](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/07-.png)
![08](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/08.png)
![09](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/09.png)
![10](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/10.png)
 
</details>

### Screenshots for swagger file
![11](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/swagger1.png)
<details> 
 <summary><strong>Show more</strong></summary> 

![11](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/swagger1.png)
![12](https://github.com/UyCoder/myeschool/blob/master/src/main/resources/Screenshots/swagger2.png)

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

## 🔧 Technologies and Tools Used
- HTML, CSS, and JavaScript for front-end development
- Vue.js as the JavaScript framework
- JSON for data transfer
- Java for back-end development
- Spring for back-end application
- JWT for Security Authentication
- MD5 for Encryption
- MySQL as the database management system
- JDBC for database connectivity
- Swagger for API documentation
- Mybatis Plus for database access
- Maven for project management and dependency management
- Git for version control
- Tomcat as the application server
- IntelliJ IDEA as the development environment
- Postman for API testing
- Chrome as the web browser


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

## Dependencies
1. `spring-boot-starter`: This is a basic dependency for Spring Boot application development. It includes a set of commonly used libraries for building web applications.

2. `spring-boot-starter-web`: This dependency includes libraries for building web applications, such as Spring MVC, tomcat, and spring web.

3. `spring-boot-starter-test`: This dependency includes libraries for testing Spring Boot applications, such as JUnit, Hamcrest, and Mockito.

4. `spring-boot-starter-thymeleaf`: This dependency includes the Thymeleaf template engine for building web pages in a Spring Boot application.

5. `mybatis-plus-boot-starter`: This dependency includes the Mybatis Plus library for working with databases in a Spring Boot application.

6. `lombok`: This dependency includes the Lombok library, which provides additional functionality for writing Java code, such as automatic getters and setters.

7. `mysql-connector-java`: This dependency includes the MySQL Connector/J library, which allows a Spring Boot application to connect to a MySQL database.

8. `mybatis-plus-generator`: This dependency includes the Mybatis Plus Generator library, which can automatically generate code for working with databases in a Spring Boot application.

9. `freemarker`: This dependency includes the FreeMarker template engine, which can be used to build web pages in a Spring Boot application.

10. `springfox-swagger2`: This dependency includes the Springfox library for generating API documentation in Swagger format.

11. `springfox-swagger-ui`: This dependency includes the Springfox library for displaying API documentation in a web UI.

12. `knife4j-spring-boot-starter`: This dependency includes a set of libraries for building web applications with knife4j

13. `spring-boot-devtools`: This dependency includes libraries that improve the development experience, such as automatic reloading of changes.

14. `fastjson`: This dependency includes the Fastjson library, which is a JSON processing library that can be used in a Spring Boot application.

15. `jjwt`: This dependency includes the JJWT library, which provides functionality for creating and validating JSON Web Tokens.

16. `commons-fileupload`: This dependency includes the Apache Commons FileUpload library, which can be used to handle file uploads in a Spring Boot application.

17. `postgresql`: This dependency includes the PostgreSQL JDBC driver, which allows a Spring Boot application to connect to a PostgreSQL database.


<details> 
 <summary><strong>Show more</strong></summary>

```shell

    <dependencies>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>


        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <!-- thymeleaf -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>

        <!--  mybatis-plus-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.3.1</version>
        </dependency>

        <!--  POJO  -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <!--mysql-->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
        </dependency>

        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-generator</artifactId>
            <version>3.3.1</version>
        </dependency>
        <dependency>
            <groupId>org.freemarker</groupId>
            <artifactId>freemarker</artifactId>
            <version>2.3.31</version>
        </dependency>

        <!--swagger-->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger2</artifactId>
            <version>2.7.0</version>
        </dependency>
        <!--swagger ui-->
        <dependency>
            <groupId>io.springfox</groupId>
            <artifactId>springfox-swagger-ui</artifactId>
            <version>2.7.0</version>
        </dependency>
        <!--swagger2  -->
        <dependency>
            <groupId>com.github.xiaoymin</groupId>
            <artifactId>knife4j-spring-boot-starter</artifactId>
            <version>2.0.4</version>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>

        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.29</version>
        </dependency>

        <!-- JWT Token-->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt</artifactId>
            <version>0.7.0</version>
        </dependency>

        <dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.4</version>
        </dependency>

        <dependency>
            <groupId>org.lucee</groupId>
            <artifactId>postgresql</artifactId>
            <version>8.3-606.jdbc4</version>
        </dependency>
    </dependencies>

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

### API documentation
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

