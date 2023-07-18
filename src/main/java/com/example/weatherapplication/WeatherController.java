package com.example.weatherapplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public ResponseEntity<WeatherData> getWeatherByCity(@PathVariable String city) {
        WeatherData weatherData = weatherService.getWeatherByCity(city);
        return ResponseEntity.ok(weatherData);
    }

    @GetMapping("/weather")
    public ResponseEntity<WeatherData> getWeatherByLocation(@RequestParam String lat, @RequestParam String lon) {
        WeatherData weatherData = weatherService.getWeatherByLocation(lat, lon);
        return ResponseEntity.ok(weatherData);
    }
}