package com.jsnakamura.quizApp.exception;

public class QuestionBNullException extends RuntimeException{

	private static final long serialVersionUID = -9213223240260048268L;
	
	public QuestionBNullException() {
	}
	
	public QuestionBNullException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuestionBNullException(String message) {
		super(message);
	}

	public QuestionBNullException(Throwable cause) {
		super(cause);
	}

}
