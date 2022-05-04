import java.util.Scanner;

/*1. Write a program to create a room class, the attributes of this class is
roomno, roomtype, roomarea and ACmachine. In this class the member
functions are setdata and displaydata.*/
public class Class {
	
	private int roomNo;
	private String roomType;
	private double roomArea;
	private String isACMachine;
	
	public void setData() {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter room no: ");
		roomNo=sc.nextInt();
		System.out.print("enter room type: ");
		roomType=sc.next();
		System.out.print("enter room area: ");
		roomArea=sc.nextDouble();
		System.out.println("is this AC machine: ");
		isACMachine=sc.next();
	}
	
	
	public void display() {
		System.out.println("room no: "+roomNo);
		System.out.println("room type: "+roomType);
		System.out.println("room area: "+roomArea);
		System.out.println("is this AC machine? "+isACMachine);
	}

}
