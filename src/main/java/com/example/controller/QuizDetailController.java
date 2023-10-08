package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.quiz.model.MQuiz;
import com.example.domain.quiz.service.QuizService;
import com.example.form.QuizDetailForm;

@Controller
@RequestMapping("/quiz")
public class QuizDetailController {

    @Autowired
    private QuizService quizService;

    @Autowired
    private ModelMapper modelMapper;

    /** ユーザー詳細画面を表示 */
    @GetMapping("/detail/{id}")
    public String getUser(QuizDetailForm form, Model model, @PathVariable("id") Integer id) {

        // ユーザーを1件取得
        MQuiz quiz = quizService.getQuizOne(id);

        // MQuizをformに変換
        form = modelMapper.map(quiz, QuizDetailForm.class);

        // Modelに登録
        model.addAttribute("quizDetailForm", form);

        // ユーザー詳細画面を表示
        return "quiz/detail";
    }

//    /** ユーザー更新処理 */
//    @PostMapping(value = "/detail", params = "update")
//    public String updateUser(UserDetailForm form, Model model) {
//
//        // ユーザーを更新
//        userService.updateUserOne(form.getUserId(),
//                form.getPassword(),
//                form.getUserName());
//
//        // ユーザー一覧画面にリダイレクト
//        return "redirect:/user/list";
//    }
//
//    /** ユーザー削除処理 */
//    @PostMapping(value = "/detail", params = "delete")
//    public String deleteUser(UserDetailForm form, Model model) {
//
//        // ユーザーを削除
//        userService.deleteUserOne(form.getUserId());
//
//        // ユーザー一覧画面にリダイレクト
//        return "redirect:/user/list";
//    }
}
