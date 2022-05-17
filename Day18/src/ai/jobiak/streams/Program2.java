package ai.jobiak.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		
		list.stream().forEach(System.out::println);
		
		System.out.println(" ");
		List<Integer> even = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("The Even Numbers are: "+even);
		
		System.out.println(" ");
		List<Integer> odd = list.stream().filter(i->!(i%2==0)).collect(Collectors.toList());
		System.out.println("The Odd Numbers are: "+odd);
		
		/*System.out.println(" ");
		List<Integer> prime = list.stream().filter(i->i%2==1&&i%2==0).collect(Collectors.toList());
		System.out.println("The Odd Numbers are: "+prime);
		*/

	}

}
