package com.Marian.Exercici4Condicionals;

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

}
