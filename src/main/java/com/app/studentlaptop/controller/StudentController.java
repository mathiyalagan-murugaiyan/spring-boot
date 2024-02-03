package com.app.studentlaptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.studentlaptop.dto.Laptop;
import com.app.studentlaptop.dto.Student;
import com.app.studentlaptop.service.StudentService;


@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@GetMapping("getStudent")
	public Student getStudent(@RequestParam Long id) {
		
		return studentService.getStudent(id);
	}
	
	
	@GetMapping("getStudents")
	public List<Student> getAllStudent() {
		
		return studentService.getAllStudents();
	}
	
	@PostMapping("save")
	public Student saveStudent(@RequestBody Student student ) {
		
		
		
		
		return studentService.saveStudent(student );
		
	}
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestParam Long id,@RequestBody Student student) {
		
		return studentService.updateStudent(id,student);
	}
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam Long id) {
		
		return studentService.deleteStudent(id);
		
	}

}
