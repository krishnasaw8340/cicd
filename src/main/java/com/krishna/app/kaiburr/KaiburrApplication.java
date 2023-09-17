package com.krishna.app.kaiburr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KaiburrApplication {
	@GetMapping(value = "/")
	public String print()
	{
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(KaiburrApplication.class, args);
	}

}
