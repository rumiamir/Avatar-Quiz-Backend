package com.example.Avatar.Quiz.controller;

import com.example.Avatar.Quiz.module.Question;
import com.example.Avatar.Quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @CrossOrigin
    @GetMapping("/getQuiz")
    List<Question> getQuiz(){
        return questionService.getQuiz();
    }

    @PostMapping("/create")
    void createQuestion(@RequestBody Question question){
    questionService.createQuestion(question);
    }
    @PutMapping("/update")
    void updateQuestion(@RequestBody Question question){
    questionService.updateQuestion(question);
    }

    @DeleteMapping("/delete")
    void deleteQuestionById(@RequestParam Long id){
    questionService.deleteQuestionById(id);
    }
}
