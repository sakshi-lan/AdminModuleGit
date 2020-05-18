package com.cap.exception;

@SuppressWarnings("serial")
public class InvalidCityId extends Exception {
	public InvalidCityId(String errorMsg) {
		super(errorMsg);
	}
}
