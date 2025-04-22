package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple","banana","cherry","arm","city","kiwi","gauva","gourav","jam");
		List<String> res=list.stream().map(s -> s.toUpperCase()).toList();
	    System.out.println(res);
	    
	    String res2=list.stream().filter(s -> s.charAt(0)=='a').findFirst().get().toString();
	    System.out.println(res2);
	}

}
