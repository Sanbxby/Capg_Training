package Mock_Test;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		RideBookingSystem r = new RideBookingSystem();

		r.loadDriversFromFile();
		boolean running = true;
		while (running) {
			Scanner sc = new Scanner(System.in);
			System.out.println("\n---- Ride Booking System ----");
			System.out.println("1. Register a Customer");
			System.out.println("2. Register a Driver");
			System.out.println("3. Book a Ride");
			System.out.println("4. Show all Drivers");
			System.out.println("Choose an option");
			int n = sc.nextInt();
			sc.nextLine();

			switch (n) {
			case 1:
				System.out.println("Enter customer Id");
				String id = sc.nextLine();
				System.out.println("Enter Customer name");
				String name = sc.nextLine();
				Customer c = new Customer(id, name);
				r.customers.add(c);
				break;

			case 2:
				System.out.println("Enter Drivers's ID");
				String cid = sc.nextLine();
				System.out.println();
				System.out.println("Enter Driver name");
				String cname = sc.nextLine();
				Driver d = new Driver(cid, cname);
				r.drivers.add(d);
				break;

			case 3:
				System.out.println("Booking a ride");
				System.out.println("Enter customer Id");
				String custID = sc.nextLine();

				Optional<Customer> customerOpt = r.getCustomers().stream().filter(s -> s.id.equals(custID)).findFirst();
				if (customerOpt.isPresent()) {
					try {
						r.bookRide(customerOpt.get());
					} catch (Exception e) {
						e.getStackTrace();

					}
				}
				break;
			case 4:
				r.showAllDrivers();

			case 5:
				r.saveDriversToFile();
				r.saveRides();
                running=false;
				System.out.println("DATA SAVED");
				break;

			default:
				System.out.println("Invalid option");
			}
		}

	}
}
