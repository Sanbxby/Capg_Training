package Linked_List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(20);
		list.add(67.0);
		list.add("Jerry");
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		list.remove(2);
		System.out.println(list);
		
	}

}
