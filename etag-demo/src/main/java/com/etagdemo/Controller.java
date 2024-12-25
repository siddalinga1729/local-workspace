package com.etagdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/get/{name}")
	String getName(@PathVariable String name) throws InterruptedException {
		System.out.println("getName() is called");
		return "Hello "+name;
	}
}
