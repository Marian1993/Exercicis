package com.Marian.Examen2;

public class XifratCesar {

    private String text;
    private int numXifratge;
    private final char[] alfabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};


    public XifratCesar(String text, int numXifratge){

        this.text = text;
        this.numXifratge = numXifratge;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumXifratge() {
        return numXifratge;
    }

    public void setNumXifratge(int numXifratge) {
        this.numXifratge = numXifratge;
    }

    public void xifratge(){

        String aux = "";

        for (int i = 0; i < getText().length(); i++) {

            for (int j = 0; j < alfabet.length; j++) {

                if(getText().charAt(i) == ' '){
                    aux += getText().charAt(i);
                    break;
                }
                else if(getText().charAt(i) == alfabet[j]){

                    if((j + getNumXifratge()) > alfabet.length){

                        int sum = getNumXifratge() + j;
                        int res = sum - alfabet.length;

                        aux += alfabet[res];
                    }
                    else {
                        aux += alfabet[j + numXifratge];
                    }
                }
            }
        }
        setText(aux);
    }
    public void desxifratge(){

        String aux = "";

        for (int i = 0; i < getText().length(); i++) {

            for (int j = 0; j < alfabet.length; j++) {

                if(getText().charAt(i) == ' '){
                    aux += getText().charAt(i);
                    break;
                }
                else if(getText().charAt(i) == alfabet[j]){

                    if((j - getNumXifratge()) < 0){

                        int sum = getNumXifratge() + j;
                        int res = sum - alfabet.length;

                        aux += alfabet[res];
                    }
                    else {
                        aux += alfabet[j - numXifratge];
                    }
                }
            }
        }
        setText(aux);
    }


}
