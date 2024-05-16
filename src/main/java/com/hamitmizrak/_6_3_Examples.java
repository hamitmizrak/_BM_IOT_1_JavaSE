package com.hamitmizrak;

public class _6_3_Examples {
    // Basit Bir Hesap makinesi uygulaması
    /*
        2 sayıyının toplama, çıkarma, çarpma , bölme işlemini
        yapan basit bir hesap makinesi algoritmasını yazınız.
        Örnek: x=23; y=3; buna göre

        Toplama: 23+3
        Çıkarma: 23-3
        Çarpma: 23*3
        Bölme: 23/3
    */

    public static void main(String[] args) {
        double number1=23;
        double number2=3;
        System.out.println("Toplama: "+ (number1+number2));
        System.out.println("Çıkarma: "+ (number1-number2));
        System.out.println("Çarpma: "+ (number1*number2));
        System.out.println("Bölme: "+ (number1/number2));
    }
}
