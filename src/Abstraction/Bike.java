package Abstraction;

public class Bike extends AbstractVehicle {
	public Bike(String name, int speed) {
		super(name,speed);
	}
	@Override
	public void start() {
		System.out.println(name + "bike is starting");
	}
	@Override
	public void stop() {
		System.out.println(name + "bike has  stopped");
	}
	@Override
	public void displayType() {
		System.out.println("This is a bike");
	}
	}


