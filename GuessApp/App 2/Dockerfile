# === Dockerfile for App 2 (Python Flask) ===

# 1. Choose a Base Image (Python 3.9 slim version)
FROM python:3.9-slim

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the requirements file first (for Docker cache optimization)
COPY requirements.txt .

# 4. Install dependencies listed in requirements.txt
#    --no-cache-dir prevents storing cache, reducing image size
#    -r specifies the requirements file
RUN pip install --no-cache-dir -r requirements.txt

# 5. Copy the application code (index.py) into the container's /app directory
COPY index.py .

# 6. Inform Docker that the container listens on port 80
EXPOSE 80

# 7. Define the command to run the application when the container starts
#    This will execute: python index.py
CMD ["python", "index.py"]