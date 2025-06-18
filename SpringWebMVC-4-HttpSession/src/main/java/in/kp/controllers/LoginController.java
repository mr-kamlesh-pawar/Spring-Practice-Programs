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
public class LoginController {

   
    @GetMapping("/loginPage")
    public String openLoginPage() {
    	return "login";
    	
    }
    
    @PostMapping("/profile")
    public String loginForm(HttpServletRequest req, Model model, HttpSession session) {
    	String email= req.getParameter("email1");
    	String pass= req.getParameter("pass1");
    	
    	if(email.equals("kp@gmail.com") && pass.equals("123123")) {
    		
    		session.setAttribute("session_name", "Kamlesh Pawar");
    		session.setAttribute("session_city", "Pune");
    		session.setAttribute("session_gender", "Male");
    		session.setAttribute("session_email", email);
    		
    		return "profile";
    	} else {
    		model.addAttribute("my_error", "Email and Password is didn't match, please try again");
    		return "login";
    		
    	}
    	
    	
    	
    }
}