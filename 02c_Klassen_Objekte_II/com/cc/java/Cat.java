package com.cc.java;

public class Cat {
 
   private String name;
   private String furColor;
   private int age;
   private boolean isFemale;



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
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getAge() {

        if (isFemale) {
            return "!#NO!!#";
        } else {
            return String.valueOf(age);
        }
    }
    public void setAge(int age) {
        this.age = age;
    }    
}
