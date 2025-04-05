# === Dockerfile for App 1 (Java JAR) ===

# 1. Choose a Base Image (Eclipse Temurin JRE version 17)
#    Replace '17' with the Java version required by your JAR (e.g., 11, 8)
FROM eclipse-temurin:17-jre

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the executable JAR file into the container's working directory
#    Replace 'app.jar' if your JAR file has a different name
COPY app.jar .

# 4. Expose the port the application listens on (IF APPLICABLE)
#    !! IMPORTANT !!
#    - Only include this if your app is a web service/server.
#    - Change '8080' to the actual port your app uses.
#    - Remove this line entirely if your app doesn't listen on a port.
EXPOSE 8080

# 5. Define the command to run the application when the container starts
#    Replace 'app.jar' if your JAR file has a different name
CMD ["java", "-jar", "app.jar"]