package com.example.craddle.Studentrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.hotel.studententity.Studententity;
//import org.springframework.stereotype.Repository;



public interface Studentrepository extends JpaRepository<Studententity, Integer>{
	

}