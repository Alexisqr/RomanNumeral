package org.example;
/*
@author   Oleksandra Hrytsiuk
@project   L1
@class  Main
@version  1.0.0
@since 22.08.2024 - 12.18
*/

public class Main {
    public static void main(String[] args) {

        int number = 1987;
        String romanNumeral = Converter.arabicToRoman(number);

        System.out.println("Arabic number: " + number + " -> Roman numeral: " + romanNumeral);
    }
}