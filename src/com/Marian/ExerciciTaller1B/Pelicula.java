package com.Marian.ExerciciTaller1B;

public class Pelicula {

    private String tittle;
    private int duration;
    private String director;

    public Pelicula(String tittle, int duration, String director){

        this.tittle = tittle;
        this.duration = duration;
        this.director = director;
    }

    public Pelicula(){}

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
