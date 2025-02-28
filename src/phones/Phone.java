package phones;

/**
 * 
 * @author Paulina Cruz
 */
public abstract class Phone {
	private String model;
	private Dimension dimension;
	
	/**
	 * Initializes model and dimension of phone
	 * 
	 * @param model
	 * @param dimension
	 */
	protected Phone(String model, Dimension dimension) {
		this.model = model;
		this.dimension = dimension;
	}
	
	/**
	 * Calls the number
	 * 
	 * @param number
	 * @return the result
	 */
	public abstract String call (long number);
	
	/**
	 * Returns a string of the following format:
	 * {model} {dimension}
	 */
	@Override
	public String toString() {
		return model + " " + dimension.toString() ;
	}
	
}
