package com.example.Avatar.Quiz.service;

import com.example.Avatar.Quiz.module.Question;
import com.example.Avatar.Quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;


    public List<Question> getQuiz(){
        return questionRepository.getQuiz();
    }

    public void createQuestion(Question question){
        questionRepository.createQuestion(question);
    }

    public void updateQuestion(Question question){
        questionRepository.updateQuestion(question);
    }

    public void deleteQuestionById(Long id){
        questionRepository.deleteQuestionById(id);
    }
}
