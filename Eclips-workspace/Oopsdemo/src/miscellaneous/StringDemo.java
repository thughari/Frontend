package miscellaneous;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Thug Hari";
		String s2="Thug Hari";
		String s3=new String("Hello World");
		System.out.println(s1==s2);
		
		System.out.println("'Hello world' length is : "+s3.length());
		
		System.out.println(s3.replace("o", "e"));
		
		

	}

}
