package com.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/hi")
	public String sayHello(@RequestParam String name) {
		
		return name+", Docker practice is going good.";
	}

}
