package com.jsnakamura.quizApp.exception;

public class QuestionDNullException extends RuntimeException{

	private static final long serialVersionUID = 5720866572719295855L;

	public QuestionDNullException() {
	}
	
	public QuestionDNullException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuestionDNullException(String message) {
		super(message);
	}

	public QuestionDNullException(Throwable cause) {
		super(cause);
	}
}
