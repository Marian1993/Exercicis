package com.Marian.ExerciciPractica;

import java.util.ArrayList;

public class Alumne {

    private String name;
    private int age;
    private int identifier;
    private ArrayList<Integer> notes = new ArrayList<Integer>();

    public Alumne( String name, int age, int identifier, ArrayList<Integer> notes){

        this.name = name;
        this.age = age;
        this.identifier = identifier;
        this.notes = notes;
    }
    public Alumne(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdentifier() {
        return identifier;
    }

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public ArrayList<Integer> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList<Integer> notes) {
        this.notes = notes;
    }

    public double medianNote() {

        int total = 0;

        for (int i = 0; i <this.notes.size() ; i++) {

            total += this.notes.get(i);
        }

        return total/this.notes.size();
    }



}
