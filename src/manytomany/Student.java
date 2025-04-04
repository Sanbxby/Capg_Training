package manytomany;

public class Student {
	
 private String student_name;
	    private Subject[] subjects; 

	  
	    public Student(String student_name) {
	        this.student_name = student_name;
	        this.subjects = new Subject[0]; 
	    }

	    public String getStudent_name() {
	        return student_name;
	    }

	  
	    public void setStudent_name(String student_name) {
	        this.student_name = student_name;
	    }

	  
	    public Subject[] getSubjects() {
	        return subjects;
	    }

	    
	    public void enrollInSubject(Subject subject) {
	       
	        Subject[] newSubjects = new Subject[subjects.length + 1];
	        System.arraycopy(subjects, 0, newSubjects, 0, subjects.length);
	        newSubjects[subjects.length] = subject;
	        this.subjects = newSubjects;
	    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private String student_name;
	
	
	public Student(String student_name) {
		this.student_name=student_name;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setProduct_name(String product_name) {
		this.student_name = student_name;
	}*/

	
	



