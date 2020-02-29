package com.errorcatch.sentry.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.errorcatch.sentry.application.SentryTest;

@Controller
@CrossOrigin
public class SentryController {

	private static final Logger LOG = LogManager.getLogger(SentryController.class);

	@Autowired
	private SentryTest sentryTest;

	@GetMapping("/test")
	public String test() {
		String response = "";
		try {
			LOG.debug("Chala kya");
			throw new Exception("Exception has occured....");
		} catch (Exception e) {
			e.printStackTrace();
			LOG.error("Exception" + e);

			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String stackTrace = sw.toString();
			LOG.error("Exception - " + stackTrace);
			response = stackTrace;
		}
		return response;
	}

	@RequestMapping("/handled")
	@ResponseBody
	String handledError() {
		return sentryTest.divide();

	}
}
