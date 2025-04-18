package Collection;


public class Book<T> implements Comparable<Book> {
	private int id;
	private String title;
	private double price;
	
	Book(int id,String title,double price){
		this.id=id;
		this.title=title;
		this.price=price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//Comaparing based on id
    public int compareTo(Book b) {
    	return this.id-b.id;
    }
    
    @Override
    
    public String toString() {
    	return this.id+" " +this.title+" "+this.price;
    }
}
