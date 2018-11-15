package org.vehicle.tracking.vehiclestatus.simulator;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Vehicle;

@FeignClient("VehicleClient")
public interface VehicleClient {

	@RequestMapping("/api/vehicle")
	List<Vehicle> findAll();
	
	@RequestMapping("/api/vehicle")
	Optional<Vehicle> ping(String vehicleId);


}
