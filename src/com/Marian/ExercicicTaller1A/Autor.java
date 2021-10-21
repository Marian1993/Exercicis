package com.Marian.ExercicicTaller1A;

import java.util.ArrayList;

public class Autor {

    String name;
    ArrayList<Obra> workList = new ArrayList<Obra>();

    public Autor(String name, ArrayList<Obra> workList){

        name = this.name;
        workList = this.workList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Obra> getWorkList() {
        return workList;
    }

    public void setWorkList(ArrayList<Obra> workList) {
        this.workList = workList;
    }
}
