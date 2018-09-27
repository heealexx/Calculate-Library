/* Contains various methods that do math and calculations.
 * @author: Alex He
 * @version: 9/21/2018
 */

public class Calculate {
	
	//returns the square of an integer
	public static int square (int num) {
		
		int numSquared;
		numSquared = num * num;
		return numSquared;
		
	}
	
	//returns the cube of an integer
	public static int cube (int num) {
		
		int numCubed;
		numCubed = num * num * num;
		return numCubed;
		
	}
	
	//returns the average of two doubles
	public static double average (double num, double num2) {
		
		double numAveraged;
		numAveraged = (num + num2)/2;
		return numAveraged;
		
	}
	
	//returns the average of three doubles
	public static double average (double num, double num2, double num3) {
		
		double numAveraged;
		numAveraged = (num + num2 + num3)/3;
		return numAveraged;
		
	}
	
	//returns the degree value of a radian as double
	public static double toDegrees (double radian) {
		
		double ansDeg;
		ansDeg = (radian * 180) / 3.14159;
		return ansDeg;
		
	}
	
	//returns the radian value of a degree as a double
	public static double toRadians (double degree) {
		
		double ansRad;
		ansRad = (degree * 3.14159) / 180;
		return ansRad;
		
	}

	//returns the discriminant of three double values
	public static double discriminant (double a, double b, double c) {
		
		double ansDisc;
		ansDisc = (b *b) - (4 * a * c);
		return ansDisc;
		
	}
	
	//returns a string of an improper fraction from three integers of a mixed number
	public static String toImproperFraction (int wholeNum, int numer, int denom) {
	
		return ((wholeNum * denom) + numer) + "/" + denom;
		
	}
	
	//returns a string of a mixed number from two integers
	public static String toMixedNum (int numer, int denom) {
		
		return ((numer / denom) + "_" + (numer % denom) + "/" + denom);
		
	}
	
	//returns foil of a polynomial, accepting 4 integers and a variable as a string
	public static String foil (int a, int b, int c, int d, String e) {
		
		return (a * c) + e + "^2" + " + " + ((a * d) + (b * c)) + e + " + " + (b * d);
		
	}
	
	//returns a boolean based on if int a is divisible by int b
	public static boolean isDivisibleBy (int a, int b) {
		
		if  (b == 0) throw new IllegalArgumentException ("divisor must not be 0");
		if (a % b == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	//returns the absolute value of a double
	public static double absValue (double num) {
		
		if (num < 0) {
			return num * -1;
		}else {
			return num;
		}
		
	}
	
	//returns the highest number between two doubles
	public static double max (double num1, double num2) {
		
		if (num1 >= num2) {
			return num1;
		}else {
			return num2;
		}
		
	}
	
	//returns the highest number between three doubles
	public static double max (double num1, double num2, double num3) {
		
		if (num1 >= num2 && num1 >= num3) {
			return num1;
		}else if (num2 >= num3) {
			return num2;
		}else {
			return num3;
		}
		
	}
	
	//returns the lowest number between two integers
	public static int min (int num1, int num2) {
		
		if (num1 <= num2) {
			return num1;
		}else {
			return num2;
		}
		
	}
	
	//returns the rounded number of a double to the nearest hundredth place
	public static double round2 (double num1) {
	
		if (num1 >= 0) {
	        double num2 = (num1 + .005) * 100;
	        double num3 = (int) num2;
	        return num3 / 100;
		}else {
			double num2 = (num1 - .005) * 100;
			double num3 = (int) num2;
			return num3 / 100;
		}

	}
	
	//returns a number to a certain exponent
	public static double exponent (double base, int exp) {
		
		if (exp <= 0) throw new IllegalArgumentException ("exponent can not be negative");
		double ans = base;
		if (exp == 0) {
			return 1.0;
		}else {
			for (int i = 1; i < exp; i++) {
				ans *= base;
			}
			return ans;
		}

	}
	
	//returns the factorial of an integer
	public static int factorial (int num) {
		
		if (num < 0) throw new IllegalArgumentException ("factorial number may not be negative");
		int ans = 1;
		for (int i = 1; i <= num; i++) {
			ans *= i;
		}
		return ans;
		
	}

	//returns a boolean determined by if a number is an integer or not
	public static boolean isPrime (int num) {
		
		boolean ans = true;
		for (int i = num - 1; i > 1; i--) {
			if (Calculate.isDivisibleBy(num, i) == true) {
				ans = false;
			}else if (ans != false) {
				ans = true;
			}
		}
		return ans;
		
	}
	
	//returns the greatest common factor between two integers
	public static int gcf (int num1, int num2) {
		
		int base = 1;
		for (int i = (int) Calculate.min(num1, num2); i > 1; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				if (i >= base) {
					base = i;
				}
			}
		}
		return base;
		
	}
	
	//returns the approximation square root of a number
	public static double sqrt (double num) {
		
		if (num < 0) throw new IllegalArgumentException ("can not find square root of negative number");
		double ans = num / 6;
		while ((Calculate.absValue((ans * ans) - num)) >= .005) {
			ans = ((num/ans) + ans)/2;
		}
		return Calculate.round2(ans);
		
	}
	
	//returns the roots of the coefficients of the quadratic formula
	public static String quadForm (int a, int b, int c) {
		
		if (a == 0) throw new IllegalArgumentException ("a can not be 0");
		double ans1 = (-b + Calculate.sqrt(Calculate.discriminant(a, b, c))) / (2 * a);
		double ans2 = (-b - Calculate.sqrt(Calculate.discriminant(a, b, c))) / (2 * a);
		if (ans1 == 0 && ans2 == 0) {
			return "no real roots";
		}else if (ans1 == ans2) {
			return Calculate.round2(ans1) + "";
		}else {
			return Calculate.round2(ans1) + " and " + Calculate.round2(ans2);
		}
		
	}
	
}
