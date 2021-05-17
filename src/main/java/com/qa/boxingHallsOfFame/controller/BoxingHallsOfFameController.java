package com.qa.boxingHallsOfFame.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.boxingHallsOfFame.domain.BoxingHallsOfFame;
import com.qa.boxingHallsOfFame.service.BoxingHallsOfFameService;

@RestController
public class BoxingHallsOfFameController {
	
	private BoxingHallsOfFameService service; 
	
	public BoxingHallsOfFameController(BoxingHallsOfFameService service) {
		this.service = service; 
	}
		

	@PostMapping("/create")
	public ResponseEntity<BoxingHallsOfFame> createFighter(@RequestBody BoxingHallsOfFame boxingHallsOfFame) {
		return new ResponseEntity<BoxingHallsOfFame>(this.service.create(boxingHallsOfFame),HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<BoxingHallsOfFame>> getBoxingHallsOfFame(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	
	@GetMapping("/getOne/{index}")
	public ResponseEntity<BoxingHallsOfFame> getFighterById(@PathVariable Long index) {
		return ResponseEntity.ok(this.service.getById(index));
	}
	

	@DeleteMapping("/remove/{index}")
	public BoxingHallsOfFame removeFighter(@PathVariable Long index) {
		this.service.remove(index);
		return this.service.getById(index);
	}
	
	@GetMapping("/findByName")
	public BoxingHallsOfFame findByName(@PathParam("name") String name) {
		for(BoxingHallsOfFame m : this.service.getAll()) {
			System.out.println(m.getName());
		}
		System.out.println(name);
		return null; 
	}
	
	 @PutMapping("/update/{id}")
	 public ResponseEntity<BoxingHallsOfFame>updateFighter(@PathVariable Long id, @RequestBody BoxingHallsOfFame newObject) {
		 return new ResponseEntity<BoxingHallsOfFame>(this.service.update(id, newObject), HttpStatus.ACCEPTED);
	 }
	

}


