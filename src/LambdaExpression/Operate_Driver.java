package LambdaExpression;

public class Operate_Driver {
	public static void main(String[] args) {
		
		Oparate o=(a,b) -> a+b;
		int res=o.operate(20,30);
		System.out.println(res);
	}

}
