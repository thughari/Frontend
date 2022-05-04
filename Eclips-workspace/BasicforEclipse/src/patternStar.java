
public class patternStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=2;i<=n-1;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(n-i)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}