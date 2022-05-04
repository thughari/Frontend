package java8assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of integers, sort all the values present in it using Stream functions?
public class SortNums {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		for(int i=1;i<=10;i++) {
			nums.add((int)(Math.random()*10));
		}
		
		System.out.println("Before sorting "+nums);
		List<Integer> res= nums.stream().sorted().collect(Collectors.toList());
		System.out.println("After Sorting "+res);

	}

}
