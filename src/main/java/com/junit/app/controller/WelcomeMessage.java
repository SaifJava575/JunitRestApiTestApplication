package com.junit.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeMessage {

	@GetMapping(value = "/welcome")
	public String helloMessage() {
		return "Hellow Saifuddin";
	}
}
