package tomassarmiento.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.addNum(5.00);
		c.addOpt('+');
		c.addNum(5.2);
		c.addOpt('*');
		c.addNum(12.3);
		c.addOpt('+');
		c.addNum(5.2);
		c.addOpt('/');
		c.addNum(6.00);
		System.out.println(c.performResult());

	}

}
