package com.example.weatherapplication;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;

import static java.lang.Math.abs;
import static java.lang.Math.round;

@Embeddable
public class WeatherMain {
    @JsonProperty("temp")
    private Double temperature;
    // Constructors

    public WeatherMain() {
    }

    public WeatherMain(Double temperature) {
        this.temperature = temperature;
    }

    // Getters and setters

    public Double getTemperature() {
        return Double.valueOf(round(temperature-273.15));
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }
}
