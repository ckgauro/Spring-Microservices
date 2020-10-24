package com.gauro.springExampleinIn28minutes.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobalSecuirty(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("chandra").password("dummy").roles("USER", "ADMIN");
	}
	
	
	protected void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests().antMatchers("/login").permitAll()
		.antMatchers("/","/*todo*/**").access("hasRole('USER')").and()
		.formLogin();
	}

}
