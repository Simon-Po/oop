package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();
        out("Blick von außen: " + cat);
        cat.tellYourAddress();
        out("--------------------------");
        Cat cat1 = new Cat();
        cat1.tellYourAddress();
        App.tellYourAddress();
        
        

    }



    public static void out(String outputStr) {
        System.out.println(outputStr);
    }

    public static void tellYourAddress(){
        System.out.println("Hallo");
    }

}

