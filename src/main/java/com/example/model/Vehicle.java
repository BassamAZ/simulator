package com.example.model;

public class Vehicle {
	private String id;
	private String registrationNumber;
	private Status status;
	private Long ownerId;
	
	public Vehicle() {
	}
	
	public Vehicle(String id, String registrationNumber, Status status, Long ownerId ) {
		this.id=id;
		this.registrationNumber=registrationNumber;
		this.status=status;
		this.ownerId=ownerId;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

}
