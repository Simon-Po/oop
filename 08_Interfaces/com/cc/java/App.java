
package com.cc.java;

import com.cc.java.bees.*;
import com.cc.java.birds.*;

public class App {
    
    public static void main(String[] args) {
    
        Worker worker = new Worker();
        Queen queen = new Queen(); 
        Drone drone = new Drone(); 
        Bird bird = new Bird();

        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());
       

        output("-----------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());
        output(bird.fly());




    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

