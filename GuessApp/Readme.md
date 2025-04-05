# GuessApp - App 1 (Java/Spring Boot) Quick Start

## Prerequisites

*   Docker installed and running.

## Running App 1

1.  **Navigate to App 1 Directory:**
    Open your terminal and change to the `GuessApp/App 1` directory.
    ```bash
    cd path/to/GuessApp/App\ 1
    ```

2.  **Build the Docker Image:**
    ```bash
    docker build -t app1 .
    ```

3.  **Run the Docker Container:**
This command runs the container, maps port 8080, and enables remote access to the H2 console required when running in Docker.
```bash
docker run -d -p 8080:8080 -e SPRING_H2_CONSOLE_SETTINGS_WEBALLOWOTHERS=true --name app1_cont app1

## Testing

*   **Wait a few seconds** for the application to start inside the container.
*   **Check H2 Console:** Open your browser to `http://localhost:8080/h2-console`.
    *   Use JDBC URL: `jdbc:h2:file:./projectdb1`
    *   User: `projectdbu`
    *   Password: (blank)
*   **Test an API Endpoint (Example):**
    ```bash
    curl http://localhost:8080/api/v1/timesheet/project/1
    ```
    *(You should get JSON data back)*

## Stopping the Container

1.  **Stop:**
    ```bash
    docker stop app1_cont
    ```
2.  **Remove (Optional):**
    ```bash
    docker rm app1_cont
    ```

---
