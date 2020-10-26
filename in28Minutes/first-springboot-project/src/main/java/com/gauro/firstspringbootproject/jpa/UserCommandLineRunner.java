package com.gauro.firstspringbootproject.jpa;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new User("chandra", "Admin"));
		repository.save(new User("Ravi", "User"));
		repository.save(new User("Raju", "Admin"));
		repository.save(new User("Satih", "User"));
		
		Iterable<User> lsUser=repository.findAll();
		StreamSupport.stream( lsUser.spliterator(), false).forEach(System.out::println);
		
	}

}
