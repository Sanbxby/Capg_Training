package Abstraction;

public class Truck extends AbstractVehicle {
	public Truck(String name, int speed) {
		super(name,speed);
	}
	@Override
	public void start() {
		System.out.println(name + "truck is starting");
	}
	@Override
	public void stop() {
		System.out.println(name + "truck has  stopped");
	}
	@Override
	public void displayType() {
		System.out.println("This is a truck");
	}
	}



