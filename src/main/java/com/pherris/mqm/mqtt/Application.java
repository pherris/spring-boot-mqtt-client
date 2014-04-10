package com.pherris.mqm.mqtt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application {
	private static final Logger LOG = LoggerFactory.getLogger(Application.class);
		
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		LOG.info("running");
	}

}
