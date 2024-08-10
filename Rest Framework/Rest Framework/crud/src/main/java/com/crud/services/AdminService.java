package com.crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.crud.model.User;
import com.crud.repo.AdminRepo;

@Component
public class AdminService {

	@Autowired
	private AdminRepo adminrepo;

	public List<User> getAllUser() {
		return (List<User>) this.adminrepo.findAll();

	}

	public void getById(int id) {
		this.adminrepo.deleteById(id);
	}

}
