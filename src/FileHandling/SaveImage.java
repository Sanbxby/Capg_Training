package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {
	
	public static void main(String[] args) throws IOException {
		String image="C:\\Users\\User\\Downloads\\screaming-cat.jpg";
		
		Path path=Paths.get(image);
		byte[] byte_array=Files.readAllBytes(path);
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\User\\Desktop\\Git Project\\Capgemini\\new2\\DEMO\\database.jpg");
		fos.write(byte_array);
		
		System.out.println("Image saved");
		}

}
