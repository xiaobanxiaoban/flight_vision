package com.ban.flight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xiaoban on 2017/3/22.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ban")
public class FlightApplication {
	public static void main(String[] args) {
		SpringApplication.run(FlightApplication.class, args);
	}
}
