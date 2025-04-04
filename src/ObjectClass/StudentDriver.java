package ObjectClass;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s = new Student("Sanjona",66, 77.7);
		System.out.println(s);
		
		Student s1 = new Student("Sreejit Pondit",843, 48.0);
		System.out.println(s1);
		
		
		System.out.println(s.equals(s1));
		
		
		System.out.println(s.hashCode());
		
		
		System.out.println(s.hashCode()==s1.hashCode());
		
	}

}
