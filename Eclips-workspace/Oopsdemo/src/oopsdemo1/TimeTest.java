package oopsdemo1;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t1=new Time(12,60,60); // invokes constructor & initialize the values
        Time t2=new Time(10,58,60);
       
        t1.add(t2); // invoke add method & pass t2 Object as argument
       
        System.out.println("The Addition of 2 Times is : ");
        t1.display();
	}

}
