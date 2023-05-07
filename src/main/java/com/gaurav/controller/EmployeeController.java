package com.gaurav.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.entity.Employee;
import com.gaurav.request.EmployeeInputRequest;
import com.gaurav.services.EmployeeServices;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	
	Logger log = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("getall")
	public List<Employee> getAll(){
		log.info("inside info of getAll method");
		return employeeServices.getAll();
	}
	@PostMapping("insert")
	public Employee create(@RequestBody EmployeeInputRequest employeeInputRequest) {
		return employeeServices.create(employeeInputRequest);
	}
}
