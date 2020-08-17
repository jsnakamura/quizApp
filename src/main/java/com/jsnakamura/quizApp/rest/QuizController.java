package com.jsnakamura.quizApp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jsnakamura.quizApp.entity.Answer;
import com.jsnakamura.quizApp.exception.QuestionANullException;
import com.jsnakamura.quizApp.exception.QuestionBNullException;
import com.jsnakamura.quizApp.exception.QuestionCNullException;
import com.jsnakamura.quizApp.service.QuizAppService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/quiz")
@Api(value = "Quiz API")
public class QuizController {

	private QuizAppService quizAppService;

	@Autowired
	public QuizController(QuizAppService quizAppService) {
		this.quizAppService = quizAppService;
	}

	@ApiOperation(value = "Get all questions")
	@GetMapping("/question")
	public String getAllQuestions(Model theModel) {

		Answer answers = new Answer();

		theModel.addAttribute("questions", quizAppService.listAllQuestions());
		theModel.addAttribute("answers", answers);

		return "questions";
	}

	@PostMapping("/answer")
	public String insertAnswers(@ModelAttribute("answers") Answer theAnswers) {

		if (theAnswers.getQuestionA() == 0) {
			throw new QuestionANullException("You must answer Question 1.");
		} else if (theAnswers.getQuestionB() == 0) {
			throw new QuestionBNullException("You must answer Question 2.");
		} else if (theAnswers.getQuestionC() == 0) {
			throw new QuestionCNullException("You must answer Question 3.");
		} else if (theAnswers.getQuestionD() == 0) {
			throw new QuestionCNullException("You must answer Question 4.");
		}
		quizAppService.save(theAnswers);

		return "redirect:/quiz/question";
	}

}
