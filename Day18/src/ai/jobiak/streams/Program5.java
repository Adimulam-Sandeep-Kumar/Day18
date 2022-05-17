package ai.jobiak.streams;

//if we want to process objects from the collection we use streams
//build up of predicate,functional and consumer interface

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program5 {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("A");list.add("C");list.add("D");list.add("B");
		
		list.stream().forEach(System.out::println);	
		
		//ascending order(in 2 ways)
		System.out.println(" ");
		List<String> sort =list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println("Sorted list: "+sort);
		
		System.out.println(" ");
		List<String> sort1 = list.stream().sorted((o1,o2)->o1.compareTo(o2)).collect(Collectors.toList());
		System.out.println("Sorting using compareTo: "+sort1);
		
		//descending order(in 2 ways)
		System.out.println(" ");
		List<String> sort2 =list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending Sorted list: "+sort2);
		
		System.out.println(" ");
		List<String> sort3 = list.stream().sorted((o1,o2)->o2.compareTo(o1)).collect(Collectors.toList());
		System.out.println("Descending Sort using compareTo: "+sort3);
				
	}

}
