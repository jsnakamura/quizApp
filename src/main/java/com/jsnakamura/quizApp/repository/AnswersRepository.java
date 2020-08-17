package com.jsnakamura.quizApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsnakamura.quizApp.entity.Answer;

public interface AnswersRepository extends JpaRepository<Answer, Integer> {

}
