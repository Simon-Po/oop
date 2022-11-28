package com.cc.java;

public class Level_3 {
    
    private String levelName = "Level 3";
    private int points;

    protected String play(){
        points++;
        return "Yahoo, " + levelName + " here, and I have " + points + " points!";
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

}
