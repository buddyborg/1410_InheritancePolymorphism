package phones;

/**
 * 
 * @author Paulina Cruz
 */
public class RotaryPhone extends DeskPhone {
	/**
	 * Initializes model, dimension and voltage of RotaryPhone
	 * 
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	public RotaryPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension, voltage);
	}

	/**
	 * Returns a string of the following format:
	 * Rotating the dial to call {number}
	 */
	@Override
	public String call(long number) {
		return "Rotating the dial to call " + number;
	}
}
