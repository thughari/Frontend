import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3,4,5,6},{3,2,5,4,6,8},{5,2,6,5,4,8}};
		int b[][]= {{1,2,3,4,5,6},{3,2,5,4,6,8},{5,2,6,5,4,8}};
		int res[][]= new int[3][6];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				res[i][j]=a[i][j]+b[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(Arrays.toString(a[i]));
		}
	}

}
