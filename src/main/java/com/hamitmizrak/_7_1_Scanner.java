package com.hamitmizrak;

import java.util.Scanner;

public class _7_1_Scanner {

    public static void main(String[] args) {

        // Kullanıcıdan Console üzerinden veri almak istersek
        Scanner klavye=new Scanner(System.in);

        System.out.println("Adınızı giriniz");
        String name=klavye.nextLine();
        System.out.println("Girdiğiniz Ad: "+name);

        System.out.println("\nSoyadınızı giriniz");
        String surname=klavye.nextLine();
        System.out.println("Girdiğiniz soyad: "+surname);

        System.out.println("\nİl Plakanızı Giriniz");
        int number=klavye.nextInt();
        System.out.println("İl Plakanız: "+number);

        System.out.println("Adınız: "+name+" Soyadınız: "+surname+" Plaka: "+number);

        System.out.println("*********************************");
        System.out.println("Adınız: "+name);
        System.out.println("Soyadınız: "+surname);
        System.out.println("Plaka: "+number);
        System.out.println("*********************************");

        // Escape Character
        // \n:Alt satıra geç
        System.out.println("Adınız: "+name+"\nSoyadınız: "+surname+"\nPlaka: "+number);
    }
}
