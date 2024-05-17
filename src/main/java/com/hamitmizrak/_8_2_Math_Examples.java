package com.hamitmizrak;

import java.util.Scanner;

public class _8_2_Math_Examples {

    public static void main(String[] args) {

        // Kullanıcıdan alınan iki tam sayı değeri için  en küçük sayının karesi ?
        // Dikkat kullanıcı yanlışlıkla negatif sayı girebilir (abs)
        // 3,5
        // 3 (min)
        // 3^2=9 (pow)
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int number1 = scanner.nextInt();
        number1=Math.abs(number1);// pozitif sayı

        System.out.println("2.sayıyı giriniz");
        int number2 = scanner.nextInt();
        number2=Math.abs(number2);// pozitif sayı

        int minValue=Math.min(number2,number1); // min
        //System.out.println(Math.min(number2,number1));

        double result=  Math.pow(minValue,2);
        System.out.println("Sonuç: "+result);
    }
}
