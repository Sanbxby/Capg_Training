package Mock_Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RideBookingSystem {
	public List<Customer> customers = new ArrayList();
	public List<Driver> drivers = new ArrayList();
	public List<Ride> rides = new ArrayList();

	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}

	public void registerDriver(Driver driver) {
		drivers.add(driver);
	}

	public Ride bookRide(Customer customer) {
		Optional<Driver> availableDriver = drivers.stream().filter(Driver::isAvailable).findFirst();

		if (availableDriver.isPresent()) {
			Driver driver = availableDriver.get();
			driver.setAvailable(false);
			Ride ride = new Ride(customer, driver);
			rides.add(ride);
			return ride;
		} else {
			throw new InvalidRideException("No driver at the moment! ");
		}
	}

	public void saveRides() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\Mock_Test\\rides.txt"))) {
			for (Ride ride : rides) {
				writer.write(ride.rideDetails());
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadDriversFromFile() throws IOException {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\User\\Desktop\\Mock_Test\\drivers.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				if (data.length >= 2) {
					Driver driver = new Driver(data[0], data[1]);
					registerDriver(driver);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void saveDriversToFile() throws IOException {
		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter("C:\\Users\\User\\Desktop\\Mock_Test\\drivers.txt"))) {
			for(Driver driver : drivers) {
				writer.write(driver.id + ","+ driver.name);
				writer.newLine();
			}
			System.out.println("Drivers saved to drivers.txt");
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void showAllDrivers() {
		for(Driver driver : drivers) {
			driver.showProfile();
		}
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	

}
