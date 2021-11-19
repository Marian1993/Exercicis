package com.Marian.ReforçArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NouArray {

    public static void proba(){

        int[] intArray = {4,9,17,34,6};

        int[] array2 = Arrays.copyOf(intArray,intArray.length);


        System.out.println(intArray.length);
        System.out.println();
        System.out.println(array2.length);

    }
}
