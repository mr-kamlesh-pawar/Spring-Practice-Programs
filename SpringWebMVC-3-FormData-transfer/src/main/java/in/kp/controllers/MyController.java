package in.kp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController {

    @RequestMapping("/aaa")
    public String openHelloPage()  {
        return "hello";
    }
    
//    @PostMapping("/myForm")
//    public String getFormName(HttpServletRequest req, HttpServletResponse res) {
//    	
//    	String name= req.getParameter("name1");
//    	return "hello";
//    	
//    }
//    
//    @PostMapping("/myForm")
//    public String getFormName(HttpServletRequest req, HttpServletResponse res, Model model) {
//    	
//    	String name= req.getParameter("name1");
//    	System.out.println("Name: "+name);
//    	model.addAttribute("model_name", name);
//    	return "hello";
//    	
//    }
    
    @PostMapping("/myForm")
    public ModelAndView getFormName(HttpServletRequest req, HttpServletResponse res) {
    	
    	String name= req.getParameter("name1");
    	System.out.println("Name: "+name);
    	ModelAndView mv= new ModelAndView();
    	mv.addObject("model_name", name);
    	mv.setViewName("hello");
    	
    	return mv;
    	
    	
    }
}