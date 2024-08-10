package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.crud.model.User;
import com.crud.repo.UserRepo;
import com.crud.services.AdminService;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;
	
	@Autowired
    private UserRepo userRepo;
	
	
	@GetMapping("/admin")
	public String viewAdminPage(Model model) {
        List<User> users = (List<User>) userRepo.findAll();
        model.addAttribute("users", users);
        return "user_list";
    }
	
	@GetMapping("/delete_user/{id}")
	public String delete(@PathVariable("id") int id) {
		adminservice.getById(id);
		
		return "redirect:/admin";
	}
	
	
	
	

}
