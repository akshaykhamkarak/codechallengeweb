package com.player.exception;

public class DuplicateDataException extends ClassNotFoundException {

	public DuplicateDataException() {
		super();
		
	}
	public DuplicateDataException(String message) {
		super(message);
	}
}
