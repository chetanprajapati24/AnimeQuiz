package com.jay.animequiz.viewModel;

import androidx.lifecycle.MutableLiveData;

import com.jay.animequiz.model.QuestionModel;
import com.jay.animequiz.model.RankingModel;
import com.jay.animequiz.model.repository.QuestionRepository;
import com.jay.animequiz.model.repository.RankingDataSource;

import java.util.HashSet;
import java.util.List;


public class GetProviders {
    private final QuestionRepository questionRepository;
    private final RankingDataSource rankingDataSource;
    public GetProviders(QuestionRepository questionRepository, RankingDataSource rankingDataSource){
        this.questionRepository=questionRepository;
        this.rankingDataSource=rankingDataSource;
    }
    public void saveRanking(RankingModel ranking){rankingDataSource.saveRanking(ranking);}
    public void callRanking(){rankingDataSource.callRanking();}
    public MutableLiveData<List<RankingModel>> getRanking(){return rankingDataSource.getRanking();}
    public MutableLiveData<QuestionModel> getQuestionRandom(HashSet<Integer> randomSet){return questionRepository.getRandomQuestions(randomSet);}
}
