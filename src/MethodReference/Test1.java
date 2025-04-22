package MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<Integer> list =Arrays.asList(1,6,3,5,4,2);
		//list.forEach(s -> System.out.println(s));
		
		Collections.sort(list); // without pongta maring sort
		//Collections.sort(list, Integer :: compareTo);//pongta maring
		list.sort(null);//sort but not valid
		list.forEach(System.out::println);
		list.forEach(System.out::print);
	}

}
