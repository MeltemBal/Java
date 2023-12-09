package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C10_Ternary_odev {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();
        System.out.println(sayi < 0 ? -1 * sayi : sayi);
    }
}
