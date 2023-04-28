package com.gaurav.controller;

import java.util.List;

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
	
	@Autowired
	private EmployeeServices employeeServices;
	
	@GetMapping("getall")
	public List<Employee> getAll(){
		return employeeServices.getAll();
	}
	@PostMapping("insert")
	public Employee create(@RequestBody EmployeeInputRequest employeeInputRequest) {
		return employeeServices.create(employeeInputRequest);
	}
}
