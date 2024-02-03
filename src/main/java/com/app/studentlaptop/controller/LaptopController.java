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
import com.app.studentlaptop.service.LaptopService;

@RestController
@RequestMapping("laptop")
public class LaptopController {
	
	@Autowired
	private LaptopService laptopService;
	
	
	@GetMapping("getLaptop")
	public Laptop getLaptop(@RequestParam Long id) {
		
		return laptopService.getLaptop(id);
	}
	
	
	@GetMapping("getLaptops")
	public List<Laptop> getAllStudent() {
		
		return laptopService.getAllLaptops();
	}
	
	@PostMapping("save")
	public Laptop saveLaptop(@RequestBody Laptop laptop  ) {
		return laptopService.saveLaptop(laptop);
		
	}
	
	@PutMapping("updateLaptop")
	public Laptop updateStudent(@RequestParam Long id,@RequestBody Laptop laptop) {
		
		return laptopService.updateLaptop(id,laptop);
	}
	
	@DeleteMapping("deleteLaptop")
	public String deleteLaptop(@RequestParam Long id) {
		
		return laptopService.deleteLaptop(id);
		
	}

}
