package Collection;
import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String>map=new LinkedHashMap<>();
		
		map.put(1,"Sanjona");
		map.put(2,"Sreejit");
		map.put(3,"Gourav");
		map.put(null,null);
		
		
		System.out.println(map);
		
	}

}
