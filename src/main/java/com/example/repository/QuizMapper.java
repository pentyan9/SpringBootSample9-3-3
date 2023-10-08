package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.quiz.model.MQuiz;

@Mapper
public interface QuizMapper {

	/** ユーザー取得 */
	public List<MQuiz> findMany();
	
	/** ユーザー取得(1件) */
	public MQuiz findOne(Integer id);
}
