package com.homedecore.online.exceptions;
/**
 *  LoginException.The exception which is thrown during the
 *         user login validation process
 *        
 * 
 */
public class LoginException extends Exception {

	/** serialVersinUID for the serializable class. */
	private static final long serialVersionUID = 1L;

	/**
	 * OverLoaded Constructor.
	 *
	 * @param message -The message to be used for the particular exception
	 */
	public LoginException(final String message) {
		super(message);// Calling to the super class constructor

	}

	/**
	 * OverLoaded Constructor.
	 *
	 * @param message -The message to be used for the particular exception
	 * @param exception -The exception object which got caught.
	 */
	public LoginException(final String message,
			final Throwable exception) {
		super(message, exception);// Calling to the super class constructor

	}

	/**
	 * OverLoaded Constructor.
	 *
	 * @param exception -The exception object which got caught.
	 */
	public LoginException(final Throwable exception) {
		super(exception);// Calling to the super class constructor
	}

}
