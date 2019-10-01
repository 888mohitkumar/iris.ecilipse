package com.iris.messanger.Exception;

public class DataNotFoundException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(final String name) {
		super(name);
	}
}
