package com.cc.java.birds;

import com.cc.java.bees.HoneyBee;

public class Bird extends HoneyBee{

    @Override
    public String doYourJob() {
        return "But I'm a bird!!!!!!";
    }

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }
    
}
