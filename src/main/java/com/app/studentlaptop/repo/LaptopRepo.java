package com.app.studentlaptop.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.studentlaptop.dto.Laptop;

public interface LaptopRepo extends JpaRepository<Laptop, Long>{

}
