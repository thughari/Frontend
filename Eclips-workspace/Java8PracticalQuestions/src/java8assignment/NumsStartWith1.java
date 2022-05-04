package java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//Given a list of integers, find out all the numbers starting with 1  using Stream functions?
public class NumsStartWith1 {

	public static void main(String[] args) {

		List<Integer> nums=new ArrayList<>();
		for(int i=1;i<=25;i++) {
			nums.add(i);
		}
		
		String t="";
		Stream<Integer> n=nums.stream().filter(i->(t+i).charAt(0)=='1');
		System.out.print("numbers starting with 1 are : ");
		n.forEach(i->System.out.print(i+" "));

	}

}
