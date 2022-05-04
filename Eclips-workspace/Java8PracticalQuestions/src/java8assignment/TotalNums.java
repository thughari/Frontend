package java8assignment;

import java.util.ArrayList;
import java.util.List;

// Given a list of integers, find the total number of elements present in the list using Stream functions?
public class TotalNums {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		for(int i=1;i<=25;i++) {
			nums.add(i);
		}
		long sum=nums.stream().count();
		System.out.println("the total numbers are "+sum);

	}

}
