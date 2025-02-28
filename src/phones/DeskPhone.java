package phones;

/**
 * 
 * @author Paulina Cruz
 */
public abstract class DeskPhone extends Phone {
	
	public boolean connected;
	private Voltage voltage;
	
	/**
	 * Initializes model, dimension, and voltage of phone.
	 * @param model
	 * @param dimension
	 * @param voltage
	 */
	protected DeskPhone(String model, Dimension dimension, Voltage voltage) {
		super(model, dimension);
		this.voltage = voltage;
	}
	
	/**
	 * Method that sets phone to plugged in
	 */
	public void plugIn() {
		connected = true;
	}
	
	/**
	 * Method that sets phone to unplugged
	 */
	public void unplug() {
		connected = false;
	}
	
	/**
	 * Returns if phone is connected or not
	 * @return phone connection
	 */
	public boolean isConnected() {
		return connected;
	}

	/**
	 * Returns a string of the following format:
	 * {model} {dimension} {voltage} {connectionInfo}
	 */
	@Override
	public String toString() {
		return super.toString() + " " + voltage.toString() + " " + (isConnected() ? "connected" : "not connected");
	}
}
