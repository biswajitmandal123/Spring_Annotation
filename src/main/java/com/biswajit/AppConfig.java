package com.biswajit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.biswajit")
public class AppConfig {

	public AppConfig() {
		System.out.println("Appconfig Constractur...");

	}
@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		return eng;
	}

}
