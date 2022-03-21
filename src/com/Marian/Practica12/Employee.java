package com.Marian.Practica12;

public class Employee implements Printable{

    protected  static int contadorIdTreballador = 0;
    private int idTreballador;
    private String nom;
    private String titol;
    private int nivell;

    public Employee(int id, String nom, String titol, int nivell){

        this.idTreballador = id;
        this.nom = nom;
        this.titol = titol;
        this.nivell =nivell;

    }

    public int getIdTreballador() {
        return idTreballador;
    }

    public void setIdTreballador(int idTreballador) {
        this.idTreballador = idTreballador;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getNivell() {
        return nivell;
    }

    public void setNivell(int nivell) {
        this.nivell = nivell;
    }

    public void print(){
        System.out.println("ID = " + this.idTreballador);
        System.out.println("Nom = " + this.nom);
        System.out.println("Titol = " + this.titol);
        System.out.println("Nivell = " + this.nivell);

    }

    public void calculadorIdTreballador(){
        contadorIdTreballador++;
        setIdTreballador(contadorIdTreballador);
    }

}
