package com.qa.boxingHallsOfFame.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.boxingHallsOfFame.domain.BoxingHallOfFame;

@Repository
public interface BoxingHallsOfFameRepo extends JpaRepository<BoxingHallsOfFame, Long>  {

	BoxingHallsOfFame findByName(String name);
}
