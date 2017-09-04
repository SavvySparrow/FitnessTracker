package com.sahiljalan.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sahiljalan.model.LoginDetails;
import com.sahiljalan.model.RegistrationDetails;

@Controller
public class MController {
	
	private static List<RegistrationDetails> userList = RegisterController.getUserlist();
	private static boolean loginSuccess,userCheck;

	@RequestMapping(value = "/login",method= RequestMethod.GET)
	public String loadpage(Model model) {
		
		model.addAttribute("title", "Spring MVC with Free Marker");
		return "login";
	}
	
	@RequestMapping(value = "/login",method= RequestMethod.POST)
	public String getLoginDetails(@ModelAttribute("login-form") LoginDetails user,Model model) {
		
		loginSuccess=false;userCheck=false;
		model.addAttribute("loginSuccess",loginSuccess);
		model.addAttribute("title", "Login Page");
		model.addAttribute("messege", "No Registration found!");
		System.out.println(userList.size());
		
		for(int i=0;i<userList.size();i++) {
			userCheck=false;
			if(user.getLoginUsername().equals(userList.get(i).getUsername())) {
				userCheck=true;
				if(user.getLoginPassword().equals(userList.get(i).getPassword())) {
					loginSuccess=true;
					System.out.println("Login Success: "+ loginSuccess);
					model.addAttribute("loginSuccess",loginSuccess);
					model.addAttribute("messege", "Login Successfull! ");
					return "loginCheck";
				}else {
					System.out.println("Login Success: "+ loginSuccess + " | password error");
					model.addAttribute("messege", "Login Failed! Wrong Password.");
					return "loginCheck";
				}
			}
		}
		
		if(!userCheck) {
			System.out.println("fasfafdbdbfgbdfgbfdfsfasddsvjsdjvnsdjvjksdvdskvbfasdfaf");
			System.out.println("Login Success: "+ loginSuccess + " | username error");
			model.addAttribute("messege", "Login Failed! No Such User Found!");
		}

		return "loginCheck";
	}

}
