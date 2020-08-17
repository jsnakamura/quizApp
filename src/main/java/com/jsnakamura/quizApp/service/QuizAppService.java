package com.jsnakamura.quizApp.service;

import java.util.List;

import com.jsnakamura.quizApp.entity.Answer;
import com.jsnakamura.quizApp.entity.Question;

public interface QuizAppService {

	public List<Question> listAllQuestions();

	public void save(Answer answers);
}
