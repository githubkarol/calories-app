package CoolDevelopers.caloriesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CaloriesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaloriesAppApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return "Please use '/api/v1/products' endpoint to see available products";
	}
}
