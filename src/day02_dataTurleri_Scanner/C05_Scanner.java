package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir tamsayi giriniz");

        int girilenTamsayi = scanner.nextInt();
        System.out.println("ondalikli bir sayi giriniz");

        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Girilen sayilarin toplami :" + (girilenTamsayi + girilenOndalikliSayi));
        System.out.println("Girilen sayilarin carpimi: " + (girilenTamsayi * girilenOndalikliSayi));




    }
}
