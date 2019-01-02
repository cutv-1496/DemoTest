package com.example.demo.controller;

import com.example.demo.model.Weather;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class WeatherController {

    @GetMapping("/weather/current")
    public HttpEntity<Weather> getCurrentWeather() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Weather> weather = restTemplate.getForEntity("http://localhost:9000/test",Weather.class);
        return weather;
        /*Weather weather = new Weather();
        weather.setSummary("rain");
        weather.setTemperature(100);
        return ResponseEntity.ok(weather);*/
    }
}
