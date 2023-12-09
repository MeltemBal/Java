package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {
       /*
        bagımsız if cumleleri kodun geriye kalanı ile ilgilenmez
        SADECE if parantezindeki boolean şarta odaklanır
        boolean şart==>true ise if body'si çalışır
        boolean şart==>false ise if body'si çalışmaz

        birden fazla bagımsız if cumlesi kullanıldıgında girilen
        degere baglı olarak tum if bodyleri devreye girebilecegi
        gibi hiçbir if bodysi devreye girmeyebilir
        */

        //kullanıcıdan 2 deger alın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen iki tamsayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        //1. sayi 2. sayıdan buyukse aferin yazdırın

        if (sayi1 > sayi2) {
            System.out.println("Aferin");
        }
        // 1. sayi çift ise çift sayıları severim yazdırın

        if (sayi1 % 2 == 0) {
            System.out.println("Çift sayilari severim");
        }
        //2. sayi 50'den buyukse buyuk sayılarla işim olmaz yazdırın
        if (sayi2 > 50) {
            System.out.println("Buyuk sayilarla isim olmaz");
        }
        //toplamları 100'den küçükse ufak sayılarla işim olmaz yazdırın
        if (sayi1 + sayi2 < 100) {
            System.out.println("Kucuk sayilarla isim olmaz");
        }
    }
}
