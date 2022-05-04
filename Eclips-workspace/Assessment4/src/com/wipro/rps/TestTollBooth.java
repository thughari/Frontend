package com.wipro.rps;

public class TestTollBooth {

	public static void main(String[] args) {
		TollBooth booth = new AlleghenyTollBooth();
		System.out.println("\n******Welcome to AlleghenyTollBooth******");

		Truck ford = new FordTruck(5, 12500); // 5 axles and 12000 kilograms
		Truck nissan = new NissanTruck(2, 5000); // 2 axles and 5000kg
		Truck daewoo = new DaewooTruck(6, 17000); // ….

		booth.calculateToll(ford);
		
		booth.calculateToll(nissan);
		
		booth.calculateToll(daewoo);
		booth.displayData();


	}

}
