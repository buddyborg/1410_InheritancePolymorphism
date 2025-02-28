package phones;

import java.text.DecimalFormat;
/**
 * Class that initializes and formats Phone dimensions
 * 
 * @author Paulina Cruz
 */
public class Dimension {

	private double height;
	private double width;
	private double depth;

	/**
	 * Initializes height, width, and depth of phone
	 * If one or more of parameter values are 0 or negative, throws IllegalArgumentException
	 * 
	 * @param height
	 * @param width
	 * @param depth
	 */
	public Dimension(double height, double width, double depth) {
		if (height <= 0 || width <= 0 || depth <= 0) {
			throw new IllegalArgumentException("The height, width, and depth of a dimension needs to be positive.");
		}
		
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Method that returns height of the phone
	 * @return height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * Method that returns width of the phone
	 * @return width
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Method that returns depth of the phone
	 * @return depth
	 */
	public double getDepth() {
		return depth;
	}

	/**
	 * Returns a string of the following format: 
	 * ({height} x {width} x {depth})
	 */
	@Override
	public String toString() {
		DecimalFormat format = new DecimalFormat("#.0");

		return "(" + String.join(" x ", format.format(getHeight()),format.format(getWidth()),format.format(getDepth())
				+ ")");
	}
}
