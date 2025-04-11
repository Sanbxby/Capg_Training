package HashMap;

public class HashmapDriver {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(1,"Teacher");
		map.put(2,"Student");
		map.put(24,"Staff");
		map.put(18,"Doctor");
		map.display();
		System.out.println(map.getSize());
		System.out.println(map.get(24));
		System.out.println(map.containsKey(18));
	}

}
