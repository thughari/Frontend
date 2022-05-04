package oopsdemo1;

public class ConstructorDemo {
	int id;
    String name;
    float salary;
    
    ConstructorDemo(){		//Implicit Constructor
    	System.out.println("I am implicit constructor");
    	id=101;
    	name="mike";
    	salary=50000.00f;
    }


	public ConstructorDemo(int id, String name, float salary) {		//parameterized constructor
		System.out.println("i am parameterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	void display()
    {
        System.out.println(this.id+ " "+this.name+" "+this.salary);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd1=new ConstructorDemo(); // invokes implicit Constructor
        ConstructorDemo cd2=new ConstructorDemo(102,"John",6000.00f); // invoke parameterized constructor
        ConstructorDemo cd3=new ConstructorDemo();
       
        cd1.display();
        cd2.display();
        cd3.display();
      
	}

}
