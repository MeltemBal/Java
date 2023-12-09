package day09_switchStatements;

import java.util.Scanner;

public class C03_HaftaiçiGünleriYazdırma {
    public static void main(String[] args) {

        //kullanıcıdan gün ismini isteyin
        //girilen günün haftaiçi veya haftasonu oldugunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gün ismini giriniz");
        String gunIsmi = scanner.next().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Gun ismi yanlıs");


        }
    }
}
