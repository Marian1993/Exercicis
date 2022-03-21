package com.Marian;

import com.Marian.Examen2.*;


public class Main {

    public static void main(String[] args)  {

        Punt p = new Punt(2,2);
        Punt p2 = new Punt(4,3);
        Punt p3 = new Punt(4,7);
        Punt p4 = new Punt(2,5);
        Punt[] poligon = { p,p2,p3,p4};
        int[] proba = {2,4,6,8,14,19,22,25,27,30,33,37,40,41,42,43,50};
        String text = "ser o no ser, esa es la cuestion";

       //Dicotomica.ferDicotomia(30,proba);
        MultiplicacioMatrius.multiplicarArrays();

    }
}
