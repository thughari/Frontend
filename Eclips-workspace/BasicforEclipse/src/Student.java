import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
        System.out.println("************ Enter Student Details ***********");
        System.out.println("Enter Student Roll No     : ");
        int roll=scan.nextInt();
        System.out.println("Enter Student Name        : ");
        String name=scan.next();
        System.out.println("Enter Marks of 5 Subjects :");
        float m1=scan.nextFloat();
        float m2=scan.nextFloat();
        float m3=scan.nextFloat();
        float m4=scan.nextFloat();
        float m5=scan.nextFloat();
        
        float total=(m1+m2+m3+m4+m5);
        float agg=(10 *total)/500;
       
        System.out.println("********** Student Result ********");
        System.out.println("Roll Number  : "+roll);
        System.out.println("Student Name : "+name);
        System.out.println("Total Marks  : "+total);
        System.out.println("Aggregate    : "+agg);
        scan.close();
	}

}
