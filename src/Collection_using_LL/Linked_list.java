package Collection_using_LL;

import java.util.Collections;
import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		
	LinkedList<Integer> list=new LinkedList<>();
	
	list.add(20);
	list.add(30);
	list.add(60);
	list.add(90);
	
	
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.contains(20));
    System.out.println(list.contains(90));
    System.out.println(list.remove(0));
    list.addFirst(13);
    System.out.println(list);
    list.addLast(86);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
	}
}
