package streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/* 
 * The Collectors class in Java 8 provides methods for grouping and partitioning data stored 
 * in collections. 



Grouping permits you to organize data that shares a common field value, 
e.g. department. 



Partitioning allows you to divide the data into two categories, or partitions. 
One partition satisfies the partitioning criteria whereas the other partition does not. 
For example, we might separate sales data into a partition that met or exceeded a sales 
goal and a partition that did not. 
 */



//Java Program to Group & Partition Collectors


public class StreamExample6 {
	
	private static List<MusicalInstruments> musicalInstruments=new ArrayList<>();
    static {
        musicalInstruments.add(new MusicalInstruments("Trumpet","brass",299.99));
        musicalInstruments.add(new MusicalInstruments("Tuba","brass",1149.0));
        musicalInstruments.add(new MusicalInstruments("Timpani","percussion",2339.0));
        musicalInstruments.add(new MusicalInstruments("Snare drum","percussion",325.00));
        musicalInstruments.add(new MusicalInstruments("Piano","keyboard",5179.99));
        musicalInstruments.add(new MusicalInstruments("Trombone","brass",775.79));
    }

	public static void main(String[] args) {

	

		System.out.println("**** Musical Instruments in Collection ******");

		musicalInstruments.stream().forEach(i->System.out.println(i.getName()+" "+
				i.getType()+" "+i.getPrice()));

		System.out.println("**** Group Instruments by Type: *******");
		Map<String,List<MusicalInstruments>> typeMap= musicalInstruments.stream()
				.collect(Collectors.groupingBy(MusicalInstruments::getType));

		typeMap.forEach((key,value) -> {
			System.out.println(key);
			value.forEach(i->System.out.println(i.getName()+" "+
					i.getType()+" "+i.getPrice()));
		});



		System.out.println("**** Partition Instruments by Price: *******");
		Map<Boolean,List<MusicalInstruments>> priceMap= musicalInstruments.stream()
				.collect(Collectors.partitioningBy(mi ->mi.getPrice() > 500.0));

		priceMap.forEach((key,value)-> { 
			System.out.println((key ? "Expensive":"Affordable"));
			value.forEach(i->System.out.println(i.getName()+" "+
					i.getType()+" "+i.getPrice())); 
		});
		
		// declare a map of customers
        Map<Integer,String> customer=new HashMap<Integer,String>();
       
        //add elements into map
        customer.put(101,"Alex");
        customer.put(102,"Mike");
        customer.put(103,"Mary");
        customer.put(104,"Navin");
        customer.put(105,"Jack");
       
        System.out.println("*********** Customer Account No. & Name : *************");
        customer.forEach((k,v) -> System.out.println("Key = "+ k +" ---> Value ="+v));
       
         ArrayList<Integer> arrL = new ArrayList<Integer>();
            arrL.add(100);
            arrL.add(24);
            arrL.add(99);
            arrL.add(41);
           
            Collections.sort(arrL);
            // use lambda expressions to print elements of arrayList
            System.out.println("********** ArrayList Contents *************");
            arrL.forEach(i -> System.out.println(i));
           
            //use lambda expressions to print even nos in arraylist
            System.out.println("******* Even Numbers in ArrayList ***********");
            arrL.forEach(n -> { if(n % 2==0) System.out.println(n); });
	}

}