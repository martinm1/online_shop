package org.my.application.onlineshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("homepage");
		mv.addObject("welcome_message", "Spring Web MVC Welcome Message");
		return mv;
	}
}
