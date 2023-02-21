package com.razataggarwal.twelve_springMVC.controller;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping(path="/home1",method=RequestMethod.GET)
	public ModelAndView getHomePage() {
		return new ModelAndView("index1");
	}
	
	@RequestMapping(path="/home2",method=RequestMethod.GET)
	public String getHomePage2(Model m) {
		m.addAttribute("admin", "admin@gmail.com");
		m.addAttribute("developer", "dev@gmail.com");
		return "index2";
	}
	
	@RequestMapping(path="/about",method=RequestMethod.GET)
	public ModelAndView getAboutPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("about");//name of page.
		mv.addObject("about","Hey! This web app is developed by Razat Aggarwal.");
		return mv;
	}
	
	@RequestMapping(path="/help",method=RequestMethod.GET)
	public ModelAndView getHelpPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("help");
		
		//description. 
		mv.addObject("desc", "This is a help page , Please choose one of the help category to get started. ");
		
		//category
		Vector<String> vector = new Vector<String>();
		vector.add("Help Category 1");
		vector.add("Help Category 2");
		vector.add("Help Category 3");
		mv.addObject("categories", vector);
		
		return mv; 
	}
	
}
