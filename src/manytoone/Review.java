package manytoone;

public class Review {
	
	private String message;
	private Product product;
	public Review(String message, Product product) {
		super();
		this.message = message;
		this.product = product;
	}
	public String getMessage() {
		return message;
	}
	
	public Product getProduct() {
		return product;
	}
	
	void display() {
		System.out.println(product.getProduct_name());
		System.out.println(getMessage());
	}

}
