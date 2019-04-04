package services;

/**
 * Interface for elementary arithmetic operations.
 * 
 * @author Stefan Basaric
 *
 */
public interface ElementaryArithmetic {

	/**
	 * This method adds two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a + b
	 */
	public int add(int a, int b);

	/**
	 * This method subtracts two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a - b
	 */
	public int subtract(int a, int b);

	/**
	 * This method multiplies two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a * b
	 */
	public int multiply(int a, int b);

	/**
	 * This method divides two numbers.
	 * 
	 * @param a
	 * @param b
	 * @return a / b
	 * @throws ArithmeticException
	 */
	public int divide(int a, int b) throws ArithmeticException;

	/**
	 * This method checks if two numbers are coprime. Two numbers are coprime if
	 * their gcd is 1.
	 * 
	 * @param a
	 * @param b
	 * @return isCoprime
	 */
	public boolean areCoprime(int a, int b);

}
