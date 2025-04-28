package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serialization {
	public static void main(String[] args) throws IOException {
		FileOutputStream f=new 	FileOutputStream("C:\\Users\\User\\Desktop\\Git Project\\Capgemini\\new2\\DEMO\\employee");
		ObjectOutputStream o=new ObjectOutputStream(f);
		
		Employee employee=new Employee(107,"Sanj",200000.00);
		o.writeObject(employee);
		System.out.println("employee is saved");
	}
	

}
