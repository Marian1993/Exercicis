package com.Marian.Practica11;

public class DateThree {

    private int day;
    private int mounth;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int mounth, int year){

        //Validar valor de año
        if (year > 1000 && year < 10000){
            this.year = year;
        }else {
            System.out.println(year + " aquest any no es valid");
        }

        //Validar valor de mes i dies per mes
        switch (mounth){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                this.mounth = mounth;

                if (day < 32 && day > 0){
                    this.day = day;
                }
                else{
                    System.out.println(day + " aquest dia no es valid");
                }
                break;
            case 2:

                this.mounth = mounth;

                if (day < 29 && day > 0){
                    this.day = day;
                }
                else if(day == 29){
                    if (((year%4 == 0) && !(year%100 == 0)) || (year%4 == 0)){
                        this.day =day;
                    }else {
                        System.out.println(year + " aquest any el febrer no te 29 dies");
                    }
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:

                this.mounth = mounth;

                if (day < 31 && day > 0){
                    this.day = day;
                }
                else{
                    System.out.println(day + " aquest dia no es valid");
                }
                break;
            default:
                System.out.println(mounth + " aquest mes no es valid");
                this.mounth = 0;
                break;
        }
    }
    public void displayDate(){
        System.out.println("Date: " + day + "/" + mounth + "/" + year);

    }
}
