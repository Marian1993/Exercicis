package com.Marian.Excepcions;

import com.Marian.Practica12.SkilledEmployee;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Excepcions{
    private static Scanner sc = new Scanner(System.in);

    public static void dividirPerZero(){

        try {
            System.out.println("Posa un numero:");
            int numero = sc.nextInt()/0;
            System.out.println(numero);

        }catch (ArithmeticException e){
            System.out.println(e);

        }
    }
    public static void controlarNumEntrada(){

        try {
            System.out.println("Posa un numero:");
            int num = sc.nextInt();
            System.out.println(num);
            System.out.println("Podriem fer algo");

        }catch (InputMismatchException e){

            System.out.println(e);
        }finally {
            System.out.println("Podriem fer algo");

        }
    }

    public static void conversioStringInt(){

        int conversio = 0;
        try{
            System.out.println("Posa un numero:");
            String num = sc.nextLine();
            conversio = (parseInt(num));
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        System.out.println(conversio);
    }

    public static void ConversioIDivisio(){

        System.out.println("Posa un numero:");
        String primer = sc.nextLine();

        System.out.println("Posa un numero:");
        String segon = sc.nextLine();

        int num1;
        int num2;
        int resultat = 0;

        try {
            num1 = parseInt(primer);
            num2 = parseInt(segon);

            resultat = num1/num2;

        }catch (NumberFormatException | ArithmeticException e){
            System.out.println(e);
        }

        System.out.println(resultat);
    }
    public static void readFile(File file) {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            System.err.println("Fitxer no trobat");
        } catch (IOException e) {
            System.err.println("Error: " + e);
        }
        finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println("Error: " + e);
                }

            }
        }
    }
}
