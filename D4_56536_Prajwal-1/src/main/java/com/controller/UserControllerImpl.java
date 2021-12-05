package com.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojos.User;
import com.pojos.UserCredentials;
import com.service.UserServiceImpl;

@Controller
public class UserControllerImpl {

	@Autowired
	private UserServiceImpl service;

	@RequestMapping({ "/", "/login" })
	public String login(@ModelAttribute("userCred") UserCredentials userCred) {
		return "LoginPage";
	}
@RequestMapping("/logout")
public String logout()
{
	return "LogOutPage";
}
	@RequestMapping("/validate")
	public String validate(@Valid @ModelAttribute("userCred")UserCredentials userCred,BindingResult br,HttpSession session)
	{
		if(br.hasErrors())
		{
			return "LoginPage";
		}
		User user=service.getUserDetails(userCred.getEmail(), userCred.getPassword());
		if(user!=null)
		{
			session.setAttribute("LoggedUser", user);
			if(user.getRole().equals("admin"))
				return "redirect:listvendors";
			else
				return "redirect:details";
		}
		else
			return "InvalidLoginPage";
	}
		
}
