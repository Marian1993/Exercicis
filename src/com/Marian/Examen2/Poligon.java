package com.Marian.Examen2;

public class Poligon{

    private Punt[] poligon;
    private double[] distancia;

    public Poligon(Punt[] poligon){

        this.poligon = poligon;
        distancia = new double[poligon.length];
    }

    public void calcularPerimetrePoligon(){

        for (int i = 0; i < poligon.length; i++) {

            if( (i+1) < poligon.length ){
                distancia[i] = new Punt(poligon[i].getY(),poligon[i].getX()).calcularDistancia(poligon[i+1]);
            }else {
                distancia[i] = new Punt(poligon[i].getY(),poligon[i].getX()).calcularDistancia(poligon[0]);
            }
        }
        for (double d:distancia) {

            System.out.println(d);
        }
    }

}
