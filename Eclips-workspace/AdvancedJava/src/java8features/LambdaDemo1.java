package java8features;

public class LambdaDemo1 {

	public static void main(String[] args) {
		MyFI msg=()-> {return("Hello world");};	//lambda expression
		System.out.println(msg.sayHello());

	}

}
@FunctionalInterface
interface MyFI{
	public String sayHello(); // by default abstract
	//public String sayHello1();
	
}
