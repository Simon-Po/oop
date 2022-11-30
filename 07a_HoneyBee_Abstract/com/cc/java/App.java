
package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        HoneyBee worker = new Worker();
        HoneyBee queen = new Queen(); 
        HoneyBee drone = new Drone(); 

        output(worker.doYourJob());
        output(queen.doYourJob());
        output(drone.doYourJob());

        // Das sollte eigentlich nicht gehen!
        HoneyBee bee = new HoneyBee();
        output(bee.doYourJob());


        output("-----------------");

        output(worker.fly());
        output(queen.fly());
        output(drone.fly());





    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

