package com.Marian.Practica12;

import java.util.ArrayList;

public class Editor extends SkilledEmployee {

    private String preferEditing;

    public Editor(int id, String nom, String titol, int nivell, ArrayList skillList, String preferEditing){

        super(id, nom, titol, nivell, skillList);

        this.preferEditing = preferEditing;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(preferEditing);
    }
}
