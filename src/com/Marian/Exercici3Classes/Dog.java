package com.Marian.Exercici3Classes;

public class Dog {
    private String name;
    private int age;
    private String race;
    private int vaccineNumber;
    private boolean pedigree;

    //Contructors

    public Dog(){}

    public Dog(String name, int age, String race, int vaccineNumber, boolean pedigree){

        this.name=name;
        this.age=age;
        this.race=race;
        this.vaccineNumber=vaccineNumber;
        this.pedigree=pedigree;
    }

    //Getters

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getRace() {
        return race;
    }
    public int getVaccineNumber() {
        return vaccineNumber;
    }
    public boolean isPedigree() {
        return pedigree;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setRace(String race) {
        this.race = race;
    }
    public void setVaccineNumber(int vaccineNumber){
        this.vaccineNumber=vaccineNumber;
    }
    public void setPedigree(boolean pedigree){
        this.pedigree=pedigree;
    }

    //Display
    public String display(){
        return "Dog{name= " + name + ", " + "age= " + age + ", " +
                "race= " + race + ", " + "vaccine number= " + vaccineNumber + ", " +
                "pedigree= " + pedigree + "}";
    }

    //Metodes

    public void newVaccine(){
        vaccineNumber += 1;
    }
}
