package com.devbox.java;

import java.util.ArrayList;
import java.util.List;

public class LastNonRepeatedCharacterFromString {

    public static final String ALL_REPEATED_CHARACTER = "Todos os caracteres da string aparecem mais de 1 vez";

    public String validation(String str){

        List<Integer> repeatNumber = new ArrayList<Integer>();
        int count = 0;

        // Loop em cada caratere da string armazenando a qtd de vezes que se repete
        for(int y=0; y<str.length();y++) {
            count = 0;

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(y) == str.charAt(i)) {
                    count++;
                }
            }
            repeatNumber.add(y,count);
        }

        // Loop no array que tem a qtd de repeticoes iniciando do ultimo ate o primeiro caractere
        for (int i=repeatNumber.size()-1; i>=0; i--){
            if (repeatNumber.get(i) == 1){
                return String.valueOf(str.charAt(i));
            }
        }

        return ALL_REPEATED_CHARACTER;
    }

    public static void main(String[] args){

        System.out.println("Welcome to Code Challenge!!!");
    }

}
