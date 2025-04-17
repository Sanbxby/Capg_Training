package Collection;
import java.util.Objects;

public class student {
	private int id;
	private String name;
	private double percentage;
	
	
	public student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	@Override
	public  String toString() {
		return this.id+" "+this.name+" "+this.percentage;
	}
	
	public boolean equals(Object obj) {
		student s=(student)obj;
		return this.name.equals(s.name) && this.id==s.id && this.percentage==s.percentage;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name,this.id,this.percentage);
	}

}
