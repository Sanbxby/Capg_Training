package Abstraction;

abstract class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	
	
	public AbstractVehicle(String name,int speed) {
		this.name=name;
		this.speed=speed;
	}
	public void displayDetails() {
		System.out.println("Vehiche name"+name);
		System.out.println("Current Speed"+speed);
	}
	@Override
	public void  accelerate(int increment) {
		speed+=increment;
		System.out.println( name + "accelerated by" + increment + "km/hr. New Speed:" + speed);
	}
	@Override
	public void  brake(int decrement) {
       speed = Math.max(0, speed-decrement);
		System.out.println( name +  "slowed down by"   + decrement + "km/hr. New Speed:" + speed);
		
	}
	@Override
	public int getCurrentSpeed() {
		return speed;
	}
	

}
