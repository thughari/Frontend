import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        float a,r;
        final float PI=3.14f; // constant declaration
       
        System.out.println("Enter Radius of a Circle :");
        r=s.nextFloat();  // float input
       
        a=PI*r*r;  // calculate area of circle
       
        System.out.println("The Area of Circle is : "+a);
        System.out.format("%.1f", a);
        s.close();

	}

}
