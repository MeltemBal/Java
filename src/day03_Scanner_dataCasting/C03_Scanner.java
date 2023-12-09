package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk tamsayiyi giriniz");
        int ilkSayi = scanner.nextInt();

        System.out.println("Lutfen ikinci tamsayiyi giriniz");
        int ikinciSayi = scanner.nextInt();

        int temp = 0;


        temp = ikinciSayi;

        ikinciSayi = ilkSayi;

        ilkSayi = temp;

        System.out.println("Girdiğiniz veriable'larin degerini değistirdim");
        System.out.println("ılk sayinin yeni degeri:"+ ilkSayi);
        System.out.println("ikinci sayinin yeni degeri:"+ ikinciSayi);



    }
}
