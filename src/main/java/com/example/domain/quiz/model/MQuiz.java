package com.example.domain.quiz.model;


import lombok.Data;

@Data
public class MQuiz {
    private Integer id;
    private String question;
    private String answer;
    private String author;
}
