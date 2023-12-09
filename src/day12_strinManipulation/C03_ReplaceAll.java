package day12_strinManipulation;

import java.util.Scanner;

public class C03_ReplaceAll {
    public static void main(String[] args) {

        //kullanıcıdan metin isteyin
        //kullanıcının girdiği metinden space dısındaki tüm karakterleri
        //ve sayıları silip metni yeni haliyle yazdırın

        // input: "J1*a34_va+12 C87an.90d654ir,"; output: Java Candir

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metni giriniz");
        String metin = scanner.nextLine();

        //önce sayılardan kurtulalım

        metin = metin.replaceAll("\\d", "");

        // space'i koruma altına almak için herhangi bir rakamla replace yapalım
        metin=metin.replaceAll("\\s","5");

        //özel metinlerden kurtulalım
        metin=metin.replaceAll("\\W","");
        System.out.println(metin);

        //_'yi yok edelim sayi koydugumuz space'i geri getirelim

        metin=metin.replace("_","").replaceAll("5"," ");

        System.out.println(metin);

    }
}
