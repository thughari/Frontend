package java8assignment;


/*Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return true if a number is odd or false if it is even.
PerformOperation isPrime(): The lambda expression must return true if a number is prime or false if it is composite.
PerformOperation isPalindrome(): The lambda expression must return true  if a number is a palindrome or false if it is not.*/
public class LambdaFunc {

	public static void main(String[] args) {
		int num=101;
	
		Func isOdd=(n)->n%2==1;
		
		Func isPall=(n)->(new StringBuilder(Integer.toString(n))).toString().equals(new StringBuilder(Integer.toString(n)).reverse().toString());
		
		Func isPrime=(n)->{int f=0;
			for(int i=2;i<=n/2;i++) if(n%i==0) {f=1;break;}
			if(f==0) return true;
			else return false;};

		
		System.out.println(num+" is Prime? :"+isPrime.find(num));
		System.out.println(num+" is palindrom? : "+isPall.find(num));
		System.out.println(num+" is Odd? : "+isOdd.find(num));

	}

}
@FunctionalInterface
interface Func{
	boolean find(int n);
}
