# Use an official Python runtime as a parent image
FROM python:3.9-slim

# Set the working directory in the container to /app
WORKDIR /app

# Copy the dependencies file first to leverage Docker cache
COPY requirements.txt .

# Install any needed packages specified in requirements.txt
RUN pip install --no-cache-dir -r requirements.txt

# Copy the current directory contents into the container at /app
COPY index.py .

# Make port 80 available to the world outside this container
EXPOSE 80

# Define environment variables (optional but good practice)
ENV FLASK_APP=index.py
ENV FLASK_RUN_HOST=0.0.0.0
ENV FLASK_RUN_PORT=80

# Run index.py when the container launches
# Using exec form is generally preferred
CMD ["flask", "run"]
# Alternative CMD using the original script structure:
# CMD ["python", "index.py"]