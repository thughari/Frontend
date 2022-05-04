package miscellaneous;

//Demonstrate the use of Packages

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.oracle.Database;

public class SoftwareList {

	public static void main(String[] args) {
		Database d1= new Database();
		d1.printSoftware();
		System.out.println("--------------");
		
		OperatingSystem op=new OperatingSystem();
		op.listSoftware();

	}

}
