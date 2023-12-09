package day04_wrapperClass_increment;

import java.util.Scanner;

public class C03_RakamlarToplamınıBulma {
    public static void main(String[] args) {
        //kullanıcıdan 4 basamaklı bir tamsayi alıp
        //sayinin rakamlar toplamını yazdırın


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamaklı bir tamsayi giriniz");
        int girilenSayi = scanner.nextInt();
        //375
        //diyelim ki kullanıcı 375 sayisini girdi
        //bize birler basamagını ve rakamlar toplamını kaydedeceğimiz
        //2 variable lazım

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        //5'i rakamlar toplamına ekledik
        //5'ten kurtulalım

        girilenSayi = girilenSayi / 10;
        birlerBasamagi = girilenSayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilenSayi=girilenSayi/10;
        rakamlarToplami=rakamlarToplami+girilenSayi;

        System.out.println("Girilen sayinin rakamlar toplami"+rakamlarToplami);

    }

}
