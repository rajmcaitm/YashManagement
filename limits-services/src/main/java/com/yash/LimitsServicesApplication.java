package com.yash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.yash.model.Limit;

@SpringBootApplication
@EnableConfigurationProperties(Limit.class)
public class LimitsServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LimitsServicesApplication.class, args);
	}

}
