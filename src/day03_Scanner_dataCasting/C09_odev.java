package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C09_odev {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");
        int ilkSayi= scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");
        int ikinciSayi= scanner.nextInt();

        System.out.println("Lutfen ilk sayiyi girin:"+(ilkSayi*ikinciSayi/ilkSayi));
        System.out.println("Lutfen ikinci sayiyi girin:"+(ilkSayi*ikinciSayi/ikinciSayi));


    }
}
