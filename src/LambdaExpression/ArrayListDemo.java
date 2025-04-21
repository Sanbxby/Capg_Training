package LambdaExpression;
import java.util.collections;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		/*ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);*/
		
		List<Integer> list =new ArrayList<> (List.of(1,2,3,4,5));	
		list.forEach(element -> System.out.println(element+" "));
	}

}
