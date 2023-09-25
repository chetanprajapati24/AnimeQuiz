package com.jay.animequiz.viewModel;

import com.jay.animequiz.model.repository.QuestionRepository;
import com.jay.animequiz.model.repository.RankingDataSource;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;


@Module
@InstallIn(ViewModelComponent.class)
public class MainModuleProvider {
    @Provides
    @ViewModelScoped
    GetProviders getMainProviders(QuestionRepository questionRepository, RankingDataSource rankingDataSource){
        return new GetProviders(questionRepository,rankingDataSource);
    }
}
