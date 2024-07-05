package com.example.Avatar.Quiz.repository;

import com.example.Avatar.Quiz.module.Question;

import java.util.List;

public interface QuestionRepository {
    List<Question> getQuiz();

    void createQuestion(Question question);

    void updateQuestion(Question question);

    void deleteQuestionById(Long id);
}