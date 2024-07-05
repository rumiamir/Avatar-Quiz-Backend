package com.example.Avatar.Quiz.repository;

import com.example.Avatar.Quiz.module.Question;
import com.example.Avatar.Quiz.repository.mapper.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public class QuestionRepositoryImpl implements QuestionRepository{

    @Autowired
    JdbcTemplate jdbcTemplate;

private static final String QUESTION_TABLE_NAME = "question";

    @Override
    public List<Question> getQuiz() {
        String sql = "SELECT * FROM "+QUESTION_TABLE_NAME;
        return jdbcTemplate.query(sql, new QuestionMapper());
    }

    @Override
    public void createQuestion(Question question) {
        String sql = "INSERT INTO "+QUESTION_TABLE_NAME+" (question,right_answer,wrong_answer1,wrong_answer2,wrong_answer3) values(?,?,?,?,?)";


        jdbcTemplate.update(
                sql,
                question.getQuestion(),
                question.getRAnswer(),
                question.getWAnswer1(),
                question.getWAnswer2(),
                question.getWAnswer3()
        );
    }

    @Override
    public void updateQuestion(Question question) {
        String sql = "UPDATE "+QUESTION_TABLE_NAME+" SET question=?,right_answer=?,wrong_answer1=?,wrong_answer2=?,wrong_answer3=?";

        jdbcTemplate.update(
                sql,
                question.getQuestion(),
                question.getRAnswer(),
                question.getWAnswer1(),
                question.getWAnswer2(),
                question.getWAnswer3()
        );

    }

    @Override
    public void deleteQuestionById(Long id) {
        String sql = "DELETE FROM "+QUESTION_TABLE_NAME+" WHERE id=?";


        jdbcTemplate.update(sql,id);
    }
}
