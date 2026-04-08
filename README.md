# spring-boot-data-rest-app
This repository contains a simple Spring Boot REST application using Spring Data REST and PostgreSQL. The application exposes RESTful endpoints directly from JPA repositories, eliminating the need for explicit Controller and Service classes.

---

## 📦 Dependencies

The `pom.xml` includes the following dependencies:

- **Lombok** – for reducing boilerplate code
- **spring-boot-starter-data-jpa** – for JPA and Hibernate integration
- **spring-boot-starter-data-rest** – for auto-exposing JPA repositories as REST endpoints
- **PostgreSQL** – database driver
---

## ⚙️ Setup Instructions

**1. Clone the repository:**
```bah
    git clone https://github.com/sugganabalaji/spring-boot-data-rest-app.git
    cd spring-boot-data-rest-app
```

**2. Configure PostgreSQL connection in `application.properties`:**
```properties
    # Database connection configuration
    spring.datasource.driver-class-name=org.postgresql.Driver`
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    spring.jpa.hibernate.ddl-auto=update
```

**3. Build and run the application:**
```mvn
    mvn spring-boot:run
```

**4. The application will start at:**
```url
    http://localhost:8080
```
---
## 🔗 REST Endpoints

Spring Data REST automatically exposes endpoints for the `JobPost` entity. You can interact with them using Postman or any UI:

- GET all job posts
```
    GET http://localhost:8080/jobPosts
```

- GET a job post by ID
```
    GET http://localhost:8080/jobPosts/{id}
```
Example: `GET http://localhost:8080/jobPosts/2`

- Create a new job post
```
    POST http://localhost:8080/jobPosts
```
- Update an existing job post
```
    PUT http://localhost:8080/jobPosts/{id}
```
Example: `PUT http://localhost:8080/jobPosts/2`

- Delete a job post
```
    DELETE http://localhost:8080/jobPosts/{id}
```
Example: `DELETE http://localhost:8080/jobPosts/9`

---

## 🗄️ Database Schema

The `JobPost` entity is mapped to a PostgreSQL table. Example fields might include:

- `post_id` (Primary Key)
- `post_profile`
- `post_desc`
- 'req_experience`
- `post_tech_stack`
---
## 🚀 Features
- No need for explicit Controller or Service classes
- Auto-generated REST endpoints via Spring Data REST
- Easy integration with PostgreSQL
- Clean and minimal setup
- Efficient database operations
- Highly scalable and maintainable
- Easy to extend and customize
- Built with Spring Boot
- Built with Spring Data REST
---
## 📌 Notes

- Use Postman or any REST client to test endpoints.
- Ensure PostgreSQL is running before starting the application.
- Lombok requires annotation processing enabled in your IDE.
---
## 🛠️ Tech Stack

Java
Spring Boot
Spring Data JPA
Spring Data REST
PostgreSQL
Maven