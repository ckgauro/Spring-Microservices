package com.gauro.springExampleinIn28minutes.web.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
//@Controller
//public class WelcomeController {
//
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String ShowWelcomePage(ModelMap model) {
//
//		model.put("name", getLoggedinUserName());
//		log.info("==================>");
//		log.info(getLoggedinUserName().toString());
//		log.info("====*******Ends++++++++");
//		return "Welcome";
//	}
//
//	private Object getLoggedinUserName() {
//
//		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//		if (principal instanceof UserDetails) {
//			return ((UserDetails) principal).getUsername();
//		}
//		return principal.toString();
//	}
//}

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUserName());
		return "welcome";
	}

	private String getLoggedinUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		
		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}
		
		return principal.toString();
	}

}