# Cine Booking System

This is a Cine Booking System built with Java and Spring Boot. The project allows users to manage theaters and movies.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed [Java 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html).
- You have installed [Maven](https://maven.apache.org/install.html).
- You have installed [MySQL](https://dev.mysql.com/downloads/installer/).

## Installation

1. Clone the repository:

    ```sh
    git clone https://github.com/Danny8a/cine-booking-system.git
    cd cine-booking-system
    ```

2. Configure the database:

    - Create a database in MySQL:

        ```sql
        CREATE DATABASE db_cine_booking;
        ```

    - Update the `application.properties` file located in `src/main/resources` with your MySQL database credentials:

        ```properties
        spring.datasource.url=jdbc:mysql://localhost:3306/db_cine_booking
        spring.datasource.username=your_username
        spring.datasource.password=your_password
        spring.jpa.hibernate.ddl-auto=update
        ```

3. Build the project using Maven:

    ```sh
    mvn clean install
    ```

## Running the Project

1. Run the Spring Boot application:

    ```sh
    mvn spring-boot:run
    ```

2. The application will start on `http://localhost:8080`.

## API Endpoints

### Movies

- **Get all movies**

    ```http
    GET /movies
    ```

- **Add a new movie**

    ```http
    POST /movies
    Content-Type: application/json

    {
        "title": "Movie Title",
        "description": "Movie Description",
        "duration": 120
    }
    ```

### Theaters

- **Get all theaters**

    ```http
    GET /theaters
    ```

- **Add a new theater**

    ```http
    POST /theaters
    Content-Type: application/json

    {
        "name": "Theater Name",
        "location": "Theater Location"
    }
    ```
.