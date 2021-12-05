package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pojos.User;
import com.service.UserServiceImpl;

@Controller
public class VendorControllerImpl {

	@Autowired
	private UserServiceImpl service;
	
	@RequestMapping("/listvendors")
	public String listVendors(Model model)
	{
		List<User> vendorList=service.getVendorsList();
		model.addAttribute("msg", "ok");
		if(vendorList==null)
			model.addAttribute("msg", "empty");
		model.addAttribute("vList", vendorList);
		return "ListVendorPage";
	}
	@GetMapping("/update")
	public String update(Model model,@RequestParam("email")String email)
	{
		User vendor=service.getVendorByEmail(email);
		model.addAttribute("ven", vendor);
		return "updatePage";
	}
	@PostMapping("/update")
	public String update(Model model,User ven)
	{
		service.saveUpdate(ven);
		return "redirect:listvendors";
		
	}
	@RequestMapping("/delete")
	public String deleteVendor(@RequestParam("email")String email)
	{
		service.deleteVendor(email);
		return "redirect:listvendors";
	}
	@RequestMapping("/details")
	public String details()
	{
		return "DetailsPage";
	}
	
	@GetMapping("/addVendor")
	public String addVendor(Model model)
	{
		User vendor=new User();
		model.addAttribute("ven", vendor);
		return "AddVendorPage";
	}
	@PostMapping("/addVendor")
	public String saveVendor(User ven)
	{
		service.addVendor(ven);
		return "redirect:listvendors";
	}
}
