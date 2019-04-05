package main;

import services.Calculator;

/**
 * This class contains the main method that starts the java application.
 * 
 * @author Stefan Basaric
 *
 */
public class StudyProjectApplication {

	/**
	 * This method performs multiple mathematical operations.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Create calculator
		Calculator calc = new Calculator();

		// Perform elementary arithmetics
		int addResult = calc.add(2, 3);
		int subResult = calc.subtract(3, 2);
		int mulResult = calc.multiply(2, 2);
		int divResult = calc.divide(4, 2);

		// Perform circle functions
		double cirPerimeter = calc.getCirclePerimeter(2.4);
		double cirRadius = calc.getCircleRadius(8.8);
		double cirArea = calc.getCircleArea(2.4);

		// Perform square functions
		double squPerimeter = calc.getSquarePerimeter(5.0);
		double squArea = calc.getSquareArea(5.0);

		// Print all results
		System.out.println("Addition result: " + addResult);
		System.out.println("Subtraction result: " + subResult);
		System.out.println("Multiplication result: " + mulResult);
		System.out.println("Division result: " + divResult);

		System.out.println("Circle perimeter result: " + cirPerimeter);
		System.out.println("Circle radius result: " + cirRadius);
		System.out.println("Circle area result: " + cirArea);

		System.out.println("Square perimeter result: " + squPerimeter);
		System.out.println("Square area result: " + squArea);

	}
}

