import java.util.Scanner;

public class mulTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the numer for table");
		int a=sc.nextInt();
		sc.close();
		for(int i=1;i<=a;i++) {
			System.out.printf("%d x %d = %d\n",a,i,a*i);
		}

	}

}
