package oopsdemo1;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var emp1=new Employee();
		var emp2=new Employee();
		var emp3=new Employee();
		
		emp1.inputEmployeeDetails();
		emp1.calculateNetSalary();
		emp1.displayEmployeeDetails();
		
		emp2.inputEmployeeDetails();
		emp2.calculateNetSalary();
		emp2.displayEmployeeDetails();
		
		emp3.inputEmployeeDetails();
		emp3.calculateNetSalary();
		emp3.displayEmployeeDetails();

	}

}
