package streamdemo;

import java.util.ArrayList;
import java.util.List;

/* 
 * forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.Iterable that can 
iterate over the elements in the collection. “forEach” is a default method defined in 
the Iterable interface. It is used by the Collection classes that extend the Iterable 
interface to iterate elements.

The “forEach” method takes the Functional Interface as a single parameter i.e. 
you can pass Lambda Expression as an argument.
 */

public class ForEachDemo {

	public static void main(String[] args) {
		List<String> languages=new ArrayList<String>(); // declare ArrayList
	       
        //add elements to List
        languages.add("Java");
        languages.add("Python");
        languages.add("C#");
        languages.add("Scala");
        languages.add("Ruby");
        languages.add("C++");
       
        System.out.println("********** Programming Languages *************");
        languages.forEach(i -> System.out.println(i));//lambda exp
       
        System.out.println("********** Print Elements using Method Reference*********");
        languages.forEach(System.out::println);
       
        //  i -- input parameter  --left hand side of lambda operator
        // System.out.println(i) -- right hand side is method body

	}

}
