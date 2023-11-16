<h1 align="center">Building a Simple RESTful API Assignment</h1>

## 1. Completed tasks
- Implemented all RESTful endpoints that the assignment required.
- Bonus points:
    - Implemented error handling for each endpoint.
    - Used Spring Data JPA to store the task data in a MySQL database.

## 2. Tech stack and tool
- Use Maven to to manage dependencies.
- Java 8.
- Spring Boot 2.7.18.
- Spring Data JPA.
- MySQL.
- IntelliJ IDEA.

## 3. The steps to run the project

- Download the `task.zip` file and extract it.
- Open the task folder with your IDE.
- In the `application.properties` file, change your database name, username and password:
```sh
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/<your-database-name>
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username = <your-username>
spring.datasource.password = <your-password>
```
- Run project.