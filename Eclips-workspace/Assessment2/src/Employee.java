import java.util.Scanner;

/*Write a program that would print the information (name, year of joining, salary, address)
of three employees by creating a class named Employee& The output should be as follows:

Name Year of joining Address
Robert   1994   64C- WallsStreet
Sam    2000    68D- WallsStreet
John   1999   26B- WallsStreet*/

public class Employee {

	private String name;
	private int yearOfJoining;
	private int salary;
	private String address;
	
	public void setEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter employee name : ");
		name=sc.next();
		System.out.print("enter employee year of joining : ");
		yearOfJoining=sc.nextInt();
		System.out.print("enter salary of the employee : ");
		salary=sc.nextInt();
		sc.nextLine();
		System.out.print("enter address of the employee : ");
		address=sc.nextLine();
	}
	public void showData() {
		System.out.print("Employee_name : " + name + "\nyearOfJoining : " + yearOfJoining +
				"\nsalary : " + salary + "\naddress : "+ address );
	}
}
