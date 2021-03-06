package com.cosmos.LoyaltyProgram.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cosmos.LoyaltyProgram.model.Driver;
@Repository("driverRepository")
public interface DriverRepository extends JpaRepository<Driver, Long>{
	
	
	Driver getDriverByCardNumber(Long cardNumber);
	
	Driver getDriverByPhoneNumber(String phoneNumber);
	
	List<Driver> getDriverByLastFuelingTimeBefore(LocalDateTime transactionTime);
	
	
	

}
