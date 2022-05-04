package oopsdemo3;

public abstract class Bike {

	//generate implicit constructor
	Bike()
	{
		System.out.println("Bike is Created");
	}

	abstract void run();  // abstract method

	void changeGear()  // instance method
	{
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike{

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("Honda Bike Running..........");
	}
	
}