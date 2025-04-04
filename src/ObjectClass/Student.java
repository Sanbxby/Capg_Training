package ObjectClass;

import java.util.Objects;

public class Student {
	private String name;
	private int id;
	private double percentage;
	
	Student(String name, int id,double percentage){
		this.name=name;
		this.id=id;
		this.percentage=percentage;
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString( ) {
		return this.getName()+" "+this.getId()+" "+this.getPercentage();
		
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student) obj;
		return this.name.equals(s.name)&& this.id==s.id && this.percentage ==s.percentage;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.id, this.percentage);
	}
	

}
