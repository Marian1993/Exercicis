package com.Marian.ExercicicTaller1A;

public class Obra {

    String tittle;
    String thematic;
    int pages;

    public Obra (){}

    public Obra(String tittle, String thematic, int pages){

        tittle = this.tittle;
        thematic = this.thematic;
        pages = this.pages;
    }

    public String getTittle() {return tittle;}

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getThematic() {
        return thematic;
    }

    public void setThematic(String thematic) {
        this.thematic = thematic;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
