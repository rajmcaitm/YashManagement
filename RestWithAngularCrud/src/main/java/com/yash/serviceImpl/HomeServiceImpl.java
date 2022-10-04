package com.yash.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yash.model.StudentForm;
import com.yash.repository.HomeRepository;
import com.yash.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository hr;

	@Override
	public void SaveData(StudentForm sf) {
	// TODO Auto-generated method stub
	hr.save(sf);	
	}

	@Override
	public List<StudentForm> GetAllStudentForm() {
	// TODO Auto-generated method stub
	return hr.findAll();
	}
	
	@Override
	public StudentForm modifyStudent(StudentForm stdForm, int sid) {
		StudentForm std = new StudentForm();
		try {
			std = hr.findById(sid).get(); 
			if (std != null) {
				std.setSname(stdForm.getSname());
				std.setAddress(stdForm.getAddress());
				std.setEmail(stdForm.getEmail());
				std.setMobno(stdForm.getMobno());
				hr.save(std);
			}

		} catch (Exception e) {
			System.out.println("Exception while modifing Student Form");
		}
		return std;
	}
	
	@Override
	public void deleteData(int sid) {
		hr.deleteById(sid);
	}

	
}
