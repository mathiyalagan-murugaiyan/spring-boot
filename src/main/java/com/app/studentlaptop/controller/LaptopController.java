package com.app.studentlaptop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.studentlaptop.configClass.ResponseStructure;
import com.app.studentlaptop.dto.Laptop;
import com.app.studentlaptop.service.LaptopService;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	
	@GetMapping("getLaptop")
	public ResponseEntity<ResponseStructure<Laptop>> getLaptop(@RequestParam Long id) {
		
		return laptopService.getLaptop(id);
	}
	
	
	
	@PostMapping("save")
	public ResponseEntity<ResponseStructure<Laptop>> saveLaptop(@RequestBody Laptop laptop  ) {
		return laptopService.saveLaptop(laptop);
		
	}
	
	@PutMapping("updateLaptop")
	public ResponseEntity<ResponseStructure<Laptop>> updateStudent(@RequestParam Long id,@RequestBody Laptop laptop) {
		
		return laptopService.updateLaptop(id,laptop);
	}
	
	@DeleteMapping("deleteLaptop")
	public ResponseEntity<ResponseStructure<Laptop>> deleteLaptop(@RequestParam Long id) {
		
		return laptopService.deleteLaptop(id);
		
	}

//	@GetMapping("getLaptops")
//	public ResponseStructure<Laptop> getAllStudent() {
//		
//		return laptopService.getAllLaptops();
//	}
}
