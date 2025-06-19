# Spring AI Intro

This repository provides a practical implementation of integrating [Spring AI](https://docs.spring.io/spring-ai/reference/) with Java microservices, demonstrating how to leverage the power of OpenAI's ChatGPT API within modern Spring-based applications. Designed as a step-by-step guide, it showcases best practices and up-to-date techniques for enhancing microservices with AI capabilities.

## Technologies Used

- **Java** (main language)
- **Spring Boot** (microservices framework)
- **Spring AI** (AI integration library)
- **OpenAI API** (ChatGPT integration)
- **Maven** (project management and build tool)

## Getting Started

### Prerequisites

- **Java 21** or higher installed
- **Maven 3.8+**
- **OpenAI API key** (sign up at [OpenAI](https://platform.openai.com/signup) and obtain your API key)

### Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Intercont/spring-ai-intro.git
   cd spring-ai-intro

2. **Configure your OpenAI API Key**
    - Create or edit the file `src/main/resources/application.properties` and add:
      ```
      spring.ai.openai.api-key=YOUR_OPENAI_API_KEY
      ```
    - It is recommended to set the API key as an environment variable instead of having it on your properties file:
      ```bash
      export OPENAI_API_KEY=YOUR_OPENAI_API_KEY
      ```

3. **Build the project**
    ```bash
    mvn clean package
    ```

4. **Run the application**
    ```bash
    mvn spring-boot:run
    ```
    or, using the generated JAR:
    ```bash
    java -jar target/spring-ai-intro-*.jar
    ```

## Project Structure

- `src/main/java/`: Java source code
- `src/main/resources/`: Configuration files
- `pom.xml`: Maven build configuration

## Features

- Step-by-step integration of Spring AI with Java microservices
- Communication with OpenAI’s ChatGPT API
- Example endpoints and request workflows
- Easily extensible for custom AI use cases

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for suggestions, bug fixes, or enhancements.

## License

This project is licensed under the MIT License.

---

**Explore how to empower your Java microservices with AI using Spring AI and OpenAI!**
**Subscribe at igorfragadev.com for more**
