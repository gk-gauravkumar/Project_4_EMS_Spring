package com.gaurav.repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.gaurav.entity.Student;


@Component
public interface studentRepository extends JpaRepository<Student, Long>{

}
