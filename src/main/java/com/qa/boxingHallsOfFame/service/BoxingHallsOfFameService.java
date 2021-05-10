package com.qa.boxingHallsOfFame.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.qa.boxingHallsOfFame.repo.BoxingHallsOfFameRepo;
import com.qa.boxingHallsOfFame.domain.BoxingHallsOfFame;

@Service
public class BoxingHallsOfFameService {
	
	private BoxingHallsOfFameRepo repo;
	
	public BoxingHallsOfFameService(BoxingHallsOfFameRepo repo) {
		this.repo = repo; 
	}
	
	public BoxingHallsOfFame create(BoxingHallsOfFame m) {
		return this.repo.save(m);
	}

	public List<BoxingHallsOfFame> getAll() {
		return this.repo.findAll();
	}

	public BoxingHallsOfFame getById(Long id) {
		Optional<BoxingHallsOfFame> optionalFighter = this.repo.findById(id);
		return optionalFighter.get(); 
	}

	public boolean remove(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}

	public BoxingHallsOfFame update(Long id, BoxingHallsOfFame newBoxingHallsOfFame) {
		return null;
	}

	public BoxingHallsOfFame getFighterByName(String name) {
		return null;
	}


}