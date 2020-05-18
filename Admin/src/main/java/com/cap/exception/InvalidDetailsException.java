package com.cap.exception;

@SuppressWarnings("serial")
public class InvalidDetailsException extends Exception {
	public InvalidDetailsException(String errorMsg) {
		super(errorMsg);
	}
}
