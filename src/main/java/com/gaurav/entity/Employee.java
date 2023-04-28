package com.gaurav.entity;

import javax.persistence.Table;
import com.gaurav.request.EmployeeInputRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
	public Employee(EmployeeInputRequest employeeInputRequest) {
		this.name = employeeInputRequest.getName();
		this.city = employeeInputRequest.getCity();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp")
	private int emp;
	@Column(name = "name")
	private String name;
	@Column(name = "city")
	private String city;

}
