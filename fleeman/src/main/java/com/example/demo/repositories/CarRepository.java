package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Car;

public interface CarRepository extends JpaRepository<Car,Long>
{

	@Query(value = "SELECT * FROM Car WHERE hub_id = :hub_id AND Car_Type_ID = :Car_Type_ID", nativeQuery = true)
	List<Car> findByHubIdAndCategoryId(@Param("hub_id") long hub_id, @Param("Car_Type_ID") long Car_Type_ID);
}
