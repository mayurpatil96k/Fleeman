package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Hub;

public interface HubRepository extends JpaRepository<Hub,Integer>{
	
}
