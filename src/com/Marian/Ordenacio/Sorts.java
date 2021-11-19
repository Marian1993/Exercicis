package com.Marian.Ordenacio;

public class Sorts {

    public static void selectionSort(){

        int[] selection = {5,1,12,-5,16,2,12,14};

        for (int i = 0; i < selection.length; i++) {

            int aux = selection[i];
            int position = 0;

            for (int j = i; j < selection.length; j++) {

                if(aux >= selection[j]){

                        aux = selection[j];
                        position = j;
                }
            }
            selection[position] = selection[i];
            selection[i] = aux;
        }
        for (int n:selection
             ) {
            System.out.println(n);
        }
    }
    public static void insertSort(){

        int[] selection = {5,2,4,6,1,3};

        for (int i = 1; i < selection.length; i++) {

            int aux = selection[i];
            int position = i-1;

            while((position>-1) && (selection[position]>aux)){
                selection[position+1] = selection[position];
                position--;
            }
            selection[position+1] = aux;

        }
        for (int n:selection
        ) {
            System.out.println(n);
        }
    }
}
