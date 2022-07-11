package com.control.hospital;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;

@Slf4j
@ComponentScan
@SpringBootApplication
@ConfigurationPropertiesScan
public class HospitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalApplication.class, args);

		log.info("\n------------------------\n"
				+ "    Control Hospital\n"
				+ "------------------------"
		);
	}

}
