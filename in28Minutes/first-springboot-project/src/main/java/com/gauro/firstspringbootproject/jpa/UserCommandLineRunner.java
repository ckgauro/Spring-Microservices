package com.gauro.firstspringbootproject.jpa;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserCommandLineRunner implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		Predicate<User> pUserAdmin = el -> el.getRole().equals("Admin");
		Predicate<User> pUserName = el -> el.getName().startsWith("R");

		repository.save(new User("Chandra", "Admin"));
		repository.save(new User("Ravi", "User"));
		repository.save(new User("Raju", "Admin"));
		repository.save(new User("Satih", "User"));

		Iterable<User> lsUser = repository.findAll();
		StreamSupport.stream(lsUser.spliterator(), false).forEach(System.out::println);

		StreamSupport.stream(repository.findByRole("Admin").spliterator(), false).filter(pUserAdmin)
				.forEach(el -> log.info(el.toString()));

		log.info("----Find By Role----");
		StreamSupport.stream(repository.findByRole("Admin").spliterator(), false)
				.forEach(el -> log.info(el.toString()));
		log.info("----Find By Name----");
		StreamSupport.stream(repository.findByName("Chandra").spliterator(), false)
				.forEach(el -> log.info(el.toString()));
		log.info("----Find by Name like");
		StreamSupport.stream(repository.findAll().spliterator(), false).filter(pUserName)
				.forEach(el -> log.info(el.toString()));

	}

}
