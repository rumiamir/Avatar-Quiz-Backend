package com.example.Avatar.Quiz.repository.mapper;

import com.example.Avatar.Quiz.module.Question;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionMapper implements RowMapper<Question> {
    @Override
    public Question mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Question(
                rs.getLong("id"),
                rs.getString("question"),
                rs.getString("right_answer"),
                rs.getString("wrong_answer1"),
                rs.getString("wrong_answer2"),
                rs.getString("wrong_answer3")
        );
    }
}
