package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private boolean isFemale;
   private int counter;


    public Cat(String name, String furColor, int age, boolean isFemale) {
    this.name = name;
    this.furColor = furColor;
    this.age = age;
    this.isFemale = isFemale;
}
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "ERROR: Could not find value";
        }

      
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getAge() {

        if (isFemale) {
            return checkEscelationLevel();
        } else {
            return String.valueOf(age);
        }
    }
    public void setAge(int age) {
        this.age = age;
    }    
    
    private String checkEscelationLevel(){
        this.counter++;
        switch (this.counter) {
            case 1:   
                return "This is an inapropriate question!";
            case 2:
                return "I've told you once!";
            case 3:
                return "Talk to the hand!";
            default:
                return "!###!##!";
        }
    }


}
