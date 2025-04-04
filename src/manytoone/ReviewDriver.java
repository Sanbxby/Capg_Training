package manytoone;

public class ReviewDriver {
	public static void main(String[] args) {
		Product product = new Product("Phone");
		Review r1= new Review("Average",product);
		Review r2= new Review("Good",product);
		
		
		r1.display();
		r2.display();
	}

}
