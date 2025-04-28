package Mock_Test;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	
	public Ride(Customer customer, Driver driver) {
		super();
		this.customer = customer;
		this.driver = driver;
		this.status = "Booked";
	}
	

	public void completeRide(String status) {
		status="Completed";
		driver.setAvailable(true);
	}
	
	public String getStatus() {
		return status;
	}
    public String rideDetails() {
    	return "Customer name: " + customer.getName()+ "Driver name: " + driver.getName()+"Current Status: "+this.status;
    	
    }
}
