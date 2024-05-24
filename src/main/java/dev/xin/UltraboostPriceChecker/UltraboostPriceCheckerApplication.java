package dev.xin.UltraboostPriceChecker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UltraboostPriceCheckerApplication {

	private static final Logger log = LoggerFactory.getLogger(UltraboostPriceCheckerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UltraboostPriceCheckerApplication.class, args);
		log.info("Application started Successfully!");
	}

}
