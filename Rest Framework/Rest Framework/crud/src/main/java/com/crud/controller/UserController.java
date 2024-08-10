package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.crud.model.User;
import com.crud.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@Autowired
	UserService userservice;

	@GetMapping("/")
	public String homePage() {
		return "index";
	}

	@GetMapping("/register")
	public String registerForm() {
		return "signup_form";
	}

	@PostMapping("/process_register")
	public String registerProcess(@ModelAttribute("user") User user) {
		try {
			userservice.create(user);
		} catch (Exception e) {
			System.out.println(e);
		}
		return "redirect:/";
	}

	@GetMapping("/login")
	public String loginform() {
		return "login_form";
	}

	@PostMapping("/process_login")
	public String loginprocess(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session) {
		// TODO: process POST request
		User u = userservice.getByEmail(email);
		
		if (u != null) {
			if (password.equals(u.getPassword())) {
				session.setAttribute("user", u);
				return "redirect:edit_profile?logindone";
			} else {
				return "redirect:/?incorrectPassowrd";
			}

		} else {
			return "redirect:/?EmailNotFound";
		}
	}
	
	
	@GetMapping("/edit_profile")
	public String editForm(HttpSession session, Model m) {
	    User user = (User) session.getAttribute("user");
	    
	    String imagePath = user.getProfile_pic();
	    
	    m.addAttribute("user", user);
	    m.addAttribute("imagePath", imagePath); 
	    
	    return "edit_profile_form";
	}
	
	@PostMapping("/process_edit_profile")
    public String processEditProfile(@ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        if (result.hasErrors()) {
            return "edit_profile_form";
        }
        
        User existingUser = (User) session.getAttribute("user");
        existingUser.setEmail(user.getEmail());
        existingUser.setMobile(user.getMobile());
        existingUser.setProfile_pic(user.getProfile_pic());
        
        userservice.create(existingUser);
        
        return "redirect:edit_profile?edit_profile_success";
    }
	
	

}