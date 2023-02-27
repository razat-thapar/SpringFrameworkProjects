package com.razataggarwal.twelve_springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
	
	@RequestMapping(path="/register",method=RequestMethod.GET)
	public ModelAndView getRegistrationPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("registerForm");
		return mv; 
	}
	
	@RequestMapping(path="/registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("userName") String userName,@RequestParam("email") String email, @RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("success");
		mv.addObject("userName", userName);
		mv.addObject("email", email);
		mv.addObject("password", password);
		return mv;
	}
	
	
}
