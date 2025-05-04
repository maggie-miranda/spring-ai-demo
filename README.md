# Spring AI Demo

A simple Spring Boot application that demonstrates integration with OpenAI's ChatGPT using Spring AI.

## Requirements

- Java 17 or higher
- Gradle
- OpenAI API Key

## Features

- Spring Boot 3.2.0
- REST API with Spring Web
- OpenAPI 3.1 documentation
- Lombok for reducing boilerplate code
- Spring AI integration with OpenAI's ChatGPT

## Building the Application

```bash
./gradlew build
```

## Running the Application

```bash
./gradlew bootRun
```

The application will start on port 8080.

## API Endpoints

- `GET /api/ai-info`: Returns information about Agentic AI from ChatGPT

## Configuration

Before running the application, you need to set your OpenAI API key. You can do this in one of two ways:

1. Set the `OPENAI_API_KEY` environment variable:
   ```bash
   export OPENAI_API_KEY=your-api-key-here
   ```

2. Update the `application.properties` file:
   ```properties
   spring.ai.openai.api-key=your-api-key-here
   ```

## API Documentation

Once the application is running, you can access the API documentation at:

- Swagger UI: http://localhost:8080/swagger-ui.html
- OpenAPI JSON: http://localhost:8080/api-docs

## Project Structure

```
spring-ai-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── springaidemo/
│   │   │               ├── controller/
│   │   │               │   └── AIController.java
│   │   │               ├── util/
│   │   │               │   └── AIUtil.java
│   │   │               └── SpringAiDemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── springaidemo/
│                       └── controller/
│                           └── AIControllerTest.java
└── build.gradle
```
