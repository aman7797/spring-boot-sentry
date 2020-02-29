package com.errorcatch.sentry.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SentryTest {

	private static final Logger LOG = LogManager.getLogger(SentryTest.class);

	public String divide() {
		try {
			int example = 1 / 0;
		} catch (Exception e) {
			// caught exception that will be sent to Sentry
			LOG.error("Caught exception!", e);
		}
		return "Divided";
	}
}
