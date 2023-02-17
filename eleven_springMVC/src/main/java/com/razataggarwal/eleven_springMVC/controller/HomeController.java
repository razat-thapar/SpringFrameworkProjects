package com.razataggarwal.eleven_springMVC.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		ModelAndView v = new ModelAndView("index");
		return v; 
	}
	
}
