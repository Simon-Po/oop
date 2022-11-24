package com.cc.java;



public class App {
    
    public static void main(String[] args) {
        Mitarbeiter m1 = new Mitarbeiter("Pohl", "Simon", "IT", 2022);
        Mitarbeiter m2 = new Mitarbeiter("Paul", "Peter", "Cleaning personel", 2014);
        Mitarbeiter m3 = new Mitarbeiter("Lisa", "Michel", "Marketing advisor", 2020);
        
        
        
        
        output(m1.getInfo("name"));
        output(m2.getInfo("starting"));
        output(m3.getInfo("role"));
        output("\n");
        output(m1.getInfo());
        output(m2.getInfo());
        output(m3.getInfo());



    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

