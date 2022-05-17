package ai.jobiak.streams;

//if we want to process objects from the collection we use streams

import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		list.stream().forEach(System.out::println);
		
		System.out.println(" ");
		IntSummaryStatistics stat = list.stream().mapToInt((x)->x).summaryStatistics();
		System.out.println("Highest Number is: "+stat.getMax());
		System.out.println("Lowest Number is: "+stat.getMin());
		System.out.println("Sum of all Numbers is: "+stat.getSum());
		System.out.println("Sum of all Numbers is: "+stat.getAverage());

	}

}
