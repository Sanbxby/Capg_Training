package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class employee_Utility {
	
	static ArrayList<employee> list=new ArrayList<employee>();
	
	public static void addemployee(employee emp) {
		list.add(emp);
		System.out.println("Employee added successfully");
	}
    
	public static void print() {
		/*for(employee emp:list) {
			System.out.println(emp);
		}*/
		
		//Using iterator
		/*
		Iterator<employee>it=list.iterator();
		while(it.hasNext()) {
			employee emp=it.next();
		System.out.println(it.next());*/
		
		//using list iterator
		ListIterator<employee> it=list.listIterator(list.size());
		while(it.hasPrevious()) {
			employee emp=it.previous();
			System.out.println(emp);
	}
	}
	
	public static boolean searchObject(employee e) {
		if(list.contains(e)) {
			return true;
		}
		return false;
		}
     
	public static boolean searchbyid(int idd) {
		for(employee emp:list) {
			if(emp.getId()==idd) {
				return true;
			}
			
		}
		return false;
	}

	
	public static void removeObject(employee emp) {
		list.remove(emp);
		System.out.println("Deleted");
	}
   
	
	public static void removebyid(int id) {
		employee e= null;
		for(employee employee : list) {
			if(employee.getId()==id) {
				e=employee;
			}
		
		}
		list.remove(e);
	}
	
	public static void updatebyId(int id,Scanner sc) {
		employee old=null;
		for(employee e:list) {
			if(e.getId()==id) {
				old=e;
			}
		}
		System.out.println("Enter name and salary to update");
		old.setName(sc.next());
		old.setSalary(sc.nextDouble());
		System.out.println("updated employee details");
		
	}
	
	public static void sort() {
		Collections.sort(list);
		System.out.println("Successfully Sorted");
	}

}








