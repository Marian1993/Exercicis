package com.Marian.Examen2;

public class Dicotomica {

    public static void ferDicotomia(int numCercar,int[] nums){

        int iMax = nums.length;
        int iMin = 0;
        int distancia = nums.length;

        while (true){

            int index = distancia/2;

            if(index < iMin){
                index += iMin;
            }
            if(nums[index] == numCercar){
                System.out.println("Tobat");
                break;

            }else if ((index - iMin) == 1){
                break;

            }else if(nums[index] < numCercar){
                iMin = index;
                distancia = iMax - iMin;

            } else {
                iMax = index;
                index = index - iMin;
                distancia -= index;
            }
        }

    }
}
