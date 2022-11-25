package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat("Grizabbella","white",29);
        
        

        // out(cat.name);
        // out(cat.furColor);
        // out(String.valueOf(cat.age));

        out(cat.getName());
        out(cat.getFurColor());
        out(String.valueOf(cat.getAge()));

        // out("Blick von außen: " + cat);
        // cat.tellYourAddress();
        out("--------------------------");

        // Cat cat1 = new Cat();
        // cat1.name = "Alonzo";
        // cat1.furColor = "grey";
        // cat1.age = 35;

        
        // out(cat1.tellYourName());
        // out(cat1.tellYourFurColor());
        // out(String.valueOf(cat1.tellYourAge()));


    }



    public static void out(String outputStr) {
        System.out.println(outputStr);
    }

    public static void tellYourAddress(){
        System.out.println("Hallo");
    }

}

