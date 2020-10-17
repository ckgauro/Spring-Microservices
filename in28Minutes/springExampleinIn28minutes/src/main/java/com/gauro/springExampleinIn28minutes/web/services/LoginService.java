package com.gauro.springExampleinIn28minutes.web.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	public boolean validateUser(String name, String password) {
		return name.equalsIgnoreCase("chandra") && password.equalsIgnoreCase("dummy");
	}

}
