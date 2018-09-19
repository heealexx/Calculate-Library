/* Contains various methods that do math and calculations.
 * @author: Alex He
 * @version: 9/19/2018
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
		ansDisc = (-b - (4 * a * c)) / (2 * a);
		return ansDisc;
		
	}
	
	//returns a string of an improper fraction from three integers of a mixed number
	public static String toImproperFraction (int wholeNum, int numer, int denom) {
	
		return ((wholeNum * denom) + numer) + "/" + denom;
		
	}
	
	//returns a string of a mixed number from two integers
	public static String toMixedNum (int numer, int denom) {
		
		return ((numer / denom) + " " + (numer % denom) + "/" + denom);
		
	}
	
	//returns foil of a polynomial, accepting 4 integers and a variable as a string
	public static String foil (int a, int b, int c, int d, String e) {
		
		return (a * c) + e + "^2" + " + " + ((a * d) + (b * c)) + e + " + " + (b * d);
		
	}
	
	//returns a boolean based on if int a is divisible by int b
	public static boolean isDivisibleBy (int a, int b) {
		
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
	
	//returns the rounded number of a double to the nearest hundredths place
	public static double round2 (double num) {
	
		double num2 = num * 100;
		int num3 = (int) num2;
		if ((num2-num3) >= .5) {
			double num4 = (double) num3 / 100;
			return (num4 + .01);
		}else {
			return ((double) num3) / 100;
		}
		
	}
}
