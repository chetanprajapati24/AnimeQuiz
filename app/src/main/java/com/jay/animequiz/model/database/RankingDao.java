package com.jay.animequiz.model.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.jay.animequiz.model.RankingModel;

import java.util.List;


@Dao
public
interface RankingDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void saveRanking(RankingModel ranking);
    @Query("select * from  ranking_table order by points desc limit 10")
    List<RankingModel> getRanking();
}
