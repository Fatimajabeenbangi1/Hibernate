package com.Anudip.hibernateonetomanydemo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity


public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String answerText;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="questionid")
	Question question;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswerText() {
		return answerText;
	}
	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}
	public Answer() {
		
		// TODO Auto-generated constructor stub
	}
	

}
