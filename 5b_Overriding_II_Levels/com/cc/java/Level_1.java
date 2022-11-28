package com.cc.java;

public class Level_1 extends Level_2{

    private String levelName = "Level 1";
    private int levelPoints = 5;

    protected String play(){
       
        if (points < this.levelPoints) {
            points++;
            return "Yahoo, " + levelName + " here, and I have " + points + " points!";
        } else {
            return super.play();
        }
    }

    
}
