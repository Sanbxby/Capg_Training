package MethodReference;

public class Demo1 {
	public static void main(String[] args) {
		//Operation o= Calci::add;  //Method Reference for static method
		Operation o=new Calci()::add;  //Method Reference for non static method
		int res=o.operate(10,20);
		System.out.println(res);
	}

}
