import java.util.Scanner;

public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.print("enter something to find vowels : ");
		String a=sc.nextLine();
		a=a.toLowerCase();
		sc.close();
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') {
				System.out.println(a.charAt(i));
				c++;
			}
		}
		System.out.println("total vowels are : "+c);
	}

}
