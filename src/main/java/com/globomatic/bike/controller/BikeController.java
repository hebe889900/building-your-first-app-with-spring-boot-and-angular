package com.globomatic.bike.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.globomatic.bike.models.Bike;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikeController {
	@GetMapping
	public List<Bike> list() {
		List<Bike> bikes = new ArrayList<>();
		return bikes;
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	
	public void create(@RequestBody Bike bike) {
		
	}
	
	public Bike get(@PathVariable("id") long id) {
		return new Bike();
	}
}
