package String;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Str="";
		System.out.println("Enter the string");
		String Str1=sc.nextLine();
		for(int i=Str1.length()-1;i>=0;i--) {
			Str+=Str1.charAt(i);
			
			
			
		}
		if(Str.equals(Str1)) {
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not");
		}
		// TODO Auto-generated method stub

	}

}
