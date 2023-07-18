package com.example.weatherapplication;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public WeatherData getWeatherByCity(String city) {
        return weatherRepository.getWeatherByCity(city);
    }

    public WeatherData getWeatherByLocation(String lat, String lon) {
        return weatherRepository.getWeatherByLocation(lat, lon);
    }
}

