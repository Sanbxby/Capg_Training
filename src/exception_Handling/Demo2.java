package exception_Handling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		int n=0;
		try(Scanner sc = new Scanner(System.in);)
		{
			n=sc.nextInt();
		}
		catch(InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println(n);
	}
}
