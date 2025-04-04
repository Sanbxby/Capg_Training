package Comparable;

public class Student implements Comparable {
	int rollno;
	String name;
	double percentage;
	
	public Student(int rollno, String name, double percentage) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString(){
		return rollno+"\t"+name+"\t"+percentage;
	}
	@Override
	public int compareTo(Object o){
		int result=0;
		
			Student s=(Student) o;  //downcasting
			
			/*if(this.rollno > s.rollno ) {
				result=1;
			}
			else if (this.rollno < s.rollno ) {	
					result=-1;
			}
			else {
				result=0;
			}
		
		return result;*/
			return Double.compare(this.percentage, s.percentage);
			
	}

}
