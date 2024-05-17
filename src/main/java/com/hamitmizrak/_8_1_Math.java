package com.hamitmizrak;

import java.util.Scanner;

public class _8_1_Math {

    public static void main(String[] args) {

        // Math Değer olarak
        double usluSayi=Math.pow(2,5);
        System.out.println(usluSayi);

        // Mathematics (Math)
        System.out.println("PI sayısı: "+Math.PI);

        System.out.println("Mutlak Değer:"+ Math.abs(-25));
        System.out.println("Karekök Değer:"+ Math.sqrt(36));
        System.out.println("Üslü Değer:"+ Math.pow(2,5)); //2 üzerine 5

        System.out.println("Minumum Değer:"+ Math.min(1,500));
        System.out.println("Maksimum Değer:"+ Math.max(1,500));

        System.out.println("Sayıyı Aşağı yuvarlama :"+ Math.floor(4.9));
        System.out.println("Sayıyı Yukarı yuvarlama :"+ Math.ceil(6.1));

    }
}
