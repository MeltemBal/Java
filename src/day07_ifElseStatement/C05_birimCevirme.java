package day07_ifElseStatement;

import java.util.Scanner;

public class C05_birimCevirme {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        // ve cevirmek istedigi birimi sorun, istedigi birim
        // metre veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz");
        double mesafeKm = scanner.nextDouble();

        System.out.println("Lutfen cevirmek istediginiz birimi giriniz");
        String birim = scanner.next();

        if (birim.equalsIgnoreCase("metre")){
            System.out.println("Girilen mesafenin cinsinden degeri:" + mesafeKm * 1000);
        }else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilrn mesafenin santimetre cinsinden degeri:" + mesafeKm * 1000);

        }else{
            System.out.println("Sadece metre ve santimetreye cevirebilir.\n istediğiniz birim sisteme kayıtlı degil");

        }


    }
}
