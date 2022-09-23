package com.yash.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yash.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
