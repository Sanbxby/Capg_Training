package LambdaExpression;

public class VehicleDriver {

	public static void main(String[] args) {
		
		/*Vehicle car=new Vehicle() {
			public void start() {
				System.out.println("Car is starting");
			}
		};
		// TODO Auto-generated method stub
		Vehicle bike=new Vehicle() {
			public void start() {
				System.out.println("Bike is starting");
			}
		};*/
		
		/*Vehicle car= () ->{
	         System.out.println("Car is starting");
		};
		
		Vehicle bike= () ->{
			System.out.println("Bike is starting");
		};*/
		Vehicle car= () ->  System.out.println("Car is starting");
		Vehicle bike= () -> System.out.println("Bike is starting");
		
		
		bike.start();
		car.start();
	}

}
