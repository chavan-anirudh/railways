package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailwayDto;
import com.app.entity.Category;
import com.app.service.Railwayservice;



@RestController
@RequestMapping("/railway")
public class RailwayController {
	
	@Autowired
	private Railwayservice railser;
	
	@GetMapping("/{cat}")
	public ResponseEntity<?> getRailway(@PathVariable Category cat)
	{
		return ResponseEntity.status(HttpStatus.OK).body(railser.getRailByCat(cat));
	}
	
	
	@PostMapping
	public ResponseEntity<?> addRail(@RequestBody RailwayDto raildto){
		return ResponseEntity.status(HttpStatus.CREATED).body(railser.addRailway(raildto));
	}

	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteRail(@PathVariable Long id)
	{
		return  ResponseEntity.status(HttpStatus.OK).body(railser.delRailway(id));
	}
}
