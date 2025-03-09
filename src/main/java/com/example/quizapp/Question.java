package com.example.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Builder;
import jakarta.persistence.*;

@Builder
@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String questionTitle; // Lombok generates setQuestionTitle()
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
}