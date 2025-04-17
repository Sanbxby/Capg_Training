package Collection;
import java.util.Set;
import java.util.HashSet;



public class student_Driver {
	public static void main(String[] args) {
		
		HashSet<student> h=new HashSet<student>();
		student s1=new student(1,"Sanjona",261.0);
		student s2=new student(2,"Gourav",65.71);
		student s3=new student(2,"Gourav",65.71);
		
		h.add(s1);
		h.add(s2);
		h.add(s3);
		
		System.out.println(h);
	
	}

}
