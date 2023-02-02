# 👀 Do you want to see the demo of the project?
You don't need to run the Database management system. 
Just donwload the jar file and 2 of db files. 
Then you can execute the project. Because I used H2 databse for this project.
So the Database will execute in the memory.
`But note that you need that to db files in the same directory.`

## 🏃How to execute the project
- I created jar file and H2 databse db file for the project in `ExecutableJarFileAndH2DatabseFiles` folder.
- Download the files in `ExecutableJarFileAndH2DatabseFiles`
- Execute the command below in CMD in the `ExecutableJarFileAndH2DatabseFiles` folder
```shell
java -jar myeschool-0.0.1-SNAPSHOT.jar
```
- `localhost:9001` to open the project
- `localhost:9001/swagger-ui.html` to open the swagger documentation
- `http://localhost:9001/h2-console` to open the H2 database console
    - Driver Class : org.h2.Driver
    - JDBC URL : jdbc:h2:file:./sql
    - User Name : sa
    - Password : password