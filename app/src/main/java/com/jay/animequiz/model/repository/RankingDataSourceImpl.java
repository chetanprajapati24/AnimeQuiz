package com.jay.animequiz.model.repository;

import androidx.lifecycle.MutableLiveData;

import com.jay.animequiz.model.RankingModel;
import com.jay.animequiz.model.database.RankingDB;
import com.jay.animequiz.model.database.RankingDao;

import java.util.List;


public class RankingDataSourceImpl implements RankingDataSource {
    private final  RankingDao rankingDao;
    private final MutableLiveData<List<RankingModel>> rankingList= new MutableLiveData<>();
    public RankingDataSourceImpl(RankingDB db) {
        this.rankingDao=  db.rankingDao();
    }

    @Override
    public void saveRanking(RankingModel ranking) {
        rankingDao.saveRanking(ranking);
    }

    @Override
    public void callRanking() {
        rankingList.postValue(rankingDao.getRanking());
    }

    @Override
    public MutableLiveData<List<RankingModel>> getRanking() {
        return rankingList;
    }
}
