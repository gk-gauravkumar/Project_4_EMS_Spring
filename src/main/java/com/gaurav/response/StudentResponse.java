package com.gaurav.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentResponse {
	
	@JsonIgnore
	long id;
	//@JsonProperty("First_Name")
	String FirstName;
	String LastName;
	
}
