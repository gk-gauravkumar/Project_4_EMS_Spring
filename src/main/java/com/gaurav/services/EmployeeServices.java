package com.gaurav.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.entity.Employee;
import com.gaurav.repository.EmployeeRepository;
import com.gaurav.request.EmployeeInputRequest;

@Service
public class EmployeeServices {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAll(){
		List<Employee> list = employeeRepository.findAll();
		return list;
	}
	public Employee create(EmployeeInputRequest employeeInputRequest){
		Employee e = new Employee(employeeInputRequest);
		return employeeRepository.save(e);
	}
	
}
