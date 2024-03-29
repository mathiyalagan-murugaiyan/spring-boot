package com.app.studentlaptop.dto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="student_table")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	private String studentName;
	
	private String studentEmail;
	
	private String studentPassword;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop laptop;
	
	


}
