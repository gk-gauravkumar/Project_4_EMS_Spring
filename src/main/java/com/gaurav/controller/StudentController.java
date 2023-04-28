package com.gaurav.controller;

import com.gaurav.entity.Student;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//= @controller + @responseBody
@RequestMapping("/api/student/")	
public class StudentController {
	
/*
	//@Value("${app.name}")
	@Value("${app.name:Default app name}")
	String appName;
	
	//@RequestMapping(Value = "/get" , Method = RequestMethod.GET)
	@GetMapping("/get")
	public StudentResponse get() {
		StudentResponse student = new StudentResponse("Ram","Chandra");
		return student;
	}
*/

}
