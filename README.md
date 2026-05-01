# 💰 Finance Administration System

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
<img src="https://img.shields.io/badge/Apache_Kafka-231F20?style=for-the-badge&logo=Apache%20Kafka&logoColor=white" alt="Apache Kafka" />
<img src="https://img.shields.io/badge/REST_APIs-6E6E6E?style=for-the-badge&logo=api&logoColor=white" alt="REST APIs" />

A robust financial management system designed to handle administrative and financial operations, including transaction control, reporting, and data organization.

This project was built with a focus on clean architecture, scalability, and real-world business scenarios, making it suitable for both learning and production use.

## 📌 Features

- ✅ Financial transaction management (income & expenses)
- ✅ Categorization of financial data
- ✅ Dashboard with summarized financial insights
- ✅ CRUD operations for financial records
- ✅ Data persistence with relational database
- ✅ RESTful API architecture
- ✅ Modular and scalable design

## 🛠️ Tech Stack

**Backend**

- Java (likely Java 17+ or 21)
- Spring Boot
- Spring Data JPA
- Hibernate

**Database**

- MySQL / PostgreSQL

**DevOps / Tools**

- Docker
- Gradle or Maven
- Git & GitHub

## 📂 Project Structure

```text

finance-administration-system/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/finance/
│   │   │       ├── controller/
│   │   │       ├── service/
│   │   │       ├── repository/
│   │   │       ├── model/
│   │   │       └── config/
│   │   └── resources/
│   │       ├── application.yml
│   │       └── db/
│   └── test/
│
├── docker/
├── README.md
└── build.gradle / pom.xml

```

## 🚀 Getting Started

1. Clone the repository

```bash

git clone https://github.com/KleberVales/finance-administration-system.git
cd finance-administration-system

```

2. Configure the database

Edit application.yml or application.properties:

```yaml

spring:
datasource:
    url: jdbc:mysql://localhost:3306/finance_db
    username: root
    password: your_password

```

3. Run the application

Using Maven:

```bash
./mvnw spring-boot:run
```

Using Gradle:




