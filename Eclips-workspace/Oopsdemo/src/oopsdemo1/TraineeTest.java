package oopsdemo1;

public class TraineeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var t1=new Trainee(); // invokes implicit constructor
        t1.display();
       
        //invokes parameterized Constructor
        var t2=new Trainee(222,"Rod Jhonson","Spring",7000);
        t2.display();
        
        var t3=new Trainee(333, "Some One", "Hibernate", 8000);
        t3.display();
	}

}
