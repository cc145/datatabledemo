package com.mapper;

import java.util.List;

import com.pojo.PageInfo;
import com.pojo.Student;

public interface StudentMapper {
   
	public List<Student> selectStudentAll(PageInfo pageInfo);
	public int selectStutotal();
}