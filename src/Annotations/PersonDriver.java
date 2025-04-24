package Annotations;

import java.lang.reflect.Constructor;

public class PersonDriver {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		
		
		//To get the class object
		Class<Person> c=Person.class;//1st way ,
		
		Class<Person> c2=(Class<Person>) new Person("san",20).getClass();//2nd way
		
		Class<Person> c3=(Class<Person>) Class.forName("Annotations.Person");//3rd way
		
		
		// // Access specific constructors
		Constructor<Person> cons=c.getDeclaredConstructor();
		System.out.println(cons);
		
		Constructor<Person> cons2=c.getDeclaredConstructor(String.class, int.class);
		System.out.println(cons);
		
		System.out.println("========================================================");
		
		Constructor<?>[] all_cons=c.getDeclaredConstructors();
		for(Constructor<?> constructor : all_cons) {
			System.out.println(constructor);
		}
		
		
		System.out.println("============================================");
		Constructor<?>[] all_cons2=c.getDeclaredConstructors();
		for(Constructor<?> constructor : all_cons2) {
			System.out.println(constructor);
		}
	}
}
	
	


