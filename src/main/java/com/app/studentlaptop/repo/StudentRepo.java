package com.app.studentlaptop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.studentlaptop.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{


}
