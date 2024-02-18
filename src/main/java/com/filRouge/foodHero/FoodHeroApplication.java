package com.filRouge.foodHero;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoodHeroApplication {

	public static void main(String[] args) {

		SpringApplication.run(FoodHeroApplication.class, args);

	}

}
