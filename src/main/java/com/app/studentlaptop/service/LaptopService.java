package com.app.studentlaptop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.studentlaptop.configClass.ResponseStructure;
import com.app.studentlaptop.dao.LaptopDao;
import com.app.studentlaptop.dto.Laptop;

@Service
public class LaptopService  {
	
	@Autowired
	private LaptopDao laptopDao;

	public ResponseEntity<ResponseStructure<Laptop>>  getLaptop(Long id) {
		ResponseStructure<Laptop> structure = new ResponseStructure<Laptop>();
		structure.setMessage("Found Laptop");
		structure.setStatusCode(HttpStatus.FOUND.value());
		structure.setData(laptopDao.getLaptop(id));
		
		return new ResponseEntity<ResponseStructure<Laptop>>(structure,HttpStatus.FOUND);
	}

	public ResponseEntity<ResponseStructure<Laptop>> saveLaptop(Laptop laptop) {
		ResponseStructure<Laptop> structure = new ResponseStructure<Laptop>();
		structure.setMessage("Laptop saved");
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setData(laptopDao.saveLaptop(laptop));
		
		return new ResponseEntity<ResponseStructure<Laptop>>(structure, HttpStatus.CREATED);
	}

	public ResponseEntity<ResponseStructure<Laptop>> updateLaptop(Long id, Laptop laptop) {
		ResponseStructure<Laptop> structure = new ResponseStructure<Laptop>();
		structure.setMessage("laptop updated");
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setData(laptopDao.updateLaptop(id, laptop));
		
		return new ResponseEntity<ResponseStructure<Laptop>>(structure, HttpStatus.OK);
	}
	public ResponseEntity<ResponseStructure<Laptop>>  deleteLaptop(Long id) {
		ResponseStructure<Laptop> structure = new ResponseStructure<Laptop>();
		structure.setMessage("Laptop deleted");
		structure.setStatusCode(HttpStatus.OK.value());
		structure.setData(laptopDao.deleteLaptop(id));
		
		return new ResponseEntity<ResponseStructure<Laptop>>(structure,HttpStatus.OK);
	}
//	public ResponseStructure<Laptop> getAllLaptops() {
//		ResponseStructure<Laptop> structure = new ResponseStructure<Laptop>();
//		structure.setMessage("Found Laptop");
//		structure.setStatusCode(HttpStatus.FOUND.value());
//		structure.setDataList(laptopDao.getLaptops());
//		
//		return structure;
//	}

}
