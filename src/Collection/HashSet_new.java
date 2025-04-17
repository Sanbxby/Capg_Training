package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSet_new {
	public static void main(String[] args) {

		/*
		 * HashSet h=new HashSet();
		 * 
		 * h.add(10); h.add("hi"); h.add(17.5); System.out.println(h)
		 */

		/*LinkedHashSet h = new LinkedHashSet();

		h.add(10);
		h.add("hi");
		h.add(17.5);
		
		System.out.println(h);*/
		
		
		TreeSet set=new TreeSet();//TreeSet needs to compare and sort
		set.add(10);
		set.add("hi");
		set.add(17.5);
		
		System.out.println(set);
		
	}
}
