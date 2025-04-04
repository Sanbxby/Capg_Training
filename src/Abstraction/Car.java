package Abstraction;

public class Car extends AbstractVehicle {
	public Car(String name, int speed) {
		super(name,speed);
	}
	@Override
	public void start() {
		System.out.println(name + "car is starting");
	}
	@Override
	public void stop() {
		System.out.println(name + "car has  stopped");
	}
	@Override
	public void displayType() {
		System.out.println("This is a car");
	}
	}


