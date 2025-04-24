package Annotations;

public class Person {
	private String name;
	private int age;
	
	private Person()
	{
		
		System.out.println("no arg cons");
		this.name=name;
		this.age=age;
	}
	
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getDetails() {
		return name+"\t"+age;
	}
	private void test(String task) {
		System.out.println("Doing the task :"+task);
	}
}
