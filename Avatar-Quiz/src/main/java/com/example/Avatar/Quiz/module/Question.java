package com.example.Avatar.Quiz.module;

public class Question {
    private Long id;
    private String question;
    private String RAnswer;
    private String WAnswer1;
    private String WAnswer2;
    private String WAnswer3;

    public Question(String question, String RAnswer, String WAnswer1, String WAnswer2, String WAnswer3) {
        this.id = null;
        this.question = question;
        this.RAnswer = RAnswer;
        this.WAnswer1 = WAnswer1;
        this.WAnswer2 = WAnswer2;
        this.WAnswer3 = WAnswer3;
    }

    public Question(Long id, String question, String RAnswer, String WAnswer1, String WAnswer2, String WAnswer3) {
        this.id = id;
        this.question = question;
        this.RAnswer = RAnswer;
        this.WAnswer1 = WAnswer1;
        this.WAnswer2 = WAnswer2;
        this.WAnswer3 = WAnswer3;
    }

    public Question() {
    }

    public String getQuestion() {
        return question;
    }

    public String getRAnswer() {
        return RAnswer;
    }

    public String getWAnswer1() {
        return WAnswer1;
    }

    public String getWAnswer2() {
        return WAnswer2;
    }

    public String getWAnswer3() {
        return WAnswer3;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setRAnswer(String RAnswer) {
        this.RAnswer = RAnswer;
    }

    public void setWAnswer1(String WAnswer1) {
        this.WAnswer1 = WAnswer1;
    }

    public void setWAnswer2(String WAnswer2) {
        this.WAnswer2 = WAnswer2;
    }

    public void setWAnswer3(String WAnswer3) {
        this.WAnswer3 = WAnswer3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
