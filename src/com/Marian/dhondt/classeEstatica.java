package com.Marian.dhondt;

import java.util.Arrays;

public class classeEstatica {

    private static int[] votsPartits = {120000,100000,40000,5000,2500};
    private static double percentatgeMinim = 0.03;
    private static int escanys = 8;

    public static double calcularVotsMinims(){

        int total = 0;

        for (int a:votsPartits) {

            total += a;
        }
        return  total*percentatgeMinim;
    }

    public static int[] partitsQueTendranEscanys(){

        int numPartits = 0;

        for (int i = 0; i < votsPartits.length; i++) {

            if(votsPartits[i] > calcularVotsMinims())
                numPartits++;

        }
        int[] partitsSuperats = new int[numPartits];

        for (int i = 0; i < numPartits ; i++) {

            partitsSuperats[i] = votsPartits[i];
        }
        return partitsSuperats;
    }

    public static int [][] crearArrayBidimenalAmbDivisio(){

        int [][] numEscanys = new int[partitsQueTendranEscanys().length][escanys];

        for (int i = 0; i < numEscanys.length; i++) {

            int aux = 1;

            for (int j = 0; j < numEscanys[i].length; j++) {

                numEscanys[i][j] = partitsQueTendranEscanys()[i] / aux;
                aux++;
            }
        }
        return numEscanys;
    }

    public static int[] escanys(){

    int[] arrayEscanys = new int[partitsQueTendranEscanys().length];
    int[][] arrayAux = crearArrayBidimenalAmbDivisio();
    int indexJ = 0;
    int indexZ = 0;

        for (int i = 0; i < escanys; i++) {

            int numMax = 0;

            for (int j = 0; j < arrayAux.length; j++) {

                for (int z = 0; z < arrayAux[j].length; z++) {

                    if(arrayAux[j][z] > numMax){

                        numMax = arrayAux[j][z];
                        indexJ = j;
                        indexZ = z;
                    }
                }
            }
            arrayAux[indexJ][indexZ] = 0;
            arrayEscanys[indexJ]++;
        }
        return arrayEscanys;
    }

    public static void imprimirArrayBidimensional( int [][] bidimensional){

        for (int i = 0; i < bidimensional.length; i++) {

            for (int j = 0; j < bidimensional[i].length; j++) {

                System.out.print(bidimensional[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void imprimirArrayNormal(int [] array){

        for (int a:array) {

            System.out.print(a + "  ");

        }
    }



}
