package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {

	public static void main(String[] args) {

		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Hai");list.add("Welcome To");list.add("Java->Full->Stack");
		
		list.stream().forEach(System.out::println);	
		
		System.out.println(" ");
		List<String>display = list.stream().filter(e->(e.startsWith("H"))).collect(Collectors.toList());
		System.out.println("String Starts with letter H is: "+display);
		
		System.out.println(" ");
		List<String>display1 = list.stream().filter(e->(e.endsWith("o"))).collect(Collectors.toList());
		System.out.println("String Ends with letter o is: "+display1);
				
	}

}
