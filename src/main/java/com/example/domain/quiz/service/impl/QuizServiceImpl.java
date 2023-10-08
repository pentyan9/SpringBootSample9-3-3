package com.example.domain.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.quiz.model.MQuiz;
import com.example.domain.quiz.service.QuizService;
import com.example.repository.QuizMapper;

@Service
public class QuizServiceImpl implements QuizService {

    @Autowired
    private QuizMapper mapper;

	@Override
	public List<MQuiz> getQuiz() {
		return mapper.findMany();
	}

	@Override
	public MQuiz getQuizOne(Integer id) {
		return mapper.findOne(id);
	}

}
