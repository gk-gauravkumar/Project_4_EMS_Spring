package com.gaurav.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="students")
public class Student {
	
	@Id	
	@GeneratedValue		//@GeratedValue  for autoincreameted values in sql
	@Column(name="id")
	private long id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;

}
