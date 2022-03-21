package com.Marian.Practica12;

import java.util.ArrayList;

public class SkilledEmployee extends Employee {

    private ArrayList skillList;

    public SkilledEmployee (int id, String nom, String titol, int nivell, ArrayList skillList){

        super(id, nom, titol, nivell);

        this.skillList = skillList;
    }

    public ArrayList getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList skill) {
        skillList.add(skill);
    }

    @Override
    public void print() {

        super.print();
        System.out.println("Llista d'habilitats': ");

        for (int i = 0; i < skillList.size(); i++) {

            System.out.println(skillList.get(i));
        }


    }
}
