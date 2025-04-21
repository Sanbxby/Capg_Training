package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDouble {

	public static void main(String[] args) {
		
		List<Double> list=new ArrayList<>(List.of(1.25,2.45,9.67));
		Collections.sort(list,(d1,d2) -> Double.compare(d1, d2));
		System.out.println(list);
		// TODO Auto-generated method stub

	}

}
