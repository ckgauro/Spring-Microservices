package com.gauro.firstspringbootproject.service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

import com.gauro.firstspringbootproject.model.Question;
import com.gauro.firstspringbootproject.model.Survey;

@Component
public class SurveyService {
	private static List<Survey> surveys = new ArrayList<>();
	private SecureRandom random = new SecureRandom();
	static {
		Question question1 = new Question("Question1",
				"Largest Country in the World", "Russia", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Question question2 = new Question("Question2",
				"Most Populus Country in the World", "China", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Question question3 = new Question("Question3",
				"Highest GDP in the World", "United States", Arrays.asList(
						"India", "Russia", "United States", "China"));
		Question question4 = new Question("Question4",
				"Second largest english speaking country", "India", Arrays
						.asList("India", "Russia", "United States", "China"));

		List<Question> questions = new ArrayList<>(Arrays.asList(question1,
				question2, question3, question4));

		Survey survey = new Survey("Survey1", "My Favorite Survey",
				"Description of the Survey", questions);

		surveys.add(survey);
	}
	
	
	public List<Survey> retriveSurvey(){
		return surveys;
	}
	
	public Survey retrieveSurvey(String surveyId) {
		Predicate<Survey> pfindSurveyId= el->el.getId().equals(surveyId);
		Optional<Survey> survey=  surveys.stream().filter(pfindSurveyId).findFirst();
		return survey.isPresent()?survey.get():null; 
		
	}
	
	public List<Question> retrieveQuestions(String surveyId) {
		Survey survey = retrieveSurvey(surveyId);		
		return survey==null?null:survey.getQuestions();
	}
	
	public Question retrieveQuestion(String surveyId, String questionId) {
		Survey survey = retrieveSurvey(surveyId);

		if (survey == null) {
			return null;
		}
		Predicate<Question> pfindQuestionId=el-> el.getId().equals(questionId);
		Optional<Question> question=survey.getQuestions().stream().filter(pfindQuestionId).findFirst();
		return question.isPresent()? question.get():null;
		
	}
	public Question addQuestion(String surveyId, Question question) {
		Survey survey = retrieveSurvey(surveyId);
		if (survey == null) {
			return null;
		}
		String randomId = new BigInteger(130, random).toString(32);
		question.setId(randomId);

		survey.getQuestions().add(question);

		return question;
	}
	
	

}
