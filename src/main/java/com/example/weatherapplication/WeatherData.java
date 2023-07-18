package com.example.weatherapplication;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "weather_data")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("city")
    private String city;

    private WeatherMain main;

    // Constructors, getters, and setters

    public WeatherData() {
    }

    public WeatherData(String city, WeatherMain main) {
        this.city = city;
        this.main = main;
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }
}