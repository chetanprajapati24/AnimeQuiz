package com.jay.animequiz.model.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.jay.animequiz.model.RankingModel;


@Database(entities = {RankingModel.class}, version=1)
public abstract class RankingDB extends RoomDatabase {
    public abstract RankingDao rankingDao();
}
