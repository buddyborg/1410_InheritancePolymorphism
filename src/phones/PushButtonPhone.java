package phones;

/**
 * 
 * @author Paulina Cruz
 */
public class PushButtonPhone extends DeskPhone {

	/**
	 * Initializes the model, dimension, and voltage of PushButtonPhone
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public PushButtonPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}
	
	/**
	 * Returns a string of the following format:
	 * Pushing buttons to call {number}
	 */
	@Override
	public String call(long number) {
		return "Pushing buttons to call " + number;
	}

}
