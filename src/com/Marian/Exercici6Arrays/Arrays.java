package com.Marian.Exercici6Arrays;

import java.util.Scanner;

public class Arrays {

    private static Scanner sc = new Scanner(System.in);

    public static void printArrayWiyhoutBubcle(){

        int[] num = {4,8,12,9};

        System.out.println(num[0] + "\n" + num[1] + "\n" +  num[2] + "\n" +  num[3]);
    }
    public static void printArray(){

        int[] num = {4,8,12,9};

        for (int n:num) {
            System.out.println(n);
        }
    }
    public static void showOrder(){

        int[] num = new int[4];

        System.out.print("Put a number: ");
        num[0] = sc.nextInt();
        System.out.print("Put a number: ");
        num[1] = sc.nextInt();
        System.out.print("Put a number: ");
        num[2] = sc.nextInt();
        System.out.print("Put a number: ");
        num[3] = sc.nextInt();

        for (int n:num) {
            System.out.println(n);
        }
    }
    public static void showInversOrder(){

        int[] num = new int[4];

        System.out.print("Put a number: ");
        num[0] = sc.nextInt();
        System.out.print("Put a number: ");
        num[1] = sc.nextInt();
        System.out.print("Put a number: ");
        num[2] = sc.nextInt();
        System.out.print("Put a number: ");
        num[3] = sc.nextInt();

        for (int i = num.length-1; i >= 0; i--) {

            System.out.println(num[i]);

        }
    }

    public static int sumNumArray(){

        int sum = 0;

        int[] num = new int[4];

        System.out.print("Put a number: ");
        num[0] = sc.nextInt();
        System.out.print("Put a number: ");
        num[1] = sc.nextInt();
        System.out.print("Put a number: ");
        num[2] = sc.nextInt();
        System.out.print("Put a number: ");
        num[3] = sc.nextInt();

        for (int n:num) {
            sum+=n;
        }
        return sum;
    }
    public static String concatCharInString(){

        String phrase = "";

        char[] letters = {'M','a','r','i','a','n'};

        for (char l:letters) {

            phrase+=l;
        }
        return phrase;
    }
    public static String concatNum(){

        String sum = "";

        int[] num = {'1','2','3','4','5','6'};

        for (int n:num) {
            sum+=(char)n;
        }
        return sum;
    }
    public static int calculateMedian(){

        int[] num = {1,2,3,4,5,6};

        int sum = 0;

        for (int n:num) {

            sum+= n;
        }
        return sum/num.length;
    }
    public static void  putTogether2Arrays(){

        int[] num = {1,3,5};
        int[] num2 = {2,4,6};
        int count = 0;
        int[] numFinal = new int[num.length + num2.length];

        for (int i = 0; i < num.length; i++) {

            numFinal[count] = num[i];
            count++;
            numFinal[count] = num2[i];
            count++;
        }
        for (int n:numFinal) {

            System.out.println(n);
        }
    }
    public static void orderType(){

        int[] num = new int[4];
        boolean positive = false;
        boolean negative = false;

        System.out.print("Put a number: ");
        num[0] = sc.nextInt();
        System.out.print("Put a number: ");
        num[1] = sc.nextInt();
        System.out.print("Put a number: ");
        num[2] = sc.nextInt();
        System.out.print("Put a number: ");
        num[3] = sc.nextInt();

        for (int i = 1; i < num.length; i++)
        {
            if (num[i] - num[i - 1] > 0){
                positive = true;
            }
            if (num[i] - num[i - 1] < 0){
                negative = true;
            }
        }
        if (positive && !negative){
            System.out.println("growing");
        }
        if (!positive && negative){
            System.out.println("decreasing");
        }
        if (!positive && !negative){
            System.out.println("constant");
        }
        if (positive && negative){
            System.out.println("irregular");
        }
    }
}



