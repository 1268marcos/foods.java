package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "food")
public class Food {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "foodId")
    private int id;
    @NonNull
    @ColumnInfo(name = "foodCreationDate")
    private String creationDate;
    @NonNull
    @ColumnInfo(name = "foodName")
    private String name;
    @NonNull
    @ColumnInfo(name = "foodLocation")
    private String location;
    @NonNull
    @ColumnInfo(name = "foodScore")
    private int score;

    public Park (String creationDate, String name, String location, int score) {
        this.creationDate = creationDate;
        this.name = name;
        this.location = location;
        this.score = score;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCreationDate() {
        return this.creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    public int getScore() {
        return this.score;
    }
    public void setScore(int score) {
        this.score = score;
    }





