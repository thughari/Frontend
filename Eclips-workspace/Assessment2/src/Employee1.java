import java.util.Scanner;

/*Write a program by creating an &#39;Employee1&#39; class having the following methods and print
the final salary.
1 - getInfo(); which takes the salary, number of hours of work per day of employee as
parameter
2 - AddSal(); which adds $10 to salary of the employee if it is less than $500.
3 - AddWork() which adds $5 to salary of employee if the number of hours of work per
day is more than 6 hours.*/
public class Employee1 {
	
	private int salary;
	private double hours;
	public void getInfo() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter salary of employee : ");
		salary=sc.nextInt();
		System.out.print("enter no of hours worked : ");
		hours=sc.nextDouble();
	}
	
	public void addSal() {
		if(salary<500) {
			salary+=10;
		}
	}
	public void addWork() {
		if(hours>6) {
			salary+=5;
		}
		System.out.println("no of hours worked : "+hours);
		System.out.println("salary of employee is : "+salary);
	}
}
