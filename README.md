
# cloudVendor

A Java Spring Boot REST API for managing cloud vendor records and related metadata.

## Tech stack
1. Java 17\+
2. Spring Boot
3. Maven
4. Spring Data JPA (H2 / PostgreSQL / MySQL)
5. springdoc-openapi (Swagger UI)
6. JUnit / Mockito for testing

## Features
1. CRUD endpoints for vendor entities
2. Validation and DTO mapping
3. Service \+ repository layered architecture
4. In-memory H2 profile for local development
5. OpenAPI / Swagger documentation

## Requirements
1. Java 17 or newer
2. Maven 3.6+
3. (Optional) Docker

## Quick start

1. Clone the repository:
2. Build the project:
3. Run with Maven:
4. Or run the packaged JAR:
5. Verify the API:
    - Swagger UI: `http://localhost:8080/swagger-ui.html` or `http://localhost:8080/swagger-ui/index.html`
    - Health: `http://localhost:8080/actuator/health` (if actuator enabled)

## Configuration

1. Default config file: `src/main/resources/application.properties`
2. Common properties:
    - `server.port` - server port (default 8080)
    - `spring.datasource.url` - JDBC URL for production DB
    - `spring.datasource.username` / `spring.datasource.password`
    - Profiles: `application-dev.properties`, `application-prod.properties`
3. Environment variables supported:
    - `SPRING_DATASOURCE_URL`
    - `SPRING_DATASOURCE_USERNAME`
    - `SPRING_DATASOURCE_PASSWORD`
    - `SERVER_PORT`

## API (example endpoints)

1. List vendors
    - Method: `GET`
    - URL: `/api/vendors`
    - Response: `200 OK` JSON array

2. Get vendor
    - Method: `GET`
    - URL: `/api/vendors/{id}`
    - Response: `200 OK` vendor JSON or `404 Not Found`

3. Create vendor
    - Method: `POST`
    - URL: `/api/vendors`
    - Body (JSON):
      ```json
      {
        "name": "Vendor Name",
        "region": "us-east-1",
        "contactEmail": "ops@example.com"
      }
      ```
    - Response: `201 Created` JSON with created resource

4. Update vendor
    - Method: `PUT`
    - URL: `/api/vendors/{id}`
    - Body: same as create
    - Response: `200 OK`

5. Delete vendor
    - Method: `DELETE`
    - URL: `/api/vendors/{id}`
    - Response: `204 No Content`

## Testing

1. Run unit and integration tests:
2. Sample test frameworks:
    - JUnit 5
    - Mockito


