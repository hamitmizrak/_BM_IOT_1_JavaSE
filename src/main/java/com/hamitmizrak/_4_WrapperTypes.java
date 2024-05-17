package com.hamitmizrak;

public class _4_WrapperTypes {

    public static void main(String[] args) {
        System.out.println("Primitive Types");
        // Wrapper type:
        // Heap memory
        // null değer alabilir.
        // OOP(Object Oriented Programming) daha yakın
        // Daha fazla yer kaplar.

        // Sayılar için (4)
        // byte<short<int<long
        Byte b1=127;  // 1 byte=8 bit -128<=SAYI<=+127
        System.out.println("b1= "+b1);

        Short s1=128; // 16 bit
        System.out.println("S1= "+s1);

        Integer i1=12812155; // (*) Sıklıkla kullanıyoruz.
        System.out.println(i1);

        Long l1=125212545555L; // 1234L  1234l

        // Virgüllü Sayılar (Floating Point) (2)
        // float<double
        Float f2=14.53f; // 14.53f  14.53F
        System.out.println(f2);
        Double d2=14525.5445; // (*) Sıklıkla kullanıyoruz
        System.out.println(d2);

        // boolean(1)
        Boolean b3=true; //false
        System.out.println(b3);

        // char (1)
        Character c5='a';
        System.out.println(c5);
        /////////////////////////////////////////////////
        int primitiveType=11;
        System.out.println(primitiveType);
        // primitiveType=null; // primitive type: null veremezsiniz

        Integer wrapperType=22;
        System.out.println(wrapperType);
        wrapperType=null;
        /////////////////////////////////////////

        // Boxing: Primitive type'ı Wrapper type'a çevirir.
        int primitiveInt=55;
        Integer wrapperInt=primitiveInt;
        System.out.println(wrapperInt);

        // UnBoxing: Wrapper'ı primitive çevirir.
        Double wrapperDouble=14.53;
        double primitiveDouble=wrapperDouble;
        System.out.println(primitiveDouble);

    }
}
