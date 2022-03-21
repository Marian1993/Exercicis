package com.Marian.Examen1;

public class Exercicis {

    public static char[] arrayMinuscules(String text){

        String tMin = text.toLowerCase();
        char [] lletres = new char[tMin.length()];

        for (int i = 0; i < tMin.length(); i++) {

            lletres[i] = tMin.charAt(i);
        }
        return lletres;
    }

    public static void imprimirMatriuChars(char[] lletres){

        int count = 0;

        for (char l:lletres) {
            System.out.println(count + ": " + l);
            count++;
        }
    }
    public static char[] delimitadors(String text){

        String [] aux = text.split("\\s*[a-zA-Z]+");
        String textDelimitador= "";

        for (String s:aux) {
            textDelimitador += s;
        }
        char [] delimitadors = textDelimitador.toCharArray();

        return eliminarDelimitadorsRepetits(delimitadors);
    }
    private static char[] eliminarDelimitadorsRepetits(char[] del){

        char[] arrayAux = del;
        int count = 0;

        for (int i = 0; i < arrayAux.length; i++) {

            for (int j = i; j < arrayAux.length; j++) {

                if( arrayAux[i] == arrayAux[j] && i != j){

                    arrayAux[j] = 'a';
                }
            }
            if(arrayAux[i] != 'a'){
                count++;
            }
        }

        char[] delimitadors = new char[count];
        int countaux = 0;

        for (int i = 0; i < arrayAux.length; i++) {

            if (arrayAux[i] != 'a'){
                delimitadors[countaux] = arrayAux[i];
                countaux++;
            }
        }
        return delimitadors;
    }
    public static boolean esDelimitador(int posicio, char[] lletres, char[] delimitadors){

        for (int i = 0; i < delimitadors.length; i++) {

          if(lletres[posicio] == delimitadors[i]) {
              return true;
          }
        }
        return false;
    }
    public static boolean iniciParaula(int posicio, char[] lletres, char[] delimitadors){

        for (int i = 0; i < delimitadors.length; i++) {

             if(lletres[posicio-1] == delimitadors[i] && lletres[posicio] != delimitadors[i]){
                 return true;
             }
        }
        return false;
    }
    public static int longitudParaula(int posicio, char[] lletres, char[] delimitadors){

        int tamany = 0;

        for (int i = posicio; i < lletres.length; i++) {

            for (int j = 0; j < delimitadors.length; j++) {

                if(lletres[i] == delimitadors[j]){

                    return tamany;
                }
            }
            tamany++;
        }
        return 0;
    }
    public static  String paraulaCompleta(int posicio, char[] lletres, char[] delimitadors){

        String paraula = "";

        if(iniciParaula(posicio, lletres, delimitadors)){

            for (int i = 0; i < longitudParaula(posicio,lletres,delimitadors); i++) {

                paraula += lletres[posicio+i];
            }
        }
        return paraula;
    }

    public static boolean paraulaPalindorma(String paraula){

        String paraulaReves = "";

        for (int i = paraula.length()-1; i >= 0; i--) {
            paraulaReves += paraula.charAt(i);
        }
        return paraulaReves.equalsIgnoreCase(paraula);
    }

    public static int quantitaParaulesPalindormes(char[] lletres){

        int quantitat = 0;
        String paraula = "";

        for (int i = 0; i < lletres.length; i++) {

            if(lletres[i] == ' '){

                if (paraulaPalindorma(paraula)){
                    quantitat++;
                }
                paraula="";

            }else {
                paraula += lletres[i];
            }
        }
        return quantitat;
    }
    public static String[] paraulesPalindromes(char[] lletres){

        String[] paraulesPal = new String[quantitaParaulesPalindormes(lletres)];
        int quantitat = 0;
        String paraula = "";

        for (int i = 0; i < lletres.length; i++) {

            if(lletres[i] == ' '){

                if (paraulaPalindorma(paraula)){
                    paraulesPal[quantitat] = paraula;
                    quantitat++;
                }
                paraula="";

            }else {
                paraula += lletres[i];
            }
        }
        return paraulesPal;
    }
    public static void imprimirArrayStrings(String[] paraula){

        for (String s:paraula) {

            System.out.println(s);
        }
    }

    public static int [][] numeroAparicionsCombinacioCaracters(char[] lletres){

        int [][] aparicions = new int[lletres.length][lletres.length];
        char[] abecedari = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};

        for (int i = 0; i < abecedari.length; i++) {

            for (int j = 0; j < abecedari.length; j++) {

                for (int k = 1; k < lletres.length; k++) {

                    if(abecedari[i] == lletres[k-1] && abecedari[j] == lletres[k]){

                        aparicions[i][j]++;
                    }
                }
            }
        }
        return aparicions;
    }
    public static void imprimirArrayBidimencional(int[][] aparicions){

        char[] abecedari = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','v','w','x','y','z'};

        for (int i = 0; i < abecedari.length; i++) {

            for (int j = 0; j < abecedari.length; j++) {

                for (int k = i; k < aparicions.length; k++) {

                    for (int l = j; l < aparicions[k].length; l++) {

                        System.out.print(abecedari[i] + " + " + abecedari[j] + ": " + aparicions[k][l] + " | ");
                        break;
                    }
                    break;
                }
            }
            System.out.println();
        }
    }
    public static void ordenaArrayStringAscendent(String[] paraula){

        for (int i = 0; i <paraula.length; i++) {

            String paraulaAux = paraula[i];
            int position = 0;

            for (int j = i; j < paraula.length; j++) {

                if(paraulaAux.length() >= paraula[j].length()){

                    paraulaAux = paraula[j];
                    position = j;
                }
            }
            paraula[position] = paraula[i];
            paraula[i] = paraulaAux;
        }
        for (String s:paraula
        ) {
            System.out.println(s);
        }
    }
    public static void imprimirVerticalment(String[] paraules){

        for (int i = 0; i < paraules.length; i++) {

            for (int j = 0; j < paraules.length; j++) {

                System.out.print(paraules[j].charAt(i));
            }
        }
    }
}
