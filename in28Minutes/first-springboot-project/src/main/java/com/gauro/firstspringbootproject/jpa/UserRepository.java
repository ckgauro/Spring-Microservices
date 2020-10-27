package com.gauro.firstspringbootproject.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="users", collectionResourceRel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
	List<User> findByRole(String role);
	List<User> findByName(String name);
	List<User> findByNameStartsWith(String name);
	
	

}
