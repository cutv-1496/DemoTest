package com.example.demo.controller;

import com.example.demo.helper.FileLoader;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.urlPathEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
@RunWith(SpringRunner.class)
@WebMvcTest(WeatherController.class)
public class WeatherControllerTest {

    @Rule
    public WireMockRule wireMockRule = new WireMockRule(9000);

    @Autowired
    private MockMvc mvc;

   /* @Before
    public void startServer() {
        wireMockRule.start();
    }

    @After
    public void stopServer() {
        wireMockRule.stop();
    }*/

    @Test
    public void getCurrentWeather() throws Exception {
        wireMockRule.stubFor(get(urlPathEqualTo("/test"))
                .willReturn(aResponse()
                        .withBody(FileLoader.read("classpath:weatherApiResponse.json"))
                        .withHeader("content-type", MediaType.APPLICATION_JSON_VALUE)
                        .withStatus(200)));


        /*RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Weather> weather = restTemplate.getForEntity("http://localhost:9000/test", Weather.class);
        assertThat(weather.getBody().getTemperature(),is(3000));*/

        mvc.perform(MockMvcRequestBuilders.get("/api/weather/current")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.summary", is("rain")));

    }
}