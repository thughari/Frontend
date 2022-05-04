package java8assignment;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Calculating Maximum, Minimum, Sum, and Average of List elements using stream
public class MaxMinSumAvg {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList<>();
		for(int i=5;i<=15;i++) {
			nums.add(i);
		}
		nums.add(30);
		int max=nums.stream().max(Comparator.naturalOrder()).get();
		int min=nums.stream().min(Comparator.naturalOrder()).get();
		int sum=nums.stream().mapToInt(i->i).sum();
		double avg=(double)sum/nums.stream().count();
		System.out.println("maximum value is : "+max);
		System.out.println("minimum value is : "+min);
		System.out.println("sum of "+nums.size()+" numbers is : "+sum);
		System.out.println("average of the "+nums.size()+" numbers is : "+avg);
		
	}

}
