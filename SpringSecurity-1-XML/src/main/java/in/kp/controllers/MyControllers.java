package in.kp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyControllers {
	
	@GetMapping("/home")
	public String openHome() {
		
		return "home";
	}
	
	@GetMapping("/adminPanel")
	public String openAdminPanel() {
		
		return "admin-panel";
	}

}
