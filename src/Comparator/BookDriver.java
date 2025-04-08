package Comparator;

import java.util.Arrays;

public class BookDriver {
	public static void main(String[] args) {
		
		Book[] book= {
				new Book(2,"Ikigai",432.2),
				new Book(4,"Murder",212.2),
				new Book(8,"Atonement",532.2),
				new Book(19,"Pride and Prejudice",732.2),
				
		};
		sortById sortId=new sortById();
		Arrays.sort(book,sortId);
		
		for(Book b:book) {
			System.out.println(b);
		}
	}

}
