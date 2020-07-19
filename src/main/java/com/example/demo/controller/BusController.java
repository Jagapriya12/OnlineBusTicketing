package com.example.demo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Bus;
import com.example.demo.repository.BusRepository;

@RestController
@RequestMapping("/bus")
public class BusController {
    @Autowired
	BusRepository busRepository;
	
	@GetMapping("/test")
	public String test()
	{
		return "testing";
	}
	
	@GetMapping
	public List<Bus> getAllBus()
	{
		return busRepository.getBus();
	}
	
	

	
	 @GetMapping(value = "/{sourcecity}/{destinationcity}/{traveldate}")
	    public ResponseEntity<?> getBus(@PathVariable("sourcecity") String sourcecity,@PathVariable("destinationcity") String destinationcity, @PathVariable("traveldate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date traveldate) {
	        Bus bus = busRepository.findByBusDetails(sourcecity,destinationcity,traveldate);
	        if (bus == null) {
	            return new ResponseEntity<String>("No bus found with the source "+ sourcecity, HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<Bus>(bus, HttpStatus.OK);
	    }
	
	



}
