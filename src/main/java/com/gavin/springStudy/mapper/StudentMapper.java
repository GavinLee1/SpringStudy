package com.gavin.springStudy.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gavin.springStudy.aop.Student;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu = new Student();
		stu.setId(rs.getInt("id"));
		stu.setAge(rs.getInt("age"));
		stu.setName(rs.getString("name"));
		return stu;
	}

}
