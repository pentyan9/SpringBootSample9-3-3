package com.example.form;

import lombok.Data;

@Data
public class QuizDetailForm {
    private Integer id;
    private String question;
    private String answer;
    private String author;
}