package in.kp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class  MyController{

   
    @GetMapping("/home")
    public String openHomePage() {
    	return "home";
    	
    }
    @GetMapping("/about")
    public String openAboutPage() {
    	
    	return "about";
    	
    }
    
    
}