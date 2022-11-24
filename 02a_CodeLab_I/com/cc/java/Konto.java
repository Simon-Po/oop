package com.cc.java;

public class Konto {

    private int kontostand;

    public Konto(int kStand) {
      this.kontostand = kStand;
    }

    public Konto(){
        this.kontostand = 10_000;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
}

