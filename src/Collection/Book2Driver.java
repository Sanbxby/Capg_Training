package Collection;

public class Book2Driver {
	
	public static void main(String[] args) {
		
		SortByPrice p=new SortByPrice();
		TreeSet<Book> set=new TreeSet<>(p);
	}

}
