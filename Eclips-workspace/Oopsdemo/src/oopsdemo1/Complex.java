package oopsdemo1;

public class Complex {

	double real;
	double imaginary;
	
	public Complex(double real,double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	void add(Complex obj) // method which accepts object as an argument
    {
        //c1.real+=c2.real
        this.real+=obj.real;
        //c1.imaginary+=c2.realimaginary
        this.imaginary+=obj.imaginary;
    }
	
	void display()
    {
       
        System.out.println("r"+this.real+" + i"+this.imaginary);
    }
}
