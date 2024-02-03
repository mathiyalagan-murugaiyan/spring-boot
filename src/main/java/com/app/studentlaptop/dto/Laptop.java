package com.app.studentlaptop.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="laptop_table")
public class Laptop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long laptopId;
	
	private String laptopBrand;
	
	private Long laptopModelNo;
	

	

}
