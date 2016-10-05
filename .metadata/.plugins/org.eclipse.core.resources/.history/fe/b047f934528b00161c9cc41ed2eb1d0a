/** Samantha Chow
 *	APCS 1
 *	9/24/16
 *
 *
 * This class is a Math Library that contains the formulas (written as methods) for a number 
 * of different basic and complex math equations. 
 */
public class Calculate {
	
//part 1
	//Accepts a double and returns the square of that number as a double.
	public static double square(double num){
		double answer;
		answer = (num*num);
		return answer;
	}
	//Accepts a double and returns the cube of that number as a double. 
	public static double cube(double num){
		double answer;
		answer = (num*num*num);
		return answer;
	}
	//Accepts two doubles and returns the average of those two numbers as a double.
	public static double average(double num1, double num2){
		double answer;
		answer = ((num1+num2)/2);
		return answer;
	}
	//Accepts three doubles and returns the average of those three numbers as a double. 
	public static double average(double num1, double num2, double num3){
		double answer;
		answer = ((num1+num2+num3)/3);
		return answer;
	}
	//Accepts a double radian value and returns the degree value as a double. 
	public static double toDegrees(double radians){
		double answer;
		answer = (radians*(180/3.14159));
		return answer;
	}
	//Accepts a double degree value and returns the radian value as a double. 
	public static double toRadians(double degrees){
		double answer;
		answer = (degrees*(3.14159/180));
		return answer;
	}
	//Accepts three doubles and returns the discriminant of the numbers as a double. 
	public static double discriminant(double a, double b, double c){
		double answer;
		answer = ((b*b)-(4*a*c));
		return answer;
	}
	//Accepts three integers and converts it into an improper fraction as a String. 
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be 0.");
		}else{
			int improperNumerator = (wholeNum*denominator) + numerator;
			return improperNumerator + "/" + denominator;
		}
	}
	//Accepts two integers and converts it into a mixed number as a String. 
	public static String toMixedNum(int numerator, int denominator){
		if(denominator == 0){
			throw new IllegalArgumentException("Denominator cannot be 0.");
		}else{
			int wholeNum;
			wholeNum = numerator / denominator;
			int xModY = numerator % denominator;
			return wholeNum + "_" + xModY + "/" + denominator;
		}
	}
	//Accepts four integers and a String to foil the input and return the foiled function as a String.
	public static String foil(int a, int b, int c, int d, String x){
		int first = (a*c); 
		int second = (a*d);
		int third = (b*c);
		int fourth = (b*d);
		int secondCoeff = second + third;
		x = (first + "n^2" + " + " + secondCoeff + "n + " + fourth);
		return x;
	}
//part 2
	//Accepts two integers and determines whether they are divisible by each other and returns a boolean.
	public static boolean isDivisibleBy(int dividend, int divisor){
		if (divisor == 0){
			throw new IllegalArgumentException("You can't divide by 0.");
		}else if (dividend % divisor == 0){
			return true;
		}else{
			return false;
		}
	}
	//Accepts a double and returns the absolute value of the number as a double. 
	public static double absValue(double num){
		if (num > 0){
			return num;
		}else{
			return -(num);
		}
	}
	//Accepts two integers and determines which number is larger and returns that integer. 
	public static int max(int num1, int num2){
		if (num1 == num2){
			throw new IllegalArgumentException("First and second number can't equal each other.");
		}else if(num1 > num2){
			return num1;
		}else{
			return num2;
		}
	}
	//Accepts three doubles and determines which number is largest and returns that double. 
	public static double max(double num1, double num2, double num3){
		if (num1 == num2 && num1 == num3){
			throw new IllegalArgumentException("3 numbers can't equal each other.");
		}else if (num1 > num2 && num1 > num3){
			return num1;
		}else if (num2 > num1 && num2 > num3){
			return num2;
		}else{
			return num3;
		}
	}
	//Accepts two integers and determines which number is smaller and returns that integer. 
	public static int min(int num1, int num2){
		if (num1 < num2){
			return num1;
		}else{
			return num2;
		}
	}
	//Accepts a double and rounds it to 2 decimal places and returns a double. 
	public static double round2(double num){
		num = (num + 0.005);
		num = (num * 100.0);
		num = (int) num;
		num = (num / 100);
		return num;
	}
//part 3
	//Accepts a double and an integer and returns the double raised to the integer power as a double.
	public static double exponent(double base, int exp){
		if(exp <= 0){
			throw new IllegalArgumentException("Can't raise to power of 0 or less.");
		}else{
			double start = base;
			for (int i = 1; i < exp; i++){
				base *= start;
			}
			return base;
		}
    }
	//Accepts an integer and returns the factorial of that number as an integer.
	public static int factorial(int num){
		if (num < 0){
			throw new IllegalArgumentException("Cannot find a factorial of a number less than 0.");
		}else{
        	int start = 1; 
        	for (int i = 1; i <= num; i++) {
        		start *= i;
        	}
        	return start;
		}
    }
	//Accepts an integer and returns whether or not the number is prime. 
	public static boolean isPrime(int num){
		if (num <= 2){
			throw new IllegalArgumentException("Number must be greater than 2 to determine if prime.");
		}else{
			for (int i = 2; i< num; i++){
				if(Calculate.isDivisibleBy(num, i) == true){
					return false;
				}
			}
			return true;
		}
	}
	//Accepts two integers and returns the greatest common factor between the two as an integer.
	public static int gcf(int num1, int num2){
        while(num1 != 0 && num2 != 0){
        	int factor = num2;
        	num2 = num1 % num2;
        	num1 = factor;
        }
        int gcf = num1+num2;
        if (gcf <=0){
        	throw new IllegalArgumentException("GCF cannot equal 0");
        }else{
        	return gcf;
        }
    }
	//Accepts a double and returns the square root of that number as a double. 
	public static double sqrt(double num){
		double sqrt = round2(Math.sqrt(num));
		if(num < 0){
			throw new IllegalArgumentException("Cannot square root a negative number.");
		}else{
			return Calculate.round2(sqrt);
		}
	}
//part 4
	public static String quadForm(int coeff1, int coeff2, int coeff3){
		double discriminant = Calculate.discriminant(coeff1, coeff2, coeff3);
		if(discriminant < 0){
			return "no real roots";
		}
		double numerator = (-coeff2 + (Calculate.sqrt(discriminant)));
		double denominator = (2*coeff1);
		double squareRoot = numerator / denominator;
		
	}
}