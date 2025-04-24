package FileHandling;

import java.io.File;
import java.io.IOException;

public class DEMO1 {
	
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\User\\Desktop\\Git Project\\Capgemini\\new2\\DEMO\\FIRST.TXT");
		boolean b=f.createNewFile();
		System.out.println(b);
		}

}
