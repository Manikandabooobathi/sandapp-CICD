package com.okayjava.html;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@Controller
public class SpringbootHtmlApplication   {

	@GetMapping("/")
	public String index() {
		System.out.println("This isfirst page");
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHtmlApplication.class, args);
	}
	



	
	

}
