package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(4, 12);
        Shape triangle = new Triangle(21, 10);
        output("------  Flächen ------");
        output("Fläche Rechteck: " + rectangle.area());
        output("Fläche Dreieck: " + triangle.area());
        output("Fläche Kreis: " + circle.area());


    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

