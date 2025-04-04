package OOPS;

public class Calculators {
	public static Calculator add(Calculator c) {
		c.setResult(c.getNum1()+c.getNum2());
		return c;
	}
    public static Calculator multiply(Calculator c) {
		c.setResult(c.getResult() * 2);
		return c;
	}

}
