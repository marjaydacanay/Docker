package com.usaa.docker.TomcatDocker;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/docker/hi")
public class Resource {
	
	@GetMapping
	public String Hello() {
		return "Hello from Docker Container";
	}
}
