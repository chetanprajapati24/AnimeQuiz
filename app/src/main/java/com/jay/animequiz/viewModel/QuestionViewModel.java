package com.jay.animequiz.viewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.jay.animequiz.model.QuestionModel;

import java.util.HashSet;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;


@HiltViewModel
public class QuestionViewModel extends ViewModel {
    private final GetProviders provider;
    @Inject
    public QuestionViewModel(GetProviders getProviders){
        this.provider=getProviders;
    }

    public MutableLiveData<QuestionModel> getQuestionRandom(HashSet<Integer> randomSet){
        return provider.getQuestionRandom(randomSet);
    }
}
