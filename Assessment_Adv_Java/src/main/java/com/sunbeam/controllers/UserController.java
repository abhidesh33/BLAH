package com.sunbeam.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import com.sunbeam.Credentials.Credentials;
import com.sunbeam.Credentials.UpdateDetails;
import com.sunbeam.daos.UserDaoImpl;
import com.sunbeam.pojos.User;
import com.sunbeam.services.UserServiceImpl;

@Controller
public class UserController {
	// @Autowired
	private UserServiceImpl userService;
	private UserDaoImpl userDaoImpl;
	// @Autowired
	public UserController(UserServiceImpl userService) {
		this.userService = userService;
	}

	@RequestMapping({ "/", "/index" })
	public String index(Model model) {// this show index page on browser
		Credentials cred = new Credentials("", "");
		model.addAttribute("command", cred);
		return "index";
	}

	@RequestMapping("/login")
	public String login(Model model) {// this show index page on browser
		Credentials cred = new Credentials("guest@gmail.com", "");
		model.addAttribute("command", cred);

		return "login";
	}

	@RequestMapping("/validate")
	public String validate(Credentials cred, HttpSession session) {
		User user = userService.authenticateUser(cred.getEmail(), cred.getPassword());
		if (user == null) {
			return "failed";
		}
		session.setAttribute("user", user);
		if (user.getRole().equals("admin"))
			return "manage";
		return "details";
	}

	@RequestMapping("/vendorList")
	public String manage(Model model) {
		List<User> list = userService.findAllVendors();
		model.addAttribute("list", list);
		return "vendorList";
	}
	
	//String name, String email, String city, String cell_no, Double reg_amount, String reg_date
	@RequestMapping("/update")
	public String updateVendor( UpdateDetails cred, Model model) {
		List<User> list = userDaoImpl.update(cred.getName(),cred.getEmail(),cred.getCity(),cred.getCell_no(),cred.getReg_amount(),cred.getReg_date());
		model.addAttribute("list", list);
		return "vendorList";
	}
	
	
	
	
	
	
	
	
	

	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";

	}
}
