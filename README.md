# employeesREST
EmployeesREST is a CRUD API for the management of Employees. It was made for purely educational purposes

## Installation
- You can run the project in the IDE of your choice (I used IntelliJ IDEA 2023.2.3), together with a MySQL database.

- You can also build the project and run the jar file.

- Lastly, a Dockerfile is included to dockerize the API.

- A MySQL data dump is included for you to import in your DB

## Technologies used
- Spring Framework
    - Spring Boot
    - Spring Data JPA (with Hibernate)
    - Spring Security
 - Mysql
 - Docker

## Utilization
The API exposes the following endpoints.
| Method | Endpoint            | Usage                                                                                     | Role Needed |
|--------|---------------------|-------------------------------------------------------------------------------------------|-------------|
| GET    | /api/employees      | Returns a JSON of all the Employee objects                                                | EMPLOYEE    |
| GET    | /api/employees/{id} | Returns the Employee with the specified ID                                                | EMPLOYEE    |
| POST   | /api/employees      | Adds an Employee to the DB. The Employee needs to be in the request body in JSON format   | MANAGER     |
| PUT    | /api/employees      | Updates an Employee in the DB The Employee needs to be in the request body in JSON format | MANAGER     |
| DELETE | /api/employees/{id} | Deletes Employee with given ID                                                            | ADMIN       |

The API uses Spring Security to declare users and roles for the various endpoints. These are the users.
| Username | Password | Roles                    |
|----------|----------|--------------------------|
| alex     | alex     | EMPLOYEE, MANAGER, ADMIN |
| chris    | chris    | EMPLOYEE, MANAGER        |
| lucas    | lucas    | EMPLOYEE                 |

The authentication type is basic, and the passwords are saved in bcrypt hash
