package phones;

import java.util.Random;
/**
 * 
 * @author Paulina Cruz
 */
public class SmartPhone extends Phone {

	private int storage;
	
	/**
	 * Initializes model, dimension, and storage of the phone
	 * If storage is 0 or negative number, throws IllegalArgumentException
	 * @param model
	 * @param dimension
	 * @param storage
	 */
	public SmartPhone(String model, Dimension dimension, int storage) {
		super(model, dimension);
		
		if(storage <= 0) {
			throw new IllegalArgumentException("Storage needs to be assigned a positive value.");
		}
		
		this.storage = storage;
	}

	/**
	 * Returns a string of the following format:
	 * Calling {number} by selecting the number
	 */
	@Override
	public String call(long number) {
		return "Calling " + number + " by selecting the number";
	}
	
	/**
	 * Returns string that says "Browsing the web" 
	 * @return string for browsing web
	 */
	public String browse() {
		return "Browsing the web";
	}
	
	/**
	 * Returns one of two strings at random
	 * @return string to take picture
	 */
	public String takePicture() {
		Random random = new Random();
		float num = random.nextFloat();
		
		if(num > .5) {
		return "Taking a horizontal picture";
	}
		else {
			return "Taking a vertical picture";
		}
	}

	/**
	 * Returns a string of the following format:
	 * {model} {dimension} {storage}GB
	 */
	@Override
	public String toString() {
		return super.toString() + " " + storage + "GB";
	}

}
