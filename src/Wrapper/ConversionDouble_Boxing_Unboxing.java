package Wrapper;

public class ConversionDouble_Boxing_Unboxing {
	public static void main(String[] args) {
		//AutoBoxing
		double d=19.67;
		Double dd=Double.valueOf(d);
		System.out.println(dd);
		
		int a=25;
		Integer i=Integer.valueOf(a);
		System.out.println(i);
		

		short s=25;
		Short ss=Short.valueOf(s);
		System.out.println(ss);
		
		byte b=2;
		Byte bb=Byte.valueOf(b);
		System.out.println(bb);
		
		boolean b1=true;
		Boolean b2=Boolean.valueOf(b1);
		System.out.println(b2);
		
		
		//Unboxing
		Integer ii=new Integer(100);
		int ii2=ii.intValue();
		System.out.println(ii2);
		
		Byte bytu=20;
		byte bytee=bytu.byteValue();
		System.out.println(bytee);
		
		Boolean boo=false;
		boolean bool=boo.booleanValue();
		System.out.println(boo);
		}

}
