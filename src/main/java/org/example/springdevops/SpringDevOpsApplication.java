package org.example.springdevops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalTime;

@SpringBootApplication
@RestController
public class SpringDevOpsApplication {

	@GetMapping("/get")
	public String welcome() {
		LocalTime now = LocalTime.now();
		String greeting = (now.getHour() < 12) ? "Morning" : "Afternoon";
		return "Good " + greeting + " Tasdid Kabir Adil. Welcome to COMP367";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringDevOpsApplication.class, args);
	}

}
