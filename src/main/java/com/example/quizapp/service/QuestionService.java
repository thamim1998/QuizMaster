package com.example.quizapp.service;

import com.example.quizapp.Question;
import com.example.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category){
        System.out.println("Saving Question: ");
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {


        questionDao.save(question);
        return "Success";
    }
}
