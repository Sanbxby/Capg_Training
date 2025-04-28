package Mock_Test;

@SecurityCheck(role = "Admin")
public class Admin extends User{

	public Admin(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void showProfile() {
		System.out.println("Admin's Name: "+this.getName()+"Role : Admin");
		// TODO Auto-generated method stub
		
	}

}
