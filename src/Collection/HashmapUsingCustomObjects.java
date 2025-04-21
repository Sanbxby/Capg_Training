package Collection;

import java.util.HashMap;

public class HashmapUsingCustomObjects {
	public static void main(String[] args) {
		        HashMap<Person, String> map = new HashMap<>();

		        Person p1 = new Person("Alice", 30);
		        Person p2 = new Person("Bob", 25);
		        Person p3 = new Person("Alice", 30);  // same as p1 in value

		        map.put(p1, "Engineer");
		        map.put(p2, "Designer");

		        System.out.println(map.get(p3)); // prints "Engineer"
		    }
		

}
