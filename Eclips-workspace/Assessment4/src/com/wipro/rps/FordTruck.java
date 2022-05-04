package com.wipro.rps;

public class FordTruck implements Truck {

	private int axles;
	private int weight;
	
	public FordTruck(int axles, int weight) {
		this.weight=weight;
		this.axles=axles;
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
