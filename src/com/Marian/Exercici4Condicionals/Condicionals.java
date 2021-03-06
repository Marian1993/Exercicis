package com.Marian.Exercici4Condicionals;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Condicionals {

    private static Scanner sc = new Scanner(System.in);

    public static String positiveOrNegative(){

        System.out.print("Put a number: ");
        return sc.nextInt() >= 0 ? "Positive": "Negative";
    }

    public static boolean multipleTwo(){

        System.out.print("Put a number: ");
        return ( sc.nextInt()%2 == 0 ? true:false );
    }
    public static String higherLessSame(){

        System.out.print("Put first number: ");
        int num1 = sc.nextInt();
        System.out.print("Put second number: ");
        int num2 = sc.nextInt();

        if(num1 > num2){
            return num1 + " = higher, " + num2 + " = less.";
        }else if(num1 < num2){
            return num2 + " = the higher, " + num1 + " = less.";
        }else {
            return num2 + " and " + num1 + " = same.";
        }
    }
    public static String dayOfWeekIf(){

        System.out.print("Put a day: ");
        int day= sc.nextInt();

        if(day == 1){
            return "Monday";
        }else if(day == 2){
            return "Tuesday";
        }else if(day == 3){
            return "Wenesday";
        }else if(day == 4){
            return"Thursday";
        }else if(day == 5){
            return "Friday";
        }else if(day == 6){
            return "Saturday";
        }else if(day == 7){
            return "Sunday";
        }else{
            return "There is not so many days.";
        }
    }
    public static String dayOfWeekSwitch(){

        System.out.print("Put a day: ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wenesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "There is not so many days.";
        }
    }
    public static String dayMoment(){

        System.out.print("Put a hour: ");
        int hour = sc.nextInt();

        switch (hour){

            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return "Morning";
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return "Noon";
            case 18:
            case 19:
            case 20:
                return "Afternoon";
            case 21:
            case 22:
            case 23:
                return "Night";
            default:
                return "Early morning";
        }
    }
    public static String noteClass(){

        System.out.print("Put a note: ");
        int note = sc.nextInt();

        switch (note){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "insufficient";
            case 5:
                return "sufficient";
            case 6:
                return "Good";
            case 7:
            case 8:
                return "notable";
            case 9:
            case 10:
                return "Excellent";
            default:
                return "Error";
        }
    }
    public static String correctDate(){

        System.out.print("Put a day: ");
        int day= sc.nextInt();
        System.out.print("Put a mounth: ");
        int mounth = sc.nextInt();
        System.out.print("Put an age: ");
        int age = sc.nextInt();

        if(day <= 30 && mounth <= 12 && age <=2050){

            if (day > 0 && mounth > 0 && age >= 1900){

                return "Correct Date";
            }
        }
            return "Incorrect Date";
    }
    public static String correctDate2(){

        System.out.print("Put a day: ");
        int day= sc.nextInt();
        System.out.print("Put a mounth: ");
        int mounth = sc.nextInt();
        System.out.print("Put an age: ");
        int age = sc.nextInt();

        switch (mounth) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day <= 31 && mounth <= 12 && age <= 2050) {

                    if (day > 0 && mounth > 0 && age >= 1900) {

                        return "Correct Date";
                    }
                }
            case 2:
                if (day <= 28 && mounth <= 12 && age <= 2050) {

                    if (day > 0 && mounth > 0 && age >= 1900) {

                        return "Correct Date";
                    }
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (day <= 30 && mounth <= 12 && age <= 2050) {

                    if (day > 0 && mounth > 0 && age >= 1900) {

                        return "Correct Date";
                    }
                }
            default:
                return "Incorrect Date";
        }
    }
    public static void orderNumber(){

        System.out.print("Put first number: ");
        int num1 = sc.nextInt();
        System.out.print("Put second numbre: ");
        int num2 = sc.nextInt();
        System.out.print("Put three number: ");
        int num3 = sc.nextInt();

        int[] number = new int[3];

        if(num1 > num2 && num1 > num3){
            number[0] = num1;
            if(num2 > num3){
                number[1] = num2;
                number[2] = num3;
            }else{
                number[1] = num3;
                number[2] = num2;
            }

        }else if(num2 > num3 && num2 > num1){
            number[0] = num2;
            if (num1 > num3){
                number[1] = num1;
                number[2] = num3;
            }else {
                number[1] = num3;
                number[2] = num1;
            }
        }else {
            number[0] = num3;
            if(num1 > num2){
                number[1] = num1;
                number[2] = num2;
            }else {
                number[1] = num2;
                number[2] = num1;
            }
        }
        for (int num:number
             ) {
            System.out.println(num);
        }
    }
    public static String adultOrYounger(){

        System.out.print("Put an age: ");
        int age = sc.nextInt();

        if ( age < 0 )
            return "Error";

        if ( age > 18 )
            return "Adult";

        return "Young";
    }
    public static String quantityBills(){

        System.out.print("Put a quantity money: ");

        int bills = sc.nextInt();;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;

        fifty = bills/50;
        bills -= (fifty*50);

        twenty = bills/20;
        bills-= (twenty*20);

        ten = bills/10;
        bills -= (ten*10);

        five = bills/5;
        bills -= (five*5);

        two = bills/2;
        bills -= (two*2);

        one = bills/1;
        bills -= (one*1);

        return "bills 50 = " + fifty + "\nbills 20 = " + twenty + "\nbills 10 = " + ten +
                "\nbills 5 = " + five + "\ncoins 2 = " + two + "\ncoins 1 = " + one;
    }
}
