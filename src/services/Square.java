package services;

/**
 * Interface for mathematical operations on a square.
 * 
 * @author Stefan Basaric
 *
 */
public interface Square {

	/**
	 * This method returns the perimeter of a square.
	 * 
	 * @param sideLenght
	 * @return perimeter
	 */
	public double getSquarePerimeter(double sideLenght);

	/**
 * This method returns the area of a square.
 * 
 * @param sideLenght
 * @return area
 */
	public double getSquareArea(double sideLenght);
}

