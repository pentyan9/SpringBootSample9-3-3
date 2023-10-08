package com.example.domain.quiz.service;

import java.util.List;

import com.example.domain.quiz.model.MQuiz;

public interface QuizService {

    /** ユーザー取得 */
    public List<MQuiz> getQuiz();

    /** ユーザー取得1件 */
	public MQuiz getQuizOne(Integer id); 

}
