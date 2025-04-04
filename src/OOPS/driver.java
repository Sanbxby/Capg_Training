package OOPS;

public class driver {
	public static void main(String[] args) {
		laptop l1= new laptop("MSI",90000,8);
		System.out.println(l1.brand+" "+l1.price+" "+l1.ram);
		
		laptop l2= new laptop("HP",45000,4);
		System.out.println(l2.brand+" "+l2.price+" "+l2.ram);
	}

}
