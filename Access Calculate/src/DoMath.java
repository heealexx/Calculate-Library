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
		System.out.println(Calculate.isDivisibleBy(8, 5));
		System.out.println(Calculate.absValue(-6));
		System.out.println(Calculate.round2(-200.5645));
		System.out.println(Calculate.exponent(2, 4));
		System.out.println(Calculate.factorial(4));
		
	}

}
