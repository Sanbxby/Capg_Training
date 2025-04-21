package Case_Study;

import java.util.Set;

public class Restaurent {
	private String name;
	private Set<String> menu;
	
	
	
	public Restaurent(String name,Set<String> menu) {
		this.name=name;
		this.menu=menu;
	}
	public boolean hasmenuItem(String Item) {
		return menu.contains(Item);
	}
	public String getname() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getMenu() {
		return menu;
	}
	public void setMenu(Set<String> menu) {
		this.menu = menu;
	}

}
