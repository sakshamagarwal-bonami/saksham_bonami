package com.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/contact")
	public String showForm() {
		
		System.out.println("Form Controller called!!");
		
		return "contact";
	}
	
	@RequestMapping(path="/processform",method = RequestMethod.POST)//Very IMPORTANT
	public String handleForm(@RequestParam("email") String emailId,@RequestParam("password") String password,@RequestParam("checkbox") Boolean remember,Model model) {
		System.out.println("User's email is : "+emailId);
		System.out.println("User's password is : "+password);
		System.out.println("Remember password ? : "+remember);
		
		model.addAttribute("email",emailId);
		model.addAttribute("password",password);
		model.addAttribute("remember", remember);
		
		return "thankyou";
	}

}
