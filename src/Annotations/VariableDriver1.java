package Annotations;

import java.lang.reflect.Field;

public class VariableDriver1 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c=Person.class;
		
		
		Field[] all_varc =c.getDeclaredFields();
		for(Field field:all_varc) {
			System.out.println(field);
			
			
			Field f=c.getDeclaredField("age");
			System.out.println(f);
		}
	}

}
