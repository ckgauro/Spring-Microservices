package com.gauro.springExampleinIn28minutes.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gauro.springExampleinIn28minutes.web.services.LoginService;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
@Slf4j
@Controller
@SessionAttributes("name")
public class LoginController {
	final static Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	LoginService loginService;
//	@RequestMapping("/login")
//	@ResponseBody
//	public String loginMessage() {
//		return "login";
//	}

	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String showLoginPage(){	
		
		
		
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String handleLogin(ModelMap model, @RequestParam String name, @RequestParam String password) {
		logger.info("handleLogin=====>");
		log.info("Testing ----");
		if(! loginService.validateUser(name,password)) {
			model.put("errorMessage", "Invalid user "+name);
			return "login";
		}
		
		model.put("name", name);
		model.put("password", password);
		return "welcome";
		
	}
	

	@RequestMapping("/")
	public String handler (Model model) {
		model.addAttribute("msg",
				"a jar packaging example");
		return "myView";
	}
}
