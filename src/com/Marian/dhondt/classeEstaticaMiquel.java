package com.Marian.dhondt;

public class classeEstaticaMiquel {

    private static int esconsPerAssignar;
    private static int numPartits;
    private static int[] votsPartits;
    private static String[] nomsPartits;
    private static float percentatgeMinim ;
    private static int[][] quoficientsHondt;
    private static int[] esconsAssignats;
    private static boolean[] teVotsMinims;

    public static int[] initCalculHondt(int escons, String[] partits, int[] votsAconseguits, int percentatgeEliminacionPartits){

        esconsPerAssignar = escons;
        nomsPartits = partits;
        votsPartits = votsAconseguits;
        percentatgeMinim = (float) percentatgeEliminacionPartits/100;

        votsTotals();

        determinarPartitsAmbVotsMinims();

        quoficientsHondt = new int[numPartits][esconsPerAssignar];
        construirTaulaHondt();

        esconsAssignats = new int[numPartits];
        calculHondt();


        return esconsAssignats;
    }

    public static  void imprimirResultats(){

        for (int i = 0; i < numPartits; i++) {

            System.out.println("El partit " + nomsPartits[i] + " a tengut " + votsPartits[i] + " vots, i " + esconsAssignats[i] + " escons.");
        }
    }

    public static void imprimirTaulaQuoficients(){

        for (int i = 0; i < quoficientsHondt.length ; i++) {

            System.out.println(nomsPartits[i] + ":");

            for (int j = 0; j < quoficientsHondt[i].length; j++) {

                System.out.print(quoficientsHondt[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void calculHondt(){

        for (int i = 0; i < esconsPerAssignar; i++) {

            int index = 0;
            int numMajor = 0;

            for (int j = 0; j < esconsAssignats.length; j++) {

                if(quoficientsHondt[j][esconsAssignats[j]] > numMajor ){

                    numMajor = quoficientsHondt[j][esconsAssignats[j]];
                    index = j;
                }
            }
            esconsAssignats[index]++;
        }
    }

    private static void determinarPartitsAmbVotsMinims(){

        for (int i = 0; i < votsPartits.length; i++) {

            if(votsPartits[i] > votsTotals()*percentatgeMinim) {

                numPartits++;
            }
        }
    }

    private static int votsTotals(){

        int total = 0 ;

        for (int a:votsPartits) {
            total += a;
        }
        return total;
    }

    private static void construirTaulaHondt(){

        for (int i = 0; i <quoficientsHondt.length ; i++) {

            for (int j = 0; j <quoficientsHondt[i].length ; j++) {

                quoficientsHondt[i][j] = votsPartits[i]/(j+1);

            }
        }
    }

}
