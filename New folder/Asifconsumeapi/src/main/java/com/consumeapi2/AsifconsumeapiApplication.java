package com.consumeapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AsifconsumeapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsifconsumeapiApplication.class, args);
	}
	@Bean
	public RestTemplate getrest() {
		
		return new RestTemplate();
		
	}

}
