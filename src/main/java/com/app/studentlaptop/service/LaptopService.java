package com.app.studentlaptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.studentlaptop.dao.LaptopDao;
import com.app.studentlaptop.dto.Laptop;

@Service
public class LaptopService  {
	
	@Autowired
	private LaptopDao laptopDao;

	public Laptop getLaptop(Long id) {
		
		return laptopDao.getLaptop(id);
	}

	public List<Laptop> getAllLaptops() {
	
		return laptopDao.getLaptops();
	}

	public Laptop saveLaptop(Laptop laptop) {
		
		return laptopDao.saveLaptop(laptop);
	}

	public Laptop updateLaptop(Long id, Laptop laptop) {
		
		return laptopDao.updateLaptop(id,laptop);
	}

	public String deleteLaptop(Long id) {
	
		return laptopDao.deleteLaptop(id);
	}

}
