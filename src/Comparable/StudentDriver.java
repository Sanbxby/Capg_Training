package Comparable;

import java.util.Arrays;

public class StudentDriver {
	public static void main(String[] args) {
		
	
	Student[] students= {
			new Student(1,"Sanj",87.34),
			new Student(3,"Raj",21.34),
			new Student(5,"Ram",65.34),
			new Student(7,"Niru",43.34),
			
	};
	
	
	Arrays.sort(students);
	
	
	for(Student student : students) {
		System.out.println(student);
	}
}
}
