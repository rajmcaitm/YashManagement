package com.yash.serviceImpl;

import java.util.List;

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
	public void deleteData(int sid) {
		// TODO Auto-generated method stub
		hr.deleteById(sid);
	}
}
