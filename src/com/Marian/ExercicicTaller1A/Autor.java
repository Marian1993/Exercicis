package com.Marian.ExercicicTaller1A;

import java.util.ArrayList;

public class Autor {

    String name;
    ArrayList<Obra> workList = new ArrayList<Obra>();

    public Autor(String name, ArrayList<Obra> workList){

        name = this.name;
        workList = this.workList;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Obra> getWorkList() {
        return workList;
    }

    public void setWorkList(ArrayList<Obra> workList) {
        this.workList = workList;
    }

    public Obra longerWork(){

        int lenght = 0;
        Obra obra = new Obra();

        for (int i = 0; i < this.workList.size(); i++) {
            if(this.workList.get(i).getPages() > lenght){
                lenght = this.workList.get(i).getPages();
                obra = this.workList.get(i);
            }
        }
        return obra;
    }
}
