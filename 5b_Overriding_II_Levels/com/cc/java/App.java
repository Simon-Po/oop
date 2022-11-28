package com.cc.java;
public class App {
    public static void main(String[] args) {
    
        Player player = new Player();

        while (player.getPoints() <= 12) {
            ausgabe(player.play());  
        }

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
