package com.techreturners.encapsulation.bankaccount.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WeatherReporterTest {
    @ParameterizedTest
    @CsvSource(delimiterString = ",", textBlock = """
                    London, 9 , 🌦
                    California, 35, 🌅
                    Cape Town, 15, 🌤
                    Any Other, 12, 🔆
            """)
    void checkForecast(String location, double temperature, String expectedForecast) {
        WeatherReporter weatherReporter = new WeatherReporter(location, temperature);

        assertEquals(expectedForecast, weatherReporter.getForecast());
    }

    @ParameterizedTest
    @CsvSource(delimiterString = ",", textBlock = """
                    London, 9 , 🥶
                    California, 35, 🥵 
                    Cape Town, 15, 😊
            """)
    void checkTemperatureFeeling(String location, double temperature, String expectedValue) {
        WeatherReporter weatherReporter = new WeatherReporter(location, temperature);

        assertTrue(weatherReporter.getTemperatureFeeling().contains(expectedValue));
    }

    @ParameterizedTest
    @CsvSource({"London,20,68,😊,🌦"})
    void checkDisplayWeather(String location, double temperature, String expectedTemperature, String expectedFeeling, String expectedForecast) {
        WeatherReporter weatherReporter = new WeatherReporter(location, temperature);

        var displayedWeather = weatherReporter.displayWeather();

        assertTrue(displayedWeather.contains(location) &&
                displayedWeather.contains(expectedTemperature) &&
                displayedWeather.contains(expectedFeeling) &&
                displayedWeather.contains(expectedForecast)
        );
    }
}