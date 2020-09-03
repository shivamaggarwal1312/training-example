package com.training.car.count.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.car.count.model.CarCount;
import com.training.car.count.service.CarCountService;

@RestController
@RequestMapping("/car")
public class CarCountController {
	
	@Autowired
	private CarCountService carCountService;
	
	@GetMapping(value = "/count")
	public CarCount getCarCount(@RequestParam String from, @RequestParam String to) {
		return carCountService.processCarCount(from, to);
}


	
}
