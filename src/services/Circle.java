package services;

/**
 * Interface for mathematical operations on a circle.
 * 
 * @author Stefan Basaric
 *
 */
public interface Circle {

	/**
	 * This method returns the perimeter of a circle.
	 * 
	 * @param radius
	 * @return perimeter
	 */
	public double getCirclePerimeter(double radius);

	/**
	 * This method returns the radius of a circle.
	 * 
	 * @param perimeter
	 * @return radius
	 */
	public double getCircleRadius(double perimeter);

	/**
	 * This method returns the area of a circle.
	 * 
	 * @param radius
	 * @return area
	 */
	public double getCircleArea(double radius);

}
