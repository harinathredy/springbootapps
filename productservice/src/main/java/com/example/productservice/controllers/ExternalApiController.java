package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {
	@RequestMapping("/weather")
	public String getweather(@RequestParam("city") String city) {
		String url="http://api.weatherstack.com/current?access_key=c397cfd9b3153e2b24b898f3e91e8abc&query="+city;
		RestTemplate restTemplate= new RestTemplate();
		String weatherData=restTemplate.getForObject(url, String.class);
		return weatherData;
	}

}
