# Weather Application

This is a weather application that retrieves weather data for cities or locations.
## Dependencies

The project uses the following dependencies:

- [Spring Boot](https://spring.io/projects/spring-boot): A framework for creating Java applications.
- [Spring Web](https://spring.io/guides/gs/spring-boot/): A framework for building web applications.
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa): A framework for interacting with databases using Java Persistence API (JPA).
- [Jakarta Persistence](https://jakarta.ee/specifications/persistence/2.2/): A standard for object-relational mapping (ORM) in Java.
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/current/reference/html/using-spring-boot.html#using-boot-devtools): Tools for development-time convenience.
- [Jackson](https://github.com/FasterXML/jackson): A library for JSON serialization and deserialization.
- [RestTemplate](https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html): A class for making HTTP requests.


## Endpoints

### Get Weather by City

Retrieves weather data for a specific city.

- URL: `/weather/{city}`
- Method: GET
- Path Variable:
  - `{city}`: The name of the city for which weather data is requested.
- Response: Returns the weather data for the specified city.
  - Body Format:
    ```json
    {
      "id": [Long],
      "city": [String],
      "main": {
        "temp": [Double]
      }
    }
    ```

### Get Weather by Location

Retrieves weather data for a specific location using latitude and longitude coordinates.

- URL: `/weather`
- Method: GET
- Query Parameters:
  - `lat`: The latitude coordinate of the location.
  - `lon`: The longitude coordinate of the location.
- Response: Returns the weather data for the specified location.
  - Body Format:
    ```json
    {
      "id": [Long],
      "city": [String],
      "main": {
        "temp": [Double]
      }
    }
    ```

## Project Structure

The project follows the MVC (Model-View-Controller) architecture.

### Entity

The `WeatherData` class represents weather data.

- Fields:
  - `id`: [Long] - The unique identifier for the weather data.
  - `city`: [String] - The name of the city.
  - `main`: [WeatherMain] - The main weather details.
- Methods: Includes constructors, getters, and setters.

### Embeddable

The `WeatherMain` class represents the main weather details.

- Fields:
  - `temperature`: [Double] - The temperature.
- Methods: Includes constructors, getters, and setters.

### Repository

The `WeatherRepository` class retrieves weather data from an external API.

- Methods:
  - `getWeatherByCity(String city)`: Retrieves weather data for a specific city.
  - `getWeatherByLocation(String lat, String lon)`: Retrieves weather data for a specific location.

### Service

The `WeatherService` class handles the business logic for retrieving weather data.

- Methods:
  - `getWeatherByCity(String city)`: Retrieves weather data for a specific city.
  - `getWeatherByLocation(String lat, String lon)`: Retrieves weather data for a specific location.

### Controller

The `WeatherController` class defines the REST API endpoints for retrieving weather data.

- Endpoints:
  - `GET /weather/{city}`: Retrieves weather data by city.
  - `GET /weather`: Retrieves weather data by location.

### Main Class

The `WeatherApplication` class is the entry point of the application.

- Method: `main()`

