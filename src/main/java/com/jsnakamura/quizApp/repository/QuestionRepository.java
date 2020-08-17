package com.jsnakamura.quizApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsnakamura.quizApp.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
