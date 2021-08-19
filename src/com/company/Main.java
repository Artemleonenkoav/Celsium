package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double fahrenheite ;
        fahrenheite = ( 9 / 5.0 ) * celsius + 32;


        return fahrenheite;
    }
    }
