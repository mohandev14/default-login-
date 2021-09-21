package com.springsecurity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kgen/fm/pr")
public class Controllerclass {
	@GetMapping 
	public String hellokgen() {
		return "hello konnectgen  family";
	}

}
