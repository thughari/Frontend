package oopsdemo1;


//program to demonstrate constructors
//generate constructors --> Right Click ---> Source -> generate Constructor


public class Trainee {

	private int id;
    private String name,tech;
    private double stipend;
    
	public Trainee() {
		// TODO Auto-generated constructor stub
		System.out.println("Implicit Constructor");
	       
        this.id=111;
        this.name="James Gosling";
        this.tech="Java";
        this.stipend=5000;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}
	
	void display()
    {
        System.out.println("********** Trainee Details ***************");
        System.out.println(this.id+" "+this.name+" "+this.tech+" "+this.stipend);
        System.out.println("------------------------------------------");
    }
    
}
