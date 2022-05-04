package java8assignment;
/* Given a list of integers, find out all the even numbers exist in the  list using Stream functions?*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EvenNums {

	public static void main(String[] args) {
		
		List<Integer> nums=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			nums.add(i);
		}
		
		Stream<Integer> n=nums.stream().filter(i->i%2==0);
		//Stream<Integer> evenNums=n.filter(i-> i%2==0);
		System.out.print("even numbers are : ");
		n.forEach(i->System.out.print(i+" "));
	}

}
