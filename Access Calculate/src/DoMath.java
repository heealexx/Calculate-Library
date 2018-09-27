/* This will call various methods in the calculate library client code
 * @author: Alex He
 * @version: 9/19/2018
 */	


public class DoMath {

	public static void main(String[] args) {
		
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.toDegrees((3*3.14159)/2));
		System.out.println(Calculate.toImproperFraction(2, 5, 6));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(0, 5));
		System.out.println(Calculate.absValue(-6));
		System.out.println(Calculate.round2(-200.565));
		System.out.println(Calculate.exponent(2, 1));
		System.out.println(Calculate.factorial(0));
		System.out.println(Calculate.isPrime(1));
		System.out.println(Calculate.gcf(42,27));
		System.out.println(Calculate.sqrt(10.0));
		System.out.println(Calculate.quadForm(3, 4, -1));
		
	}

}
