package com.Marian.dhondt;

import java.util.ArrayList;
import java.util.Collections;

public class Eleccions {

    private int esconsARepartir;
    private int votsTotals;
    private int votsMinims;
    private float percentatge;
    private ArrayList<Partit> llistaPartits;


    public void iniciaEleccions(int escons, int percentatge) {

        this.esconsARepartir = escons;
        this.percentatge = (float) percentatge/100;
        this.llistaPartits = new ArrayList<Partit>();

    }
    public void ferEleccions(){
        calcularVotsMinims();
        partitsQueTendranEscons();
        aplicarLleiDhont();
        calculHondt();
    }

    public int getEsconsARepartir() {
        return esconsARepartir;
    }

    public void setEsconsARepartir(int esconsARepartir) {
        this.esconsARepartir = esconsARepartir;
    }

    public int getVotsTotal() {
        return votsTotals;
    }

    public void setVotsTotal(int votsTotal) {
        this.votsTotals = votsTotal;
    }

    public float getPercentatge() {
        return percentatge;
    }

    public void setPercentatge(float percentatge) {
        this.percentatge = percentatge;
    }

    public ArrayList<Partit> getLlistaPartits() {
        return llistaPartits;
    }

    public void setLlistaPartits(ArrayList<Partit> llistaPartits) {
        this.llistaPartits = llistaPartits;
    }

    public void afegirPartit(Partit partit){

        boolean partitRepetit = false;

        for (int i = 0; i < llistaPartits.size(); i++) {

            partitRepetit = (llistaPartits.get(i) == partit);
        }
        if (!partitRepetit){
            llistaPartits.add(partit);
        }
    }

    public void eliminarPartit(Partit partit){

        llistaPartits.remove(partit);
    }

    private void calcularVotsMinims(){

        for (int i = 0; i < llistaPartits.size(); i++) {

            votsTotals += llistaPartits.get(i).getVots();
        }
        votsMinims = (int)(votsTotals*percentatge);
    }

    private void partitsQueTendranEscons(){

        for (int i = 0; i < llistaPartits.size(); i++) {

            llistaPartits.get(i).setTeVotsMinims(llistaPartits.get(i).getVots() > votsMinims);
        }
    }

    private void aplicarLleiDhont(){

        for (int i = 0; i < llistaPartits.size(); i++) {

            if (llistaPartits.get(i).isTeVotsMinims()){

                for (int j = 0; j < esconsARepartir; j++) {

                    llistaPartits.get(i).setVotsLleiDhont(llistaPartits.get(i).getVots()/(j+1));
                }
            }
        }
    }

    private void calculHondt(){

        for (int i = 0; i < esconsARepartir; i++) {

            int numMajor = 0;
            int index = 0;

            for (int j = 0; j < llistaPartits.size(); j++) {

                if(llistaPartits.get(j).isTeVotsMinims() && llistaPartits.get(j).getVotsLleiDhont(llistaPartits.get(j).getEsconsAssignats()) > numMajor){

                    numMajor = llistaPartits.get(j).getVotsLleiDhont(llistaPartits.get(j).getEsconsAssignats());
                    index = j;
                }
            }
            llistaPartits.get(index).setEsconsAssignats(1);
        }
    }

    public void resultatEleccions(){

        for (int i = 0; i < llistaPartits.size(); i++) {

            System.out.println("El " + llistaPartits.get(i).getNom() + " a obtinguts " + llistaPartits.get(i).getVots() + " vots en total, i " + llistaPartits.get(i).getEsconsAssignats() + " escons");
        }
    }
}
