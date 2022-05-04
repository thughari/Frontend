package com.wipro.rps;

public class NissanTruck implements Truck {

	private int axles;
	private int weight;
	
	public NissanTruck(int axles, int weight) {
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
