package com.Marian.Exercici6Arrays;

import java.util.ArrayList;
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

        int[] num = {3,5};
        int[] num2 = {2,4,6};
        int count = 0;
        int aux = 0;
        int[] numFinal = new int[num.length + num2.length];

        if(num.length > num2.length) aux = num.length;

        else aux = num2.length;

        for (int i = 0; i < aux; i++) {

            if(!(num.length == i)){
            numFinal[count] = num[i];
            count++;
            }
            if(!(num2.length == i)) {
                numFinal[count] = num2[i];
                count++;
            }
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
            if (num[i] - num[i - 1] > 0) positive = true;

            if (num[i] - num[i - 1] < 0) negative = true;
        }
        if (positive && !negative) System.out.println("growing");
        if (!positive && negative) System.out.println("decreasing");
        if (!positive && !negative) System.out.println("constant");
        if (positive && negative) System.out.println("irregular");
    }
    public static void savePositiveNegativeNum(){

        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        int num = 0;

        do {

            System.out.print("Put a number: ");
            num = sc.nextInt();

            if(num > 0) positive.add(num);

            if (num < 0) negative.add(num);

        }while (num != 0);

        System.out.println("Positive numbers:");

        for (int p:positive) {

            System.out.println(p);
        }
        System.out.println("Negative numbers:");

        for (int n:negative) {

            System.out.println(n);
        }
    }
    public static int quantityXCharacter(){

        char[] characters = new char[5];
        int count = 0;

        for (int i = 0; i < characters.length; i++) {

            System.out.print("Put a character: ");
            characters[i] = sc.next().charAt(0);
        }
        for (char c:characters) {

            if(c == 'a') count++;
        }
        return count;
    }
    public static int quantityXCharacter2(){

        char[] characters = new char[6];
        int count = 0;
        boolean found = false;

        for (int i = 0; i < characters.length; i++) {

            System.out.print("Put a character: ");
            characters[i] = sc.next().charAt(0);
        }
        for (char c:characters) {

            if( c == 's') found = true;
            if(c == 'a' && found) count++;
        }
        return count;
    }
    public static boolean foundNumber(){

        int[] num = new int[5];

        System.out.print("Put a number: ");
        int number = sc.nextInt();

        for (int i = 0; i < num.length; i++) {

            num[i] = (int) (Math.random() * 10);

        }
        for (int n:num) {

            if(n == number) return true;
        }
        return false;
    }

}



