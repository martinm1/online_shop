package org.my.application.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("title", "Home");
		mv.addObject("userClickedHome", true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("title", "About");
		mv.addObject("userClickedAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("title", "Contact");
		mv.addObject("userClickedContact", true);
		return mv;
	}
	
//	@RequestMapping(value="/test")
//	public ModelAndView test(@RequestParam(value="welcome_message", required=false) String welcomeMessage) {
//		ModelAndView mv = new ModelAndView("homepage");
//		
//		if(welcomeMessage == null) {
//			welcomeMessage = "Hello world";
//		}
//		
//		mv.addObject("welcome_message", welcomeMessage);
//		return mv;
//	}
	
//	@RequestMapping(value="/test/{welcome_message}")
//	public ModelAndView test(@PathVariable(value="welcome_message", required=false) String welcomeMessage) {
//		ModelAndView mv = new ModelAndView("homepage");
//		
//		if(welcomeMessage == null) {
//			welcomeMessage = "Hello world";
//		}
//		
//		mv.addObject("welcome_message", welcomeMessage);
//		return mv;
//	}
}
