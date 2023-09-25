package com.jay.animequiz.model.di;

import android.app.Application;

import androidx.room.Room;

import com.jay.animequiz.model.database.RankingDB;
import com.jay.animequiz.model.repository.RankingDataSource;
import com.jay.animequiz.model.repository.RankingDataSourceImpl;
import com.jay.animequiz.model.repository.QuestionDataSource;
import com.jay.animequiz.model.repository.QuestionDataSourceImpl;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;


@Module
@InstallIn(SingletonComponent.class)
public class AppModule {
    @Provides
    @Singleton
    RankingDB databaseProvider(Application app){
        return Room.databaseBuilder(app, RankingDB.class,"ranking_table").build();
    }
    @Provides
    RankingDataSource localDataSourceProvider(RankingDB db) {return new RankingDataSourceImpl(db);}

    @Provides

    QuestionDataSource questionProvider(){ return new QuestionDataSourceImpl();}


}
