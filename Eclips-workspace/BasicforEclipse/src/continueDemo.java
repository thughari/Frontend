import java.util.Scanner;

public class continueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double number, sum = 0.0;
        Scanner input = new Scanner(System.in);
        while (true) {
        	System.out.print("Enter a number: ");
            number = input.nextDouble();
            if (number < 0.0) {
            	continue;
            	}
            sum+=number;
            System.out.println("Sum = " + sum);
        }
    }
}
