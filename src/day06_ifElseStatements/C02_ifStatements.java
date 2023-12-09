package day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {
        //kullanıcıdan iki sayi alın
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        //ilk sayi 2.den byukse "buyuksun sayi1"yazdırın
        boolean sonuc = sayi1 > sayi2;
        if (sonuc) {
            System.out.println("Buyuksun sayi1");

        }

        //2. sayi sifirdan buyukse "buyuksun sayı2" yazdıralım

        sonuc = sayi2 > 0;
        if (sonuc){
            System.out.println("Buyuksun sayi2");
        }

        //iki sayinin toplamı 100'den buyukse"İkinizde buyuksunuz" yazdırın
        sonuc=sayi1+sayi2>100;

        if(sonuc){
            System.out.println("İkinizde buyuksunuz");
        }

    }
}
