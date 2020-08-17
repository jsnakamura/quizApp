package com.jsnakamura.quizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsnakamura.quizApp.entity.Answer;
import com.jsnakamura.quizApp.entity.Question;
import com.jsnakamura.quizApp.repository.AnswersRepository;
import com.jsnakamura.quizApp.repository.QuestionRepository;

@Service
public class QuizAppServiceImp implements QuizAppService {

	private QuestionRepository questionRepository;
	private AnswersRepository answersRepository;

	@Autowired
	public QuizAppServiceImp(QuestionRepository questionRepository, AnswersRepository answersRepository) {
		this.questionRepository = questionRepository;
		this.answersRepository = answersRepository;
	}

	@Override
	public List<Question> listAllQuestions() {
		return questionRepository.findAll();
	}

	@Override
	public void save(Answer answers) {
		answersRepository.save(answers);

	}
}
