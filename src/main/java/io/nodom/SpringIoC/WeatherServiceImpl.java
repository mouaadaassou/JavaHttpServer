package io.nodom.SpringIoC;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class WeatherServiceImpl implements WeatherService {

	private WeatherDao weatherDao;

	public WeatherServiceImpl(WeatherDao watherDao) {
		this.weatherDao = watherDao;
	}

	public Double getHistoricalHigh(Date date) {
		return this.weatherDao.findWeatherById(1l).getHights();
	}

	public void tester() {
		System.out.println("The Post Construct method using Spring Application");
	}
}
