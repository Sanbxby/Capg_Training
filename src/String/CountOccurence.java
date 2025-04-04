package String;

import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		System.out.println("Enter the string");
		str=sc.nextLine();
		 int count=0;
		 System.out.println("Enter the character");
		 char ch=sc.next().charAt(0);
		 for(int i=0;i<str.length();i++) {
			 if(str.charAt(i)==ch) {
				 count+=1;
			 }
		 }
		 System.out.println(count);
		
		
	}

}
