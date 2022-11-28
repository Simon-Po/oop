package com.cc.java;

public class SuperCat {
    private String name;
    private String furColor;
    protected int age;
    public SuperCat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!ERROR";
        }
    }
    public String getAge() {
        return String.valueOf(age);
    }

    


    
}
