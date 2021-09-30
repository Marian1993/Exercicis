package com.Marian;

import com.Marian.Exercici2.Persona;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Maria",20,"23456755M",'D',677543124);

        System.out.println(persona1.toString());

        Persona persona2 = new Persona();
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        persona2.setName(sc.nextLine());

        System.out.print("Age: ");
        persona2.setAge(sc.nextInt());

        System.out.print("DNI: ");
        persona2.setDni(sc.nextLine());

        System.out.print("Sex: ");
        persona2.setSex(sc.nextLine());

        System.out.print("Phone: ");
        persona2.setPhone(sc.nextInt());

        System.out.println();
        System.out.println(persona2.toString());
    }
}
