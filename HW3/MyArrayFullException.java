package mvs;

public class MyArrayFullException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Group is already full. Adding students is denied!!!";
	}

}
