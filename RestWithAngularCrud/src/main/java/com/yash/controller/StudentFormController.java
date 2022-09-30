package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.StudentForm;
import com.yash.service.HomeService;

@RestController
@CrossOrigin("*")
public class StudentFormController {

	@Autowired
	HomeService hs;
	
	@PostMapping("/save")
	public String SaveData(@RequestBody StudentForm sf)
	{
		hs.SaveData(sf);
		System.out.println(sf);
		return "Data saved successfully...!!!";
	}
	
	@GetMapping("/getAllData")
	public List<StudentForm> GetAllData()
	{
		return hs.GetAllStudentForm();
	}
	
	@DeleteMapping("/deletedata/{sid}")
	public void deleteData(@PathVariable int sid) {
		// TODO Auto-generated method stub
		hs.deleteData(sid);
		
	}
	
	
}
