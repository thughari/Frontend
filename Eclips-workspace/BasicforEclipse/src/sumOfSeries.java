import java.util.Scanner;

public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter N value : ");
		a=sc.nextInt();
		sc.close();
		while(a>0) {
			sum+=a;
			a--;
		}
		System.out.println(sum);

	}

}
