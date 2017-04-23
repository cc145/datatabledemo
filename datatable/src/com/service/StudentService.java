package com.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.pojo.PageInfo;
import com.pojo.Student;

@Service
public interface StudentService {
	public List<Student> selectStudentAll(PageInfo pageInfo);
	public int selectStutotal();
}
