package com.crud.repo;

import org.springframework.data.repository.CrudRepository;

import com.crud.model.User;

public interface AdminRepo extends CrudRepository<User, Integer> {

}
