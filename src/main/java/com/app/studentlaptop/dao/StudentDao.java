package com.app.studentlaptop.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.studentlaptop.dto.Student;
import com.app.studentlaptop.repo.StudentRepo;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student student) {
		
		return studentRepo.save(student);
		
	}
	
	public Student getStudent(Long id) {
		
		Optional<Student> student= studentRepo.findById(id);
		return student.get();
		
	}

	public List<Student> getAllStudents() {
	
		return studentRepo.findAll();
	}

	public Student updateStudent(Long id, Student student) {
		Student existstudent= studentRepo.findById(id).get();
	
		if(existstudent.getStudentId() == id) {
			existstudent.setStudentId(id);
			existstudent.setStudentName(student.getStudentName());
			existstudent.setStudentEmail(student.getStudentEmail());
			existstudent.setStudentPassword(student.getStudentPassword());
			existstudent.setLaptop(student.getLaptop());
			studentRepo.save(existstudent);
		}
		
		return student;
	}

	public String deleteStudent(Long id) {
		
		Student student = studentRepo.findById(id).get();
		if(student.getStudentId() == id) {
			studentRepo.deleteById(id);
		}
		return student.getStudentName() + "  deleted successfully";
	}

}
