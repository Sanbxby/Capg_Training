package manytomany;

public class Driver {
	
	    public static void main(String[] args) {
	       
	        Student student1 = new Student("Sanjona");
	        Student student2 = new Student("Sreejit");
	        Student student3 = new Student("Gourav");

	       
	        Subject java = new Subject("Java");
	        Subject python = new Subject("Python");
	        Subject c = new Subject("C++");

	      
	        student1.enrollInSubject(java);
	        student1.enrollInSubject(python);

	        student2.enrollInSubject(java);
	        student2.enrollInSubject(c);

	        student3.enrollInSubject(python);
	        student3.enrollInSubject(c);

	      
	       java.addStudent(student1);
	       java.addStudent(student2);

	        python.addStudent(student1);
	        python.addStudent(student3);

	        c.addStudent(student2);
	        c.addStudent(student3);

	        
	        System.out.println(student1.getStudent_name() + " is enrolled in:");
	        for (Subject subject : student1.getSubjects()) {
	            System.out.println("- " + subject.getSubject_name());
	        }

	        System.out.println(student2.getStudent_name() + " is enrolled in:");
	        for (Subject subject : student2.getSubjects()) {
	            System.out.println("- " + subject.getSubject_name());
	        }

	        System.out.println(student3.getStudent_name() + " is enrolled in:");
	        for (Subject subject : student3.getSubjects()) {
	            System.out.println("- " + subject.getSubject_name());
	        }

	        
	        System.out.println(java.getSubject_name() + " has the following students:");
	        for (Student student : java.getStudents()) {
	            System.out.println("- " + student.getStudent_name());
	        }

	        System.out.println(python.getSubject_name() + " has the following students:");
	        for (Student student : python.getStudents()) {
	            System.out.println("- " + student.getStudent_name());
	        }

	        System.out.println(c.getSubject_name() + " has the following students:");
	        for (Student student : c.getStudents()) {
	            System.out.println("- " + student.getStudent_name());
	        }
	    }
	}



