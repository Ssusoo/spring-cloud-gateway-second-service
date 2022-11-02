package me.ssu.springcloudgatewaysecondservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:8082/welcome
// http://localhost:8082/second-service/welcome
@RestController
@RequestMapping("/second-service")
@Slf4j
public class SecondServiceController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to the Second Service";
	}
}