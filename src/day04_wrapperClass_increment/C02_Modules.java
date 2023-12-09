package day04_wrapperClass_increment;

import java.util.Scanner;

public class C02_Modules {
    public static void main(String[] args) {

        System.out.println(25 % 8); //1
        System.out.println(25 / 8); //3

        //124554423 sayıısının 8 ile bolumunden kalan kaçtır,,

        System.out.println(16 / 3);
        System.out.println(16 % 3);

        System.out.println(124554423 % 8);

        // 734543345 sayısı 113' tam bölünür mü'

        System.out.println(734543345 % 113);

        // 454334555 sayısı 3' tam bölünür mü'

        System.out.println(454334555 % 3);

        //kullanıcıdan bir sayi isteyip
        //birler basamagını yazdırın,

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();
        System.out.println("Girilen sayinin birler basamagi:" + (sayi % 10));

        //375
        System.out.println(375 % 10);  //5 birler basamagını veriyor
        System.out.println(375 / 10);  //37 birler basamağı olan 5 hariç kalan sayıyı verir

        System.out.println(37 % 10); //7
        System.out.println(37 / 10); //3

        System.out.println(3 % 10); //3
        System.out.println(3 / 10); //0


    }
}
