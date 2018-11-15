package org.vehicle.tracking.vehiclestatus.simulator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.model.Status;
import com.example.model.Vehicle;

@Component
public class ScheduledTasks {

	private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);

	@Autowired
	VehicleClient vehicleClient;

	@Scheduled(fixedRate = 5000)
	public void pingVehicle() {

		// List<Vehicle> vehicleList = vehicleClient.findAll();

		List<Vehicle> vehicleList = Arrays.asList(
				new Vehicle("1", "11", Status.Connected, 111L),
				new Vehicle("2", "22", Status.Connected, 222L), 
				new Vehicle("3", "33", Status.Connected, 333L),
				new Vehicle("4", "44", Status.Connected, 444L), 
				new Vehicle("5", "55", Status.Connected, 555L),
				new Vehicle("6", "66", Status.Connected, 666L), 
				new Vehicle("7", "77", Status.Connected, 777L));

		Random rand = new Random();
		System.out.println("******************");
		for (int i = 0; i < vehicleList.size() - 2; i++) {
			int randomIndex = rand.nextInt(vehicleList.size());
			Vehicle randomVehicle = vehicleList.get(randomIndex);
			System.out.println("randomVehicle: "+randomVehicle.getId());
//			vehicleClient.ping(randomVehicle.getId());
		}
		System.out.println("******************");


	}

}