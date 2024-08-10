package com.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crud.model.User;
import com.crud.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo userrepo;

	public User create(User user) {

		return userrepo.save(user);
	}

	public User update(User user) {

		return userrepo.save(user);
	}

	public User getByEmail(String email) {
		return userrepo.findByEmail(email);
	}

	public User getById(int id) {
		return userrepo.findById(id).get();
	}
}
