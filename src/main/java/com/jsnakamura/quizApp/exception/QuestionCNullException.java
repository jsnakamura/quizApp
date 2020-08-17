package com.jsnakamura.quizApp.exception;

public class QuestionCNullException extends RuntimeException{

	private static final long serialVersionUID = 1244134744463576277L;
	
	public QuestionCNullException() {
	}
	
	public QuestionCNullException(String message, Throwable cause) {
		super(message, cause);
	}

	public QuestionCNullException(String message) {
		super(message);
	}

	public QuestionCNullException(Throwable cause) {
		super(cause);
	}

}
