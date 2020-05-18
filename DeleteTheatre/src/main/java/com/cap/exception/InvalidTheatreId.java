package com.cap.exception;

@SuppressWarnings("serial")
public class InvalidTheatreId extends Exception {
	public InvalidTheatreId(String errorMsg) {
		super(errorMsg);
	}
}
