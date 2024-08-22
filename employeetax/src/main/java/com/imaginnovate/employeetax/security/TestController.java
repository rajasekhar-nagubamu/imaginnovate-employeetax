package com.imaginnovate.employeetax.security;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/user")
	public ResponseEntity<String> demo() {
		return ResponseEntity.ok("Seucrity Test USER url");
	}

	@GetMapping("/admin")
	public ResponseEntity<String> adminOnly() {
		return ResponseEntity.ok("Seucrity Test ADMIN  url");
	}
}
