package day07_ifElseStatement;

import java.util.Scanner;

public class C07_Emeklilik {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //  veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz. E:Erkek, K:Kadın");

        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("65 yas üzeri erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmak için " + (65 - yas) + "yıl daha çalışman gerekir");
        } else if (cinsiyet == 'K' && yas > 60) {
            System.out.println("60 yas üzeri kadin emekli olabilir");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmak için" + (60 - yas) + "yıl daha çalışman gerekir");
        } else
            System.out.println("Hatalı giriş");


    }
}


