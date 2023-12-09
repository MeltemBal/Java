package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scanner.nextInt();

        System.out.println("Lutfen isminizi giriniz");

        String isim = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");

        String soyadi= scanner.next();

        System.out.println("Isminiz:" + isim);
        System.out.println("Soyadiniz:" + soyadi);
        System.out.println("Yasiniz:" + yas);
        System.out.println("Kaydiniz basariyla alinmistir");

    }
}
