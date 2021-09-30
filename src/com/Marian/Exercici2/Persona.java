package com.Marian.Exercici2;

public class Persona {
    private String name;
    private int age;
    private String dni;
    private char sex;
    private int phone;

    // contructors

    public Persona(){};

    public Persona(String name, int age, String dni, char sex, int phone){

        this.name = name;
        this.age = age;
        this.dni = dni;
        this.sex = sex;
        this.phone = phone;
    }

    //getters

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getDni(){
        return this.dni;
    }

    public char getSex() {
        return sex;
    }

    public int getPhone() {
        return phone;
    }

    //setters

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    //display
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dni='" + dni + '\'' +
                ", sex=" + sex +
                ", phone=" + phone +
                '}';
    }
    public char convert(String string){

        char letra;
        return  letra = string.charAt(0);
    }
}
