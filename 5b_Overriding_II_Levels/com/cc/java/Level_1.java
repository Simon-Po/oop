package com.cc.java;

public class Level_1 extends Level_2{

    private String levelName = "Level 1";
    private int levelPoints = 5;

    protected String play(){
       
        if (super.getPoints() < this.levelPoints) {
            super.setPoints(super.getPoints() +1 );;
            return "Yahoo, " + levelName + " here, and I have " + super.getPoints() + " points!";
        } else {
            return super.play();
        }
    }

    
}
