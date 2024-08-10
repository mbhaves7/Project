package com.crud.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.User;

@Repository
public interface UserRepo extends CrudRepository<User,Integer>{

	@Query("select u from User u where u.email = ?1")
	public User findByEmail(String email) ;
}
