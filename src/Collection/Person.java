package Collection;

public class Person {
	    String name;
	    int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Override equals() and hashCode()
	    @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (!(o instanceof Person)) return false;

	        Person person = (Person) o;
	        return age == person.age &&
	               name.equals(person.name);
	    }

	    @Override
	    public int hashCode() {
	        return name.hashCode() * 31 + age;
	    }
	}


 
