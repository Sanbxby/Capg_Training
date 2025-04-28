package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialization {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis=new FileInputStream("C:\\\\Users\\\\User\\\\Desktop\\\\Git Project\\\\Capgemini\\\\new2\\\\DEMO\\\\employee");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee employee= (Employee) ois.readObject();
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
