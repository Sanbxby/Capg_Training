package Case_Study;
import java.util.List;

public class orderservice {
	public void placeorder(Customer customer,Restaurent restaurent,List<String> items)
	throws OrderLimitExceedException,MenuItemNotFoundException {
		
		if(!customer.islogin()) {
			System.out.println("Customer should login to place order");
		}
		
		if(items.size()>5) {
			throw new OrderLimitExceedException("Error: You've attempted to order more items than permitted.");
		}
		
		for(String item:items) {
			if(!restaurent.hasmenuItem(item)) {
				throw new MenuItemNotFoundException("Menu item not found.");
			}
		}
		System.out.println("Order placed succesfully by "+customer.getName() +" at " + restaurent.getname());
		System.out.println("Items: "+items);
	}

}
