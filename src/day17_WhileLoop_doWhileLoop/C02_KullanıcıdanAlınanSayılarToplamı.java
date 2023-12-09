package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_KullanıcıdanAlınanSayılarToplamı {

    public static void main(String[] args) {

        //kullanıcıdan toplanmak üzere sayılar alın
        //toplam 500'ü gecerse
        //"Bu kadar sayı yeter,.... adet sayı girdiniz ve toplamı... oldu yazdırın
        //ve işlemi bitirin

        Scanner scanner = new Scanner(System.in);

        double sayi = 0;
        double toplam = 0;
        int sayac = 0;

        while (toplam < 500) {

            System.out.println("Lutfen toplanmak üzere sayı giriniz");
            sayi =scanner.nextDouble();

            sayac++;

            toplam +=sayi;

        }

        System.out.println("Bu kadar sayı yeter " + sayac + " adet sayı girdiniz ve toplamı:"+toplam);

    }
}
