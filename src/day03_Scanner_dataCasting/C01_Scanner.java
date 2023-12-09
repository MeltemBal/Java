package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan ismini, soyismini ve yasini alip
        //          asagidaki formatta yazdirin.
        //          girilen bilgiler : J Doe, 44

        Scanner sezar = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        char isimİlkHarf = sezar.nextLine().charAt(0);

        System.out.println("Lutfen soyadinizi giriniz");
        String soyadi = sezar.nextLine();

        System.out.println("Lutfen yasınızı giriniz");
        int yas = sezar.nextInt();

        //System.out.println("boyunuzu yazınız");
        //double boy = sezar.nextDouble();

        System.out.println("girilen bilgiler:" + isimİlkHarf + " " + soyadi + ", " + yas );

    }
}
















