package com.cc.java;
public class Bird implements Flyable,IFeathers {

    @Override
    public String fly() {
        return "i am a bird, i can fly !";
    }

    @Override
    public boolean hasFeathers() {
        // TODO Auto-generated method stub
        return false;
    }
    
}
