package com.gaurav.services;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gaurav.entity.Student;
import com.gaurav.repository.studentRepository;

@Service
public class StudentServices {
	
	@Autowired
	studentRepository repo;
	
	public List<Student> getAll()
	{
		return repo.findAll();
	}
}
