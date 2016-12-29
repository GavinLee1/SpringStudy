package com.gavin.springStudy.JDBCTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.gavin.springStudy.aop.Student;
import com.gavin.springStudy.mapper.StudentMapper;
import com.gavin.studySpring.dao.StudentDAO;

public class StudentJDBCTemplate implements StudentDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(ds);
		
	}

	@Override
	public void create(String name, Integer age) {
		String SQL = "INSERT INTO student(age, name) VALUES(?, ?)";
		
		jdbcTemplateObject.update(SQL,age,name);
		
		System.out.println("Created Record Name = " + name + " Age = " + age);
		return;
		
	}

	@Override
	public Student getStudent(Integer id) {
		String SQL = "SELECT * FROM Student WHERE id = ?";
		Student stu = jdbcTemplateObject.queryForObject(SQL, new Object[]{id}, new StudentMapper());
		return stu;
	}

	@Override
	public List<Student> listStudents() {
		String SQL = "SELECT * FROM Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "DELETE FROM Student WHERE id = ?";
		jdbcTemplateObject.update(SQL,id);
		System.out.println("Deleted Record with ID = " + id );
		return;
	}

	@Override
	public void update(Integer id, Integer age) {
		String SQL = "UPDATE Student SET age = ? WHERE id = ?";
		jdbcTemplateObject.update(SQL, age, id);
		System.out.println("Updated Record with ID = " + id );
		return;
	}

}
