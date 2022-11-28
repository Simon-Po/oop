package com.cc.java;

public class Level_2 extends Level_3{
    
    private String levelName = "Level 2";
    private int levelPoints= 10;

    protected String play(){
     
      if (points < this.levelPoints) {
          points++;
          return "Yahoo, " + levelName + " here, and I have " + points + " points!";
      } else {
          return super.play();
      }
  }


  
}
