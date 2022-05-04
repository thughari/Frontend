package oopsdemo3;

public class Circle implements Shape {

	private double radius;
	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle......");
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

}
