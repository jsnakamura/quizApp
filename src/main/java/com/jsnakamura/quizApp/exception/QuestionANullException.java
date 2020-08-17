package com.jsnakamura.quizApp.exception;

public class QuestionANullException extends RuntimeException{

	private static final long serialVersionUID = -3120905798182765377L;
	
	public QuestionANullException() {
	}
	
	public QuestionANullException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuestionANullException(String message) {
		super(message);
	}

	public QuestionANullException(Throwable cause) {
		super(cause);
	}
}
