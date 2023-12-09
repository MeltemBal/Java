package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String girilenIsim = scanner.nextLine();

        System.out.println(girilenIsim.toUpperCase());






    }
}
