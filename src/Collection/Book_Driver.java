package Collection;

import java.util.TreeSet;

public class Book_Driver {
	public static void main(String[] args) {
		TreeSet<Book> s=new TreeSet<Book>();
		Book s1=new Book(1,"Harry Potter",261.0);
		Book s2=new Book(2,"GOT",65.71);
		Book s3=new Book(2,"The Queens justice",65.71);
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		
		System.out.println(s);
	}

}
