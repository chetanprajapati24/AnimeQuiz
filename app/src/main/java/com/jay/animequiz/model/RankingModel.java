package com.jay.animequiz.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "ranking_table")
public class RankingModel {
    @PrimaryKey(autoGenerate = true) private int id;
    private String namePlayer;
    private int points;

    public RankingModel(String namePlayer, int points){
        this.id=0;
        this.namePlayer= namePlayer;
        this.points=points;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
