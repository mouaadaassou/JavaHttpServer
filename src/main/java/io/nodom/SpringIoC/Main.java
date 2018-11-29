package io.nodom.SpringIoC;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("io.nodom.SpringIoC.Main");
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigApp.class);
		logger.setLevel(Level.INFO);
		logger.info("tester tester tester");
		applicationContext.close();	
	}
}
