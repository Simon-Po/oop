package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Cat cat = new Cat("Grizabella","white",29);
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));
        output(String.valueOf(cat.getAge()));
    
        output("------------------------");

       Cat cat1 = new Cat("Alonzo", "grey", 35);

       cat1.setFurColor("striped");

       output(cat1.getStringAttributes("#name"));
       output(cat1.getStringAttributes("#color"));
        output(String.valueOf(cat1.getAge()));

    }

    // Methode wird aus der KLASSE aufgerufen, daher static
    public static void output(String outputStr) {
        System.out.println(outputStr);
    }




}

