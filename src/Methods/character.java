package Methods;

public class character {
	public static void method(char ch) {
		System.out.println(ch+" "+(int)ch);
	}
	public static void newName(String firstName, String lastName) {
		System.out.println(firstName+" "+lastName);
	}




	public static void main(String[]args) {
		char ch1='a';
		char ch2='r';
		method(ch1);
		method(ch2);


		String s1="Gourav", s2="handle";
		newName(s1,s2);
	}

}
