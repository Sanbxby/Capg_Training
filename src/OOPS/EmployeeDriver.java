package OOPS;

import OOPS.EmloyeeEncapsulation;
public class EmployeeDriver {
	public static void main(String[] args) {
		
		
		EmloyeeEncapsulation e=new EmloyeeEncapsulation();
		
		e.setName("Ram");
		System.out.println(e.getName());
		e.setPhone_no(987654321l);
		System.out.println(e.getPhone_no());
	}

}
