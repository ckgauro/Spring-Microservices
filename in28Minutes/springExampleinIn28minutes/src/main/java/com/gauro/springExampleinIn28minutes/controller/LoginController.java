package com.gauro.springExampleinIn28minutes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {
	
//	@RequestMapping("/login")
//	@ResponseBody
//	public String loginMessage() {
//		return "login";
//	}

	@RequestMapping("/login")
	public String loginMessage(){
		
		return "login";
	}
}
