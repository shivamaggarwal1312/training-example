package com.training.car.count.service;

import org.springframework.stereotype.Service;

import com.training.car.count.model.CarCount;

@Service
public class CarCountServiceImpl implements CarCountService{
	
	@Override
	public CarCount processCarCount(String from, String to) {
		
		//sensor data processing is to be done here
		
		CarCount carCount=new CarCount();
		carCount.setCount(12);
		return carCount;
	}
}
