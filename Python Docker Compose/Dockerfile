# Dockerfile

# Use an official Python runtime as a parent image
FROM python:3.9-slim

# Set the working directory
WORKDIR /app

# Copy the requirements file
COPY requirements.txt .

# Install dependencies
RUN pip install --no-cache-dir -r requirements.txt

 COPY . .

# Expose the port Flask runs on (default 5000)
EXPOSE 5000

# Command to run the application using Flask CLI
# Environment variables like FLASK_APP and FLASK_RUN_HOST will be set by docker-compose
CMD ["flask", "run"]