package com.Marian.ReforçArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NouArray {

    public static void proba(){

        int[] intArray = {4,9,17,34,6};

        int[] array2 = Arrays.copyOf(intArray,intArray.length+2);

        array2[5] = 12;
        array2[6] = 67;

        int [] major = (intArray.length > array2.length) ? array2 : intArray;

        for (int n:major
             ) {
            System.out.println(n);
        }

    }
    public static void proba2(){

        int[] intArray = {4,9,17,34,6};

        int[] array2 = Arrays.copyOfRange(intArray,0,3);

        for (int n:array2
             ) {
            System.out.println(n);

        }
    }

    public static void proba3(){
        for (int i = 0; i <= 50; i++) {
            if (i == 10) continue;
            System.out.println(i);
        }
    }
}
