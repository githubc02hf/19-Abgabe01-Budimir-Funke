package at.fhj.iit;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new CalculatorImpl();

		calc.addValue(20); // currently highest number
		calc.addValue(4); // currently lowester number
		calc.addValue(16);
		System.out.println(calc.getMinimum());
		System.out.println(calc.getMaximum());

		// add other integers

		// output lowest number

		// output highest number

		// output sum of all numbers

	}

}
