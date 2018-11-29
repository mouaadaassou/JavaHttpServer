package io.nodom.SpringIoC;

import org.springframework.stereotype.Component;

@Component
public class WeatherDaoImpl implements WeatherDao {

	public Weather findWeatherById(Long id) {
		return new Weather(1l, 6.89);
	}
}
