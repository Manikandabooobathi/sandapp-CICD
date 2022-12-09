package com.okayjava.html.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.okayjava.html.model.User;
import com.okayjava.inter.Userdao;





@Controller
public class IndexController {
	
	
	@Autowired(required = false)
	public Userdao userdao;
	
	

//	@GetMapping("/")
//	public String index() {
//		
//		return "index";
//	}
	
//	@PostMapping("/register")
//	public String userRegistration(@ModelAttribute User user, Model model) {
//		System.out.println(user.toString());
//		// validate 
//		
//		model.addAttribute("firstname", user.getFname());
//		model.addAttribute("lastname", user.getLname());
//		
//		User Useerinserted = userrepo.save(user);
//		model.addAttribute("message", Useerinserted.getEmail() + "inserted..");
//		return "welcome";
//	}
	
	@RequestMapping("index")
	public String user() {
		// TODO Auto-generated method stub
		return "index";
	}
	
	@RequestMapping("login")
	public String userq() {
		// TODO Auto-generated method stub
		return "login";
	}
	
	@RequestMapping("back")
	public String userback() {
		// TODO Auto-generated method stub
		return "login";
	}
	@RequestMapping("sand1")
	public String usersand1() {
		// TODO Auto-generated method stub
		return "riversand";
	}
	
	@RequestMapping("Home")
	public String userbackhome() {
		// TODO Auto-generated method stub
		return "index";
	}

	@RequestMapping("confirmlogin")
	public String userorglogin() {
		// TODO Auto-generated method stub
		return "Register";
	}
	
	@RequestMapping("riversand")
	public String userorriver() {
		// TODO Auto-generated method stub
		return "riversand";
	}
	
	@RequestMapping("contact")
	public String userocontact() {
		// TODO Auto-generated method stub
		return "Contact";
	}
	
	@RequestMapping("booking")
	public String userocbooking() {
		// TODO Auto-generated method stub
		return "Bookingservice";
	}
	
	
	@RequestMapping("register")
	public String userRegistration( User user,Errors error) {
		if (error.hasErrors()) {
			
		}
		//User t= this.userdao.save(user);
		System.out.println("saved");
		return "welcome";
	}
}
