package Onetomany;

public class PassportDriver {
	public static void main(String[] args) {
		Passport passport = new Passport ("7777777");
		Person person = new Person("Sanjona",passport);
		
		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassport_number());
		
	
	}

}
