package com.Marian.Exercici5Bucles;

import java.util.Scanner;

public class Bucles {

    private static Scanner sc = new Scanner(System.in);

    public static void outNumbers(){

        System.out.print("Put a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){
            System.out.println(i);
        }
    }
    public static void askUntilNegativeNumber(){

        int num;
        do{
            System.out.print("Put a number: ");
            num = sc.nextInt();

        }while (num >= 0);

        System.out.println("You are put a negative number.");
    }
    public static void sayNegativeOrPositiveNumbers(){

        int num;

        do {
            System.out.print("Put a number: ");
            num = sc.nextInt();

            if(num > 0){
                System.out.print(num + " is a positive number\n");
            }
            if(num < 0) {
                System.out.print(num + " is a negative number\n");
            }

        }while(num != 0);
    }

    public static void stopMutipleTwo(){

        int num;

        do {
            System.out.print("Put a number: ");
            num = sc.nextInt();

        }while(num%2 != 0);
    }
    public static void showQuantityNumbers(){

        int num;
        int count = 0;

        do {
            System.out.print("Put a number: ");
            num = sc.nextInt();
            if(num >= 0){
                count++;
            }

        }while(num >= 0);
        System.out.print("They have put " + count + " numebrs.");
    }
    public static void medianCalculation(){

        int num;
        int count = 0;
        int sum = 0;
        int median = 0;

        do {
            System.out.print("Put a number: ");
            num = sc.nextInt();

            if(num != 0){

                sum += num;
                count++;
            }

        }while(num != 0);

        System.out.print("The median is =  " + (median = sum/count));
    }
    public static void showOddNumbers(){

        int num;

        do {

            System.out.print("Put a even number: ");
            num = sc.nextInt();

        }while (num%2 != 0);

        for (int i = 1; i < num ; i = i+2) {

            System.out.println(i);
        }
    }
    public static void matchHiddenNumber(){

        int hidden = (int)(Math.random()*50);
        int num;
        int count = 0;

        do{
            System.out.print("Put a number until 50: ");
            num = sc.nextInt();
            count++;

            if(num > hidden){
                System.out.println("Is better");
            }
            if(num < hidden){
                System.out.println("Is minior");
            }

        }while(num != hidden);

        System.out.println("Attempts= " + count--);
    }
    public static void putXNumers(){

        int quantity = 5;
        int count = 0;

        for (int i = 0; i < quantity ; i++){

            System.out.print("Put a number: ");
            int num = sc.nextInt();

            if(num < 0){
                count++;
            }
        }
        System.out.print("Negative numbers= " + count);
    }
    public static  void showBetterNumber(){

        int quantity = 5;
        int better = 0;

        for (int i = 0; i < quantity ; i++){

            System.out.print("Put a number: ");
            int num = sc.nextInt();

            if(num > better){

                better = num;
            }
        }
        System.out.print("Better number= " + better);
    }
    public static void rating(){

        int quantity = 6;
        int approved = 0;
        int suspended = 0;
        int error = 0;

        for (int i = 0; i < quantity ; i++){

            System.out.print("Put a number: ");
            int num = sc.nextInt();

            if(num >= 5 && num <= 10){
                approved++;
            }else if( num >= 0 && num < 5){
                suspended++;
            }else {
                error++;
            }
        }
        System.out.print("Approved= " + approved + "\nSuspended= " + suspended + "\nError= " + error);
    }

}
