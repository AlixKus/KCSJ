package com.lk.Service.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lk.Dao.Interface.StudentDaoInterface;
import com.lk.Model.Student;
import com.lk.Service.Interface.StudentService;

public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentDaoInterface dao;
	
	@Override
	public List<Student> getList() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
