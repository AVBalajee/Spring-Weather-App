package com.example.weatherapplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class WeatherRepository {

    private static final String API_KEY = "Your key";
    private static final String API_URL = "https://api.openweathermap.org/data/2.5/weather";

    public WeatherData getWeatherByCity(String city) {
        String apiUrl = String.format("%s?q=%s&appid=%s", API_URL, city, API_KEY);
        WeatherData weatherData = fetchData(apiUrl);
        weatherData.setCity(city); // Set the retrieved city value explicitly
        return weatherData;
    }

    public WeatherData getWeatherByLocation(String lat, String lon) {
        String apiUrl = String.format("%s?lat=%s&lon=%s&appid=%s", API_URL, lat, lon, API_KEY);
        return fetchData(apiUrl);
    }

    private WeatherData fetchData(String apiUrl) {
        RestTemplate restTemplate = new RestTemplate();
        WeatherData weatherData = restTemplate.getForObject(apiUrl, WeatherData.class);
        return weatherData;
    }
}
