package com.gaurav.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//= @controller + @responseBody
@RequestMapping("/api/student/")	
public class StudentController {
	
	//@RequestMapping(Value = "/get" , Method = RequestMethod.GET)
	@GetMapping("/get")
	public String get() {
		return "Jai Shree Ram";
	}

}
