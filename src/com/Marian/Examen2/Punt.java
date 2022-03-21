package com.Marian.Examen2;

public class Punt {

    private double y;
    private double x;

    public Punt(double y, double x){

        this.y = y;
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double calcularDistancia(Punt p){

        double difY = Math.abs(p.y - getY());
        double difX = Math.abs(p.x - getX());

        return Math.sqrt((difY * 2) + (difX *2));
    }

    public double translladarICalcular(Punt p){

        setY(0);
        setX(0);
        return calcularDistancia(p);
    }

}
