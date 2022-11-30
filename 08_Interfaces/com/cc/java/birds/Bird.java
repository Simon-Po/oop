package com.cc.java.birds;


import com.cc.java.interfaces.*;

public class Bird  implements Flyable,IFeathers {



    @Override
    public boolean hasFeathers() {
        return true;
    }

    @Override
    public String fly() {
        return "I'm a bird, I can also fly!";
    }
    
}
