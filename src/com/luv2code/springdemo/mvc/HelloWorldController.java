package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processform() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion2")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		String theName = request.getParameter("studentName");
		
		theName = theName.toUpperCase();
		
		String result = "Yo " + theName;
		
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersion3")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		
		
		theName = theName.toUpperCase();
		
		String result = "Hello Version3 " + theName;
		
		model.addAttribute("message",result);
		
		
		return "helloworld";
	}
}
