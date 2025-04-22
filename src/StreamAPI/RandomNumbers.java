package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class RandomNumbers {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,5,7,9,2);
		/*List<Integer> res=new ArrayList<Integer>();
		
		for(Integer i:list) {
			if(i%2==0)
				res.add(i);
		}
		System.out.println(res);*/
		
		
		//Stream API
		
		//printing even numbers from the array
		
		List<Integer> res = list.stream().filter(i -> i%2 == 0).toList();
		System.out.println(res);
		  
		
		//Doubling the elements of list
		List<Integer> res1 = list.stream().map(i -> i * 2).toList();
		System.out.println(res1);
		
		//to skip something from the list
		List<Integer> res2=list.stream().skip(2).toList();
		System.out.println(res2);
		
		
		//prints the first and ignores rest
		List<Integer> res3=list.stream().limit(2).toList();
		System.out.println(res3);
		
		
		//sort the stream
	    List<Integer> res4=list.stream().sorted().toList();
	    System.out.println(res4);
	    
	    //reverses the sorted list
	    List<Integer> res5=list.stream().sorted(Comparator.reverseOrder()).toList();
	    System.out.println(res5);
	    
	    //duplicates are removed
	    List<Integer> res6=list.stream().sorted(Comparator.reverseOrder()).distinct().toList();
	    System.out.println(res6);
	    
	    //filters based on condition given
	    List<Integer> res7=list.stream().filter(i -> i>3 ).toList();
	    System.out.println(res7);
	  
	    //the one which starts with 'a'
	    List<String> list2=Arrays.asList("Apple","banana","cherry","city","arm");
	    List<String> list2res=list2.stream().filter(s -> s.charAt(0) == 'a').toList();
	    System.out.println(list2res);
	    
	    //substracts (-1) from each element 
	    List<Integer> res8=list.stream().map(m -> m-1).toList();
	    System.out.println(res8);
	    
	    //concatenation 
	    List<String> list2res2=list2.stream().map(s -> s.concat("hehe")).toList();
	    System.out.println(list2res2);
	    
	    //Making the string capital 
	    List<String> list2res3=list2.stream().map(s -> s.toUpperCase()).toList();
	    System.out.println(list2res3);
	    
	    //it is a class which encloses the data
	    Optional<Integer> ress2=list.stream().min(Integer :: compareTo);
	    System.out.println(ress2.get());
	    //helps to get the max no
	    Optional<Integer> ress3=list.stream().max(Integer :: compareTo);
	    System.out.println(ress3.get());
	    
	    int maxNum=list.stream().max(Integer ::compare).get();
	    System.out.println(maxNum);
	    
	    //Retrieves the first ele from the list
	    int first=list.stream().findFirst().get();
	    System.out.println(first);

	}
}
