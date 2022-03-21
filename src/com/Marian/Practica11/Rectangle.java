package com.Marian.Practica11;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle(){
        width = 25;
        height = 10;

        System.out.println("width= " + width + " height= " + height);
    }
    public Rectangle(int w, int h){

        if(w > 0 && w < 30 && h > 0 && h < 30){

            width = w;
            height = h;

            System.out.println("width= " + width + " height= " + height);

        }else {
            System.out.println("El parametres no son els adecuats, han de ser entre 1 i 29");
        }
    }
    public int getArea(){
        return width*height;
    }
    public void displayRectangle(){

        for (int i = 0; i < getArea(); i++) {

            if(i%width == 0){
                System.out.println();
            }
            System.out.print("*");
        }
    }

}
