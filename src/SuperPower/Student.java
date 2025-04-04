package SuperPower;

public class Student extends Person {
	private int studentid;

	Student(int studentid, int age, String name) {
		super(name, age);
		this.studentid = studentid;

	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void displayDetails() {
		System.out.println(this.getStudentid());

	}
}
