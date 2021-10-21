package com.Marian.Exercici6Arrays.ClassePila;

import java.util.ArrayList;

public class Pila {

    private ArrayList<Integer> stackNumbers = new ArrayList<Integer>();
    int size = 0;

    public Pila(){}

    public void addNumberStack(int num){

       stackNumbers.add(num);
       size++;
    }
    public void removeNumberStack(){

        stackNumbers.remove(size-1);
    }

    public int seeNumber(int index){

        return stackNumbers.get(index);
    }
    public int sizeStack(){

        return stackNumbers.size();
    }
    public void printStack(){

        for (int n:stackNumbers) {

            System.out.println(n);

        }
    }
}
