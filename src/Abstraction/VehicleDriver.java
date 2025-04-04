package Abstraction;

public class VehicleDriver {
	public static void main(String[] args) {
		Car C=new Car("Honda",120);
		Bike B=new Bike("Gt",95);
		Truck T=new Truck("TATA",55);
		
		
		C.start();
		C.displayDetails();
		C.accelerate(50);
		C.brake(20);
		C.stop();
		
		
		System.out.println("============================================");
		
		
		B.start();
		B.displayDetails();
		B.accelerate(50);
		B.brake(20);
		B.stop();
		
		System.out.println("============================================");
		
		T.start();
		T.displayDetails();
		T.accelerate(50);
		T.brake(20);
		T.stop();
		
	}

}
