package assessment1;
import java.util.Scanner;

public class FarenToCelsuius {

	public static void main(String[] hari) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		float f=sc.nextFloat();
		float c=((f-32)*((float)5/9));
		System.out.printf("Temperature in celsuius is: %.2f",c);
		sc.close();

	}

}
