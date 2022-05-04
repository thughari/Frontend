package com.wipro.rps;

public class DaewooTruck implements Truck {

	private int axles;
	private int weight;
	
	
	public DaewooTruck(int axles, int weight) {
		this.axles = axles;
		this.weight = weight;
	}


	@Override
	public int axles() {
		
		return axles;
	}


	@Override
	public int weight() {
		
		return weight;
	}
	

}
