package net.cj.edu.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String home() {
		return "<h1>aws-devops</h1>";
	}
}
