package org.eclipse.transformer;

public class TransformException extends Exception {
	private static final long serialVersionUID = 1L;

	public TransformException() {
		super();
	}
	
	public TransformException(String message) {
		super(message);
	}
	
	public TransformException(String message, Throwable cause) {
		super(message, cause);
	}
}
