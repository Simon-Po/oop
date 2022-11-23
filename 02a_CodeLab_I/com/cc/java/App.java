package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        out("Konto Nr1 :" +  String.valueOf(konto1.getKontostand()));
        out("Konto Nr2 :" +  String.valueOf(konto2.getKontostand()));
        out("Konto Nr3 :" +  String.valueOf(konto3.getKontostand()));
        
        konto1.setKontostand(konto1.getKontostand() * 2);
        konto2.setKontostand(konto2.getKontostand() * 3);
        konto3.setKontostand(konto3.getKontostand() * 10);
        
        out("Konto Nr1 :" +  String.valueOf(konto1.getKontostand()));
        out("Konto Nr2 :" +  String.valueOf(konto2.getKontostand()));
        out("Konto Nr3 :" +  String.valueOf(konto3.getKontostand()));

    }

    public static void out(String outputStr) {
        System.out.println(outputStr);
    }

}

