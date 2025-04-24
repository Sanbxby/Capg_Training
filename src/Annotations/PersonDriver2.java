package Annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonDriver2 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  {
		Class<Person> c=Person.class;
		
		Constructor<Person> cons=c.getDeclaredConstructor();
		cons.setAccessible(true);
		Person p=cons.newInstance();
		System.out.println(p);
		

}
}
