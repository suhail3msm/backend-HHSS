package com.hhis.IT2018144;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class It2018144Application {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry corsRegistry) {
				corsRegistry.addMapping("/*").allowedHeaders("*").allowedOrigins("http://localhost:4200")
						.allowedMethods("*").allowCredentials(true);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(It2018144Application.class, args);
	}

}
