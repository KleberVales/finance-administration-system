# 💰 Finance Administration System

A modern Finance Administration System built with Java and Spring Boot to help manage financial operations through a secure, scalable, and maintainable architecture.

This project was developed to strengthen backend development skills while applying industry best practices such as layered architecture, RESTful APIs, database persistence, validation, and clean code principles.

## 🚀 Features

- Financial transaction management
- Income and expense tracking
- Category management
- RESTful API
- Input validation
- Exception handling
- Database persistence
- Layered architecture
- Clean and maintainable code
- Ready for future enhancements

## 🛠️ Tech Stack

### Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Spring Validation

### Database

- PostgreSQL

### Build Tool

- Gradle (Kotlin DSL)

### Development Tools

- Docker
- Git
- GitHub

## 📂 Project Structure

```text
src
├── main
│ ├── java
│ │ ├── controller
│ │ ├── service
│ │ ├── repository
│ │ ├── entity
│ │ ├── dto
│ │ ├── exception
│ │ └── config
│ └── resources
└── test
```

## ⚙️ Getting Started

**Prerequisites**

- Java 21+
- PostgreSQL
- Docker (optional)
- Git

**Clone the repository**

```bash

git clone https://github.com/KleberVales/finance-administration-system.git

```
**Configure the database**

Update the database configuration inside:

src/main/resources/application.properties

Example:

spring.datasource.url=jdbc:postgresql://localhost:5432/finance_db
spring.datasource.username=postgres
spring.datasource.password=your_password

## ▶️ Running the Application

Using Gradle:

./gradlew bootRun

Or on Windows:

gradlew.bat bootRun

The application will start on:

## 📌 API Endpoints

Example endpoints:

| Method	| Endpoint |	Description |
|--------|---------|---------------|
| GET	| /api/...	| Retrieve resources |
| POST	| /api/...	| Create a new resource |
| PUT	| /api/.../{id} |	Update a resource |
| DELETE	| /api/.../{id} |	Delete a resource |

Replace the endpoints above with the actual routes implemented in the project.

## 🧪 Testing

Run all tests:

```bash
./gradlew test
```

## 📈 Future Improvements

- JWT Authentication
- Spring Security
- User management
- Dashboard and analytics
- Reports
- Docker Compose
- CI/CD pipeline
- Unit and Integration Tests
- API documentation with Swagger/OpenAPI
- Microservices architecture

## 📚 What I Practiced

- REST API development
- Spring Boot fundamentals
- Dependency Injection
- Spring Data JPA
- Bean Validation
- Exception Handling
- PostgreSQL integration
- Clean Architecture
- Object-Oriented Programming
- Git workflow

## 🤝 Contributing

- Contributions, issues






