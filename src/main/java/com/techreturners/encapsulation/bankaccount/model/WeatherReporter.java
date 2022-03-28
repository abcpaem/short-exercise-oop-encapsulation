package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;
import java.util.*;

public class WeatherReporter {
    private final int COLD_TEMPERATURE = 10;
    private final int HOT_TEMPERATURE = 30;
    private String location;
    private double temperature;
    private Map<String, String> forecast = new HashMap<>() {{
        put("London", "🌦");
        put("California", "🌅");
        put("Cape Town", "🌤");
    }};

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    public String displayWeather() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, getForecast(), getTemperatureFeeling(), getTemperatureInFahrenheit());
    }

    private double getTemperatureInFahrenheit() {
        return temperature * (9.0 / 5.0) + 32;
    }

    public String getForecast() {
        return forecast.containsKey(location) ? forecast.get(location) : "🔆";
    }

    public String getTemperatureFeeling() {
        if (temperature > HOT_TEMPERATURE) {
            return "It's too hot 🥵!";
        } else if (temperature < COLD_TEMPERATURE) {
            return "It's too cold 🥶!";
        }
        return "Ahhh...it's just right 😊!";
    }
}
