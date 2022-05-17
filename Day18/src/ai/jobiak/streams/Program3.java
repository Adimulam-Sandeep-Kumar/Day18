package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		list.stream().forEach(System.out::println);
		
		System.out.println(" ");
		List<Integer> squares = list.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("Squares of integer list: "+squares);

	}

}
