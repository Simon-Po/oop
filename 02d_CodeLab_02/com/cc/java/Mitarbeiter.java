package com.cc.java;

public class Mitarbeiter {

    private String name;
    private String surname;
    private String funktion;
    private int startingYear;

    public Mitarbeiter(String name, String surname, String funktion, int startingYear) {
        this.name = name;
        this.surname = surname;
        this.funktion = funktion;
        this.startingYear = startingYear;
    }

    public String getInfo(String infoFlag) {
        switch (infoFlag) {
            case "name":
                return this.getName();
            case "surname":
                return this.getSurname();
            case "role":
                return this.getFunktion();
            case "starting":
                return String.valueOf(this.getStartingYear());
            default:
                return "Error: Plese enter a valid flag: \n\t\t'name': the name of the worker\n\t\t'surname': the surname of the worker"
                        + "\n\t\t'role': the Role the Worker has in this company \n\t\t'starting': the year the worker started in\nPlease choose one of these flags and use them as the argument when calling the getInfo() method";
        }
    }

    public String getInfo(){
        return String.format("%s %s works as %s since %d ", this.getSurname(),this.getName(),this.getFunktion(),this.getStartingYear());
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    private int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

}
