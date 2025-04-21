package Case_Study;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Restaurant_Driver {
	public static void main(String[] args) throws OrderLimitExceedException, MenuItemNotFoundException {
	
		Set<String> menu= new HashSet<>(Arrays.asList("Pizza","Burger","Fries","Pasta","Milkshake","Fried Chicken","Ramen","Biryani"));
		Restaurent restaurent=new Restaurent("FoodZpah",menu);
		Customer customr=new Customer("Sanju",true);
		
		List<String>itemsToOrder=Arrays.asList("Fries","Burger","Fried Chicken","Milkshake");
		
		orderservice orderservice= new orderservice();
		orderservice.placeorder(customr, restaurent, itemsToOrder);
	}

}
