package com.cc.java;

public class Level_2 extends Level_3{
    
    private String levelName = "Level 2";
    private int levelPoints= 10;

    protected String play(){
     
      if (super.getPoints() < this.levelPoints) {
          super.setPoints(super.getPoints() + 1);
          return "Yahoo, " + levelName + " here, and I have " + super.getPoints() + " points!";
      } else {
          return super.play();
      }
  }


  
}
