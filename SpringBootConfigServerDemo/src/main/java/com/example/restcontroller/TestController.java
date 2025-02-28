package com.example.restcontroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${msg}")
	private String msgTxt;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		return msgTxt;
	}

}
