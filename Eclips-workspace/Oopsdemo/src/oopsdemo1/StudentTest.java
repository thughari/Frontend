package oopsdemo1;

public class StudentTest {
	public static void main(String[] args) {
		// Create a Object of Student class
		var s1 = new Student();
		var s2 = new Student();
		//call methods using dot operator
		s1.input();
		float tot=s1.calculate();
		s1.display();
		System.out.println("total displayed from main is : "+tot);
		//invoke methods of student class using dot operator
        s2.input();
        float tot1=s2.calculate();
        s2.display();
        System.out.println("Total Displayed from main:"+tot1);
	}
	
}
