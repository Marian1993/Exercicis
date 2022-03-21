package com.Marian.ExamenProva;

import java.util.Scanner;

public class Exercicis {

    public static void arithmeticMedian(){

        Scanner sc = new Scanner(System.in);

        int [] num = {2,6,7,1,9,0,2};
        int total = 0;

        for (int i = 0; i < num.length; i++) {

            total += num[i];
        }
        double mitjana = (double) total/ num.length;

        System.out.println(mitjana);
    }

    public static void minValue(){

        int [] num = {2,6,7,1,9,4,2};
        int aux = num[0];

        for (int n:num) {
            if(aux > n)
                aux = n;
        }
        System.out.println(aux);
    }
    public static void indexMinValue(){

        int [] num = {2,6,7,1,9,4,2};
        int aux = num[0];
        int index = 0;

        for (int i = 0; i < num.length; i++) {

            if(aux > num[i]){
                aux = num[i];
                index = i;
            }

        }
        System.out.println(index);
    }
    public static void maxValue(){

        int [] num = {2,6,7,1,9,4,2};
        int aux = num[0];

        for (int n:num) {
            if(aux < n)
                aux = n;
        }
        System.out.println(aux);
    }
    public static void indexMaxValue(){

        int [] num = {2,6,7,1,9,4,2};
        int aux = num[0];
        int index = 0;

        for (int i = 0; i < num.length; i++) {

            if(aux < num[i]){
                aux = num[i];
                index = i;
            }

        }
        System.out.println(index);
    }
    public static void ascOrDes(){

        int [] num = {1,2,3,4,5,6};
        int aux = 0;
        boolean asc = false;
        boolean des = false;

        for (int i = 1; i < num.length; i++) {

            if (num[i] - num[i - 1] > 0) asc = true;

            if (num[i] - num[i - 1] < 0) des = true;
        }

        if (!asc && des) System.out.println("descending");
        else if (asc && !des) System.out.println("ascending");
        else System.out.println("Ninguna de las dos");
    }

    public static void indexascOrDes(){

        int [] num = {1,2,3,4,5,6};
        int aux = 0;
        boolean asc = false;
        boolean des = false;

        for (int i = 2; i < num.length; i += 2) {

            if (num[i] - num[i - 2] > 0) asc = true;

            if (num[i] - num[i - 2] < 0) des = true;
        }

        if (!asc && des) System.out.println("descending");
        else if (asc && !des) System.out.println("ascending");
        else System.out.println("Ninguna de las dos");
    }

    public static void inversArray(){

        int [] num = {1,2,3,4,5,6};
        int aux = 0;
        int [] arrayIvers = new int[num.length];


        for (int i = num.length-1; i >= 0; i--) {

            arrayIvers[aux] = num[i];
            aux++;
        }
        for (int n:arrayIvers
             ) {
            System.out.println(n);
        }

    }
    public static void searchNumber(){

        int [] num = {2,6,7,1,9,4,2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Put a number: ");
        int aux = sc.nextInt();
        boolean found = false;
        int index = 0;

        for (int i = 0; i < num.length; i++) {

            if (aux == num[i]){
                found = true;
                index = i;
            }
        }
        System.out.println((found ? index : -1));
    }

    public static void proper(){

        int [] array = {2,6,7,1,9,4,2};
        int index = 0;
        int numproper = 0;
        int total = 0;

        for (int i = 0; i < array.length; i++) {

            total += array[i];
        }
        int mitjana = total/ array.length;

        for (int i = 0; i < array.length; i++) {

            int aux = array[i]-mitjana;

            if(aux < numproper){

                index = i;
                numproper = aux;
            }
        }
        System.out.println(array[index]);
    }


}
