package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //kullanıcıdan baslangıc ve bitiş degerlerini slın
        // baslangıc ve bitiş dahil olarak
        //bu iki sayi arasındaki tum tamsayıları toplayın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Luften baslangıc ve bitiş degerleri olarak 2 tamsayı giriniz");


        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        //while loop ile yapalım

        int sayi = baslangic;
        int toplam = 0;

        while (sayi<=bitis){

            toplam +=sayi;
            sayi++;
        }

        System.out.println(baslangic+ " ile " + bitis + "arasındaki sayıların toplamı:"+ toplam);
    }
}
