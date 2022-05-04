package oopsdemo3;

public class AbstractDemo {

	public static void main(String[] args) {

		Trainee t1=new Marks("Jhon","Nwe york",1001,35);//up casting
		
		t1.show();		//invoke abstract  base class method
		double marks=t1.calculateMarks();	// invoke sub class method
		System.out.println(t1 +" "+marks);
	}

}
