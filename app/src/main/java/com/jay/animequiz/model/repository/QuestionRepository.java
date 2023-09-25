package com.jay.animequiz.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.jay.animequiz.model.QuestionModel;

import java.util.HashSet;


public interface QuestionRepository {
     MutableLiveData<QuestionModel> getRandomQuestions(HashSet<Integer> randomSet);
}
