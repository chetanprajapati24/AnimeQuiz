package com.jay.animequiz.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jay.animequiz.model.RankingModel;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class RankingViewModel extends ViewModel {
    private final GetProviders provider;
    @Inject
    public RankingViewModel(GetProviders getProviders){
        this.provider=getProviders;
    }

    public void saveRanking(RankingModel ranking){
        provider.saveRanking(ranking);
    }
    public void callRanking(){provider.callRanking();}
    public MutableLiveData<List<RankingModel>> getRanking(){
        return provider.getRanking();
    }
}
