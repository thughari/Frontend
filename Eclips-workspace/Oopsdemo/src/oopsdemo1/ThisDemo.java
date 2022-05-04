package oopsdemo1;

public class ThisDemo {

	int age;
	   
    //instance method
    // this keyword is used in instance method to access Object
    void init(int age)
    {
    	this.age=age;// this keyword refers to the current object which invokes the method
    }
    
    public static void main(String[] args) {
		var demo=new ThisDemo();
		demo.init(10);
		System.out.println(demo.age);
	}
}
