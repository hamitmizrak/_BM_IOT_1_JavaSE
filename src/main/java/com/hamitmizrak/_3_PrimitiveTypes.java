package com.hamitmizrak;

public class _3_PrimitiveTypes {

    public static void main(String[] args) {
        System.out.println("Primitive Types");
        // Data Structure

        // 8 tane primitive type vardır.
        // Java neden 100% OOP değildir ? cevap: primitive türden dolayı

        // Sayılar için (4)
        // byte<short<int<long
        byte b1=127;  // 1 byte=8 bit -128<=SAYI<=+127
        System.out.println(b1);
        short s1=128; // 16 bit
        System.out.println(s1);
        int i1=12812155; // (*) Sıklıkla kullanıyoruz.
        System.out.println(i1);
        long l1=125212545555L;

        // Virgüllü Sayılar (Floating Point) (2)
        float f2=14.53f;
        System.out.println(f2);
        double d2=14525.5445; // (*) Sıklıkla kullanıyoruz
        System.out.println(d2);

        // boolean(1)
        boolean b3=true; //false
        System.out.println(b3);

        // char (1)
        char c5='a';
        System.out.println(c5);
    }
}
