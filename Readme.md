# Docker Exercises: Multi-App Containerization

This repository contains solutions for containerizing several applications using Docker and Docker Compose.

**Exercises:**

1.  **Guess Apps:** Containerizing a Java Spring Boot app and a basic Python Flask app.
2.  **Flask IoT Sensor App:** Containerizing a Flask app that reads and displays CSV data.
3.  **Flask Redis Counter App:** Deploying a multi-container Flask+Redis application using Docker Compose.

## Prerequisites

*   Docker Desktop or Docker Engine installed and running.
*   Docker Compose (usually included with Docker Desktop).
*   Code downloaded/cloned into respective directories (e.g., `GuessApp/`, `FlaskIoTApp/`, `FlaskRedisApp/`).

---

## Exercise 1: Guess Apps

### App 1: Java Spring Boot (Timesheet)

1.  **Navigate:** `cd GuessApp/App\ 1`
2.  **Build:** `docker build -t guess-app1 .`
3.  **Run:** `docker run -d -p 8080:8080 -e SPRING_H2_CONSOLE_SETTINGS_WEBALLOWOTHERS=true --name app1_cont guess-app1`
4.  **Test:**
    *   H2 Console: `http://localhost:8080/h2-console` (User: `projectdbu`, No Password, JDBC URL: `jdbc:h2:file:./projectdb1`)
    *   API Example: `curl http://localhost:8080/api/v1/timesheet/project/1`

### App 2: Simple Python Flask (Hello World)

1.  **Navigate:** `cd GuessApp/App\ 2`
2.  **Build:** `docker build -t guess-app2 .`
3.  **Run:** `docker run -d -p 5001:80 --name guess-app2-cont guess-app2`
    *(Note: Uses host port 5001 to avoid conflicts)*
4.  **Test:** `http://localhost:5001` (Should display "Hello World!")

---

## Exercise 2: Flask IoT Sensor App (CSV Reader)

1.  **Navigate:** `cd FlaskIoTApp` *(Assuming this directory name)*
2.  **Build:** `docker build -t flask-iot-app .`
3.  **Run:** `docker run -d -p 5000:5000 --name my-iot-app flask-iot-app`
4.  **Test:** `http://localhost:5000` (Should display CSV data in an HTML table)

---

## Exercise 3: Flask Redis Counter App (Docker Compose)

1.  **Navigate:** `cd FlaskRedisApp` *(Assuming this directory name)*
2.  **Run:** `docker-compose up -d`
3.  **Test:** `http://localhost:5000` (Refresh the page to see the counter increase)
4.  **Stop:** `docker-compose down` (Add `-v` to remove the counter data volume)

---

## Cleanup

To stop and remove individual containers run manually (Exercises 1 & 2):

```bash
# Example for App 1
docker stop app1_cont
docker rm app1_cont

# Example for App 2
docker stop guess-app2-cont
docker rm guess-app2-cont

# Example for IoT App
docker stop my-iot-app
docker rm my-iot-app

Use docker-compose down [-v] for the multi-container application (Exercise 3).

This README provides the essential commands to get each part running quickly, along with basic testing instructions. Remember to replace `path/to/...` placeholders if needed and ensure the directory names (`FlaskIoTApp`, `FlaskRedisApp`) match your actual project structure.