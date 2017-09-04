package com.sahiljalan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sahiljalan.model.RegistrationDetails;

@Controller
public class RegisterController {
	
	private static List<RegistrationDetails> userlist = new ArrayList<>();
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String sRegister(Model model) {

		model.addAttribute("title", "Registration Form");

		return "register";
	}

	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String add(@ModelAttribute("register-form") RegistrationDetails user, Model model) {
		
		
		if (user.getUsername() != "" && user.getEmail() != "" && user.getPassword() != "") {
			model.addAttribute("title", "Registration Successfull");
			model.addAttribute("messege", "Registration Succeeded");
			model.addAttribute("messege2", "Thank you for registering!");
			model.addAttribute("username",user.getUsername());
			model.addAttribute("email",user.getEmail());
			System.out.println("<----- New Registration Details ----->");
			System.out.println("username: " + user.getUsername());
			System.out.println("password: " + user.getPassword());
			System.out.println("email: " + user.getEmail());
			System.out.println("<-------------------------------->");
			synchronized (userlist) {
				userlist.add(user);
			}
			return "registrationSuccess";
		} else {
			model.addAttribute("title", "Registration Failed");
			model.addAttribute("messege", "Registration Unsuccessfull");
			System.out.println("username: " + user.getUsername());
			System.out.println("password: " + user.getPassword());
			System.out.println("email: " + user.getEmail());
			
			return "registrationFail";
		}
	}

	public static List<RegistrationDetails> getUserlist() {
		return userlist;
	}
	
	

}
