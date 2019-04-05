package services;

/**
 * This class performs all kinds of mathematical operations.
 * 
 * @author Stefan Basaric
 *
 */
public class Calculator implements ElementaryArithmetic, Circle, Square {

	/*
	 * This part of the code contains predefined constants.
	 */

	public static final double PI = 3.14159265359;
	public final static double e = 2.718281828459045;

	/*
	 * This part of the code contains circle functions.
	 */

	@Override
	public double getCirclePerimeter(double radius) {
		return 2 * PI * radius;
	}

	@Override
	public double getCircleRadius(double perimeter) {
		return (perimeter / (2 * PI));
	}

	@Override
	public double getCircleArea(double radius) {
		return PI * Math.pow(radius, 2);
	}

	/*
	 * This part of the code contains square functions.
	 */

	@Override
	public double getSquarePerimeter(double sideLenght) {
		return 4 * sideLenght;
	}

	public double getSquareArea(double sideLenght, double unusedParam) {
		return Math.pow(sideLenght, 2);
	}

	/*
	 * This part of the code contains elementary arithmetic functions.
	 */

	// public int addNumbers(int a, int b) { c = a + b; return c; }
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public boolean areCoprime(int a, int b) {
		// Calculate gcd
		while (b != 0) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		// Check if coprime
		if (a == 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int multiply(int a, int b) {
		return a * b;
	}

	@Override
	public int divide(int a, int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("Can't divide through zero!");
		}
		return a / b;
	}

}
