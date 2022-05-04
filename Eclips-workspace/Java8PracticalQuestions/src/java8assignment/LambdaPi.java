package java8assignment;
//write a Java program that returns the value of Pi using the lambda expression.
public class LambdaPi {

	public static void main(String[] args) {
		final Inf Pi=()->(22.0/7);
		System.out.printf("value of Pi is : %.2f",Pi.find());

	}

}

@FunctionalInterface
interface Inf{
	double find();
}
