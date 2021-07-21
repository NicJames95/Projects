package com.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.entities.CarService;
import com.project.entities.User;
import com.project.entities.UserService;

@Controller
public class DealershipController {
	@Autowired
	UserService userService;
	@Autowired
	CarService carService;
	
	@GetMapping("/,/index,/home")
	String welcome(Model model) {
		
		return "index";
	}
	
	@GetMapping("/profile")
	String welcomeBack(Model model) {
		// Profile is going to need links to buy and sell cars 
		return "profile";
	}
	
	@GetMapping("/register")
	ModelAndView register(Model model) {
		
		return new ModelAndView("register", "user", new User());
	}
	
	@PostMapping("/register") 
	String handleRegister(Model model, @ModelAttribute("user") User user, HttpSession session) {
		model.addAttribute("newUser", user);
		userService.saveUser(user);
		
		return "thank-you";
			
	}
	@GetMapping("/login")
	public ModelAndView login(Model model) {
		
		return new ModelAndView("login", "user", new User());
	}
	@PostMapping("/authorize-login")
	public String authorizeLogin(Model model, @ModelAttribute("user") User user, HttpSession session) {
		User account = userService.findByEmail(user.getEmail());
		if(account.getPassword().equals(user.getPassword())) {
			model.addAttribute("user", account);
			return "profile";
		} else {
			model.addAttribute("error", "Invalid Credentials");
		}
		return "login";
	}

}
