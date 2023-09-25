package com.jay.animequiz.model.repository;

import com.jay.animequiz.model.QuestionModel;

import java.util.HashSet;
import java.util.List;


public interface QuestionDataSource {
    List<QuestionModel> generateRandomList(HashSet<Integer> randomSet);
}
