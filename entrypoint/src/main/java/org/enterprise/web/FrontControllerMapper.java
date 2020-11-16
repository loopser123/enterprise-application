package org.enterprise.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class FrontControllerMapper {
	
	@GetMapping("/")
	public String dummyTest() {
		return "Hello from a cleaner architecture"; 
	}
}
