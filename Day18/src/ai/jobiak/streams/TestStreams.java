package ai.jobiak.streams;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;
public class TestStreams {

	public static void main(String[] args) {
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Hai");list.add("Welcome To");list.add("Java->Full->Stack");
		
	/*	Iterator<String>iter = list.iterator();
		while(iter.hasNext()) {
			
			String element = iter.next();
			System.out.println(element);
		
		}*/  //Java8 Streams-all about collections(elements of collections with streams)
		
		list.stream().forEach(System.out::println);		//method reference
		
		// Stream is build up of 1) filter(predicate function) 2) map function(Function Interface)  3) Terminal Operation(Consumer Interface)
		
		System.out.println(" ");
		Consumer<String>consumer = (String str)->{System.out.println(str);};
		list.stream().forEach(consumer);
		
		System.out.println(" ");
		long count = list.stream().count();
		System.out.println(count);
				
		System.out.println(" ");
		List<String>letterJList = list.stream().filter(e->(e.charAt(0)=='J')).collect(Collectors.toList());
		System.out.println(letterJList);
		
		System.out.println(" ----------------- ");
		Predicate<String>testJ=(String str)->{return(str.charAt(0)=='J');};
		letterJList = list.stream().filter(testJ).collect(Collectors.toList());
		System.out.println(letterJList);
		
		
		System.out.println(" ");
		List<String>length = list.stream().filter(e->(e.length()>4)).collect(Collectors.toList());
		System.out.println("Length with greater than 4: " +length);
		
		System.out.println(" ");
		list.stream().map(e->e.toUpperCase()).forEach(consumer);
	
		System.out.println(" ");
		list.stream().map(e->e.toLowerCase()).forEach(consumer);
	
		System.out.println(" ");
		list.stream().map(e->e.substring(0,3)).forEach(consumer);
		
		//map going to transfer the data like uppercase concat etc
		
		/*System.out.println(" ");
		Function<String,String>upperCaseFunction = (e)->{return e.toUpperCase();};
		list.stream().map(upperCaseFunction).forEach(consumer);;
		*/
		
	}
	
}
