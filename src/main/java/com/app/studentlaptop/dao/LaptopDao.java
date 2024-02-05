package com.app.studentlaptop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.studentlaptop.dto.Laptop;
import com.app.studentlaptop.dto.Student;
import com.app.studentlaptop.repo.LaptopRepo;
import com.app.studentlaptop.repo.StudentRepo;

@Repository
public class LaptopDao {

	@Autowired
	private LaptopRepo laptopRepo;

	@Autowired
	private StudentRepo studentRepo;

	public Laptop getLaptop(Long id) {

		return laptopRepo.findById(id).get();
	}

	public List<Laptop> getLaptops() {

		return laptopRepo.findAll();
	}

	public Laptop saveLaptop(Laptop laptop) {

		return laptopRepo.save(laptop);
	}

	public Laptop updateLaptop(Long id, Laptop laptop) {

		Laptop existinglaptop = laptopRepo.findById(id).get();

		if (existinglaptop.getLaptopId() != null) {

			laptop.setLaptopId(id);
			laptopRepo.save(laptop);
			return laptop;
		}

		return null;
	}

	@SuppressWarnings("null")
	public Laptop deleteLaptop(Long id) {

		java.util.Optional<Student> student = studentRepo.findById(id);

		if (student.isPresent()) {
			Student existingStudent = studentRepo.findById(id).orElse(null);
			Laptop existingLaptop = null;

			if (existingStudent != null) {
				existingLaptop = existingStudent.getLaptop();

				if (existingLaptop != null) {

					existingStudent.setLaptop(null);
					studentRepo.save(existingStudent);

					laptopRepo.delete(existingLaptop);

					return existingLaptop;
				} else {
					return null;
				}
			} else {
				return null;
			}
		}

		else {
			laptopRepo.deleteById(id);

		}
		return null;

	}

}
