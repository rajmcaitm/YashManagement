package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.StudentForm;

@Repository
public interface HomeRepository extends JpaRepository<StudentForm, Integer>{

	
}
