package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C04_MetniTerseÇevirme {
    public static void main(String[] args) {

        //Soru 10 (interview)- Kullanicidan bir String isteyin
        // ve String’i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metni giriniz");
        String metin = scanner.nextLine(); //Java Candir

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin += metin.charAt(i);
        }
        System.out.println(tersMetin);

        //kullanıcın girdiği metnin palindrome olup olmadıgını yazdırın

        if (metin.equalsIgnoreCase(tersMetin)) {
            System.out.println("Girilen metin palindrome");
        } else {
            System.out.println("Girilen metin palindrome değil");
        }


    }
}
