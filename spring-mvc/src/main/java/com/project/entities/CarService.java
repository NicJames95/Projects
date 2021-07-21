package com.project.entities;

import java.util.LinkedList;
import java.util.List;

public class CarService {
	List<Car> cars= new LinkedList<>();
	
	public List<Car> findAll() {
		return cars;
	}

}
