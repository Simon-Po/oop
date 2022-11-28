package com.cc.java;
public class App {
    public static void main(String[] args) {
    
        Player player = new Player();

        for (int i = 0; i < 12; i++) {
            ausgabe(player.play());  
        }

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
