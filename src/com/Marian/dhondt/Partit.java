package com.Marian.dhondt;

import java.util.ArrayList;

public class Partit {

    private String nom;
    private int vots;
    private int esconsAssignats;
    private boolean teVotsMinims;
    private ArrayList<Integer> votsLleiDhont;

    public Partit() {
    }

    public Partit(String nom, int vots) {

        this.nom = nom;
        this.vots = vots;
        votsLleiDhont = new ArrayList<Integer>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getVots() {
        return vots;
    }

    public void setVots(int vots) {
        this.vots = vots;
    }

    public int getEsconsAssignats() {
        return esconsAssignats;
    }

    public void setEsconsAssignats(int esconsAssignats) {
        this.esconsAssignats += esconsAssignats;
    }

    public boolean isTeVotsMinims() {
        return teVotsMinims;
    }

    public void setTeVotsMinims(boolean teVotsMinims) {
        this.teVotsMinims = teVotsMinims;
    }

    public int getVotsLleiDhont(int index) {
        return votsLleiDhont.get(index);
    }

    public void setVotsLleiDhont(int vot) {
        votsLleiDhont.add(vot);
    }


    @Override
    public String toString() {
        return "Partit{" +
                "nom='" + nom + '\'' +
                ", vots=" + vots +
                ", escons=" + esconsAssignats +
                ", teVotsMinims=" + teVotsMinims +
                '}';
    }
}