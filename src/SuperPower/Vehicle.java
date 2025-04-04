package SuperPower;

public class Vehicle {
	private String vehicleNo;
	private String brand;
	private String model;
	private double rentalPricepeday;
	private boolean is_available;
	
	
	public Vehicle(String vehicleNo, String brand, String model, double rentalPricepeday, boolean is_available) {

		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.model = model;
		this.rentalPricepeday = rentalPricepeday;
		this.is_available = is_available;
	}
	
	public void rentVehicle() {
		if(is_available) {
			System.out.println("It is available for rent");
		}
		else {
			System.out.println("It is not available for rent");
		}
	}
	
	public void displayDetails() {
		System.out.println(this.vehicleNo);
		System.out.println(this.brand);
		System.out.println(this.model);
		System.out.println(this.rentalPricepeday);
		System.out.println(this.is_available);
	}
	
	
	
	

}
