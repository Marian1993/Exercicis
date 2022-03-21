package com.Marian.Practica12;

import java.util.ArrayList;

public class Manager extends Employee {

    private ArrayList<Employee> llistaEmpleats;

    public Manager(int id, String nom, String titol, int nivell){

        super(id, nom, titol, nivell);
        this.llistaEmpleats = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getLlistaEmpleats() {
        return llistaEmpleats;
    }

    public void setLlistaEmpleats(Employee empleat) {
        llistaEmpleats.add(empleat);
    }

    @Override
    public void print(){

        Employee emp;

        super.print();
        System.out.println("Llista de treballadors: ");

        for (Employee e:llistaEmpleats) {
            emp = e;
            System.out.println(emp.getNom());
        }
    }
}
