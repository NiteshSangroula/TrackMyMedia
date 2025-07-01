# ---- Build stage ----
FROM maven:3.9.6-eclipse-temurin-17-alpine AS build

# Set working directory inside the container
WORKDIR /app

# Copy pom.xml and resolve dependencies first (layer caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the rest of the project files
COPY src ./src

# Build the project (skip tests if needed)
RUN mvn clean package -DskipTests

# ---- Final runtime stage ----
FROM eclipse-temurin:17-alpine

# Set working directory
WORKDIR /app

# Copy only the final JAR from the build stage
COPY --from=build /app/target/*.jar app.jar

# Optional: expose app port (for web/Spring Boot apps)
# EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

