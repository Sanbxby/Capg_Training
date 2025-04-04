package manytomany;

public class Subject {
	
	    
	    private String subject_name;
	    private Student[] students; //

	  
	    public Subject(String subject_name) {
	        this.subject_name = subject_name;
	        this.students = new Student[0];
	    }

	    
	    public String getSubject_name() {
	        return subject_name;
	    }

	 
	    public void setSubject_name(String subject_name) {
	        this.subject_name = subject_name;
	    }

	    
	    public Student[] getStudents() {
	        return students;
	    }

	    
	    public void addStudent(Student student) {
	       
	        Student[] newStudents = new Student[students.length + 1];
	        System.arraycopy(students, 0, newStudents, 0, students.length);
	        newStudents[students.length] = student;
	        this.students = newStudents;
	    }
	}



