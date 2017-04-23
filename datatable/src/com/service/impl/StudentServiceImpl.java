package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pojo.PageInfo;
import com.mapper.StudentMapper;
import com.pojo.Student;
import com.service.StudentService;


public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper stuMapper;
	
	public List<Student> selectStudentAll(PageInfo pageInfo) {
		// TODO Auto-generated method stub
		return stuMapper.selectStudentAll(pageInfo);
	}

	@Override
	public int selectStutotal() {
		return stuMapper.selectStutotal();
	}
}
