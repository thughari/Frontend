package oopsdemo3;

public class Trainee {

	
	private String name;
    private String address;
    private int number;
    
    
    public Trainee(String name, String address, int number) {
	//	super();
		this.name = name;
		this.address = address;
		this.number = number;
	}

    //abstract method declaration must be overidden in the derived class
	void show()
    {
        System.out.println("Display Marks for :" +this.name+ " "+this.address);
    }

	@Override
	public String toString() {
		return "Trainee [name=" + name + ", address=" + address + ", number=" + number + "]";
	}

	public double calculateMarks() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}