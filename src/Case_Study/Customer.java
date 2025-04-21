package Case_Study;

public class Customer {
	private String name;
	private boolean login;
	
	public Customer(String name,boolean login) {
		this.name=name;
		this.login=login;
		
	}
	public boolean islogin() {
		return login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isLogin() {
		return login;
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	

}
