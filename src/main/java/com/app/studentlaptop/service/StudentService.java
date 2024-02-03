package com.app.studentlaptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.studentlaptop.dao.StudentDao;
import com.app.studentlaptop.dto.Student;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentDao studentDao;
	
	public Student saveStudent(Student student) {
		
		return  studentDao.saveStudent(student );
		
	}
	
	public Student getStudent(Long id) {
		
		return studentDao.getStudent(id);
	}

	public List<Student> getAllStudents() {
		
		return studentDao.getAllStudents();
	}

	public Student updateStudent(Long id, Student student) {
	
		return studentDao.updateStudent(id,student);
	}

	public String deleteStudent(Long id) {
		
		return studentDao.deleteStudent(id);
	}

}
