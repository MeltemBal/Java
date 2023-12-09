package day07_ifElseStatement;

import java.util.Scanner;

public class C03_notYazdirma {
    public static void main(String[] args) {

        //kullanıcıdN 100 ÜZERİNDEN NOTUNU ALIN
        //negatif veya 100'den buyuk deger girerse"Gecersiz not"
        //85 ile 100 arasında ise (sınırlar dahil) AA
        //65 (dahil) buyuk ise ve 85'den küçükse  BB
        //50 (dahil) buyuk ise ve 65'den küçükse  CC
        //50'den küçükse DD kaldın yazdırın
        /*
        if
        else if
        else if...
        ....
        else

        seklinde yazılan bir kod için sonu Else ile bittiğinden
        bir sonuc yazdırmama ihtimali YOKTUR
        -else if... ile butun if'ler birbirine baglandıgından aynı anda
        iki if body'sinin devreye girme ihtimali de YOKTUR


         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");

        double girilenNot = scanner.nextDouble();
        if (girilenNot < 0 || girilenNot > 100) {
        } else if (girilenNot >= 85) {
            System.out.println("AA");
            } else if (girilenNot >= 65) {
                System.out.println("BB");
            } else if (girilenNot >= 50) {
                System.out.println("CC");
            } else {
                System.out.println("DD kaldın");

            }
        }

    }

