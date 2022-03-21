package com.Marian.Examen2;

public class MultiplicacioMatrius {

    private static int[][] A = {{1,0,0},{3,4,2}};
    private static int[][] B = {{2,1},{0,3},{1,0}};

    public static void multiplicarArrays() throws IllegalArgumentException{

        int[][] resultat = new int[A.length][A.length];

        for (int i = 0; i < A.length; i++) {


            for (int j = 0; j < A.length; j++) {

                int total = 0;

                for (int z = 0; z < B.length; z++) {

                    if(A[i].length != B.length){

                        throw new IllegalArgumentException("Un dels arrays no compleix amb la llargaria demanada");
                    }
                    total += (A[j][z] * B[z][i]);

                }

                resultat[j][i] = total;
            }
        }
        for (int[] a:resultat) {

            for (int b:a) {

                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
