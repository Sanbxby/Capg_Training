package SuperPower;

public class Child extends Parent {
	int grade;
	
	Child(String name,int grade){
		super(name);
		this.name=name;
		System.out.println("child constructor");
	}
}
