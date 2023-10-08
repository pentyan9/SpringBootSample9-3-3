package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.quiz.model.MQuiz;
import com.example.domain.quiz.service.QuizService;

@Controller
@RequestMapping("/quiz")
public class QuizListController {

    @Autowired
    private QuizService quizService;

    /** ユーザー一覧画面を表示 */
    @GetMapping("/list")
    public String getQuizList( Model model) {
        // ユーザー検索
        List<MQuiz> quizList = quizService.getQuiz();

        // Modelに登録
        model.addAttribute("quizList", quizList);

        // ユーザー一覧画面を表示
        return "quiz/list";
    }

    /** ユーザー検索処理 */
    @PostMapping("/list")
    public String postQuizList(Model model) {
        // ユーザー検索
        List<MQuiz> quizList = quizService.getQuiz();

        // Modelに登録
        model.addAttribute("quizList", quizList);

        // ユーザー一覧画面を表示
        return "quiz/list";
    }
}
