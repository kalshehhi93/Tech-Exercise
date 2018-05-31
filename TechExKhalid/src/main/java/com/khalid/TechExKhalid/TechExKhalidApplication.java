package com.khalid.TechExKhalid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@SpringBootApplication
public class TechExKhalidApplication {

	@RequestMapping("/")
	@ResponseBody
	String sayHello() {
		return "Hello World";
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(TechExKhalidApplication.class, args);
	}
}
