package com.errorcatch.sentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class SentryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentryApplication.class, args);
	}

}
