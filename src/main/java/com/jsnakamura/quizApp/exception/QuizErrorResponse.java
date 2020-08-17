package com.jsnakamura.quizApp.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuizErrorResponse {

	private int status;
	private String message;
	private long timeStamp;
}
