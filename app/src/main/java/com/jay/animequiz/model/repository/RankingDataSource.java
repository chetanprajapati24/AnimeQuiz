package com.jay.animequiz.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.jay.animequiz.model.RankingModel;

import java.util.List;


public interface RankingDataSource {
    void saveRanking(RankingModel ranking);
    void callRanking();
    MutableLiveData<List<RankingModel>> getRanking();
}
