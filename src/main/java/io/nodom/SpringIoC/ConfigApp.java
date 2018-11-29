package io.nodom.SpringIoC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

	@Bean(initMethod = "tester")
	public WeatherService weatherService() {
		return new WeatherServiceImpl(weatherDao());

	}

	@Bean(initMethod = "tester")
	public WeatherDao weatherDao() {
		return new WeatherDaoImpl();
	}

//	@PostConstruct
	public void tester() {
		System.out.println("The Post Construct method using Spring Application");
	}
}
