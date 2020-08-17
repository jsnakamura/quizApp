package com.jsnakamura.quizApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "answers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Answer {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "question_a")
	private int questionA;

	@Column(name = "question_b")
	private int questionB;

	@Column(name = "question_c")
	private int questionC;

	@Column(name = "question_d")
	private int questionD;
}
