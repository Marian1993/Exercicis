package com.Marian.ExerciciTaller1B;

import java.util.ArrayList;

public class Cinema {

    private String name;
    private int nRooms;
    private ArrayList<Pelicula> films = new ArrayList<Pelicula>();

    public Cinema(String name, int nRooms, ArrayList<Pelicula> films){

        this.name = name;
        this.nRooms = nRooms;
        this.films = films;
    }
    public Cinema(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getnRooms() {
        return nRooms;
    }

    public void setnRooms(int nRooms) {
        this.nRooms = nRooms;
    }

    public ArrayList<Pelicula> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Pelicula> films) {
        this.films = films;
    }

    public Pelicula longerFilm(){

        int lenght = 0;
        Pelicula pelicula=null;// = new Pelicula();

        for (int i = 0; i < this.films.size(); i++) {

            if(this.films.get(i).getDuration() > lenght){

                lenght = this.films.get(i).getDuration();
                pelicula = this.films.get(i);
            }
        }
        return pelicula;
    }

}
