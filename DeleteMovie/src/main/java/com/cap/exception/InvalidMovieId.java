package com.cap.exception;

@SuppressWarnings("serial")
public class InvalidMovieId extends Exception {
	public InvalidMovieId(String errorMsg) {
		super(errorMsg);
	}
}
