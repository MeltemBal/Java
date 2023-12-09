package day09_switchStatements;

import java.util.Scanner;

public class C04_IkıBasamakliSayiYazdirma {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan 2 basamakli bir sayi alip,
        //        girilen sayiyi yazi ile yazdirin

        //34==>3 otuz, 4 dort

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 2 basamaklı bir sayi giriniz");

        int girilenSayi = scanner.nextInt();

        int birlerBasamagi = girilenSayi % 10;
        int onlarBasamagi = girilenSayi / 10;

        switch (onlarBasamagi) {
            case 0:
                break;
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmıs");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
            case 9:
                System.out.print("doksan");
                break;
        }
        switch (birlerBasamagi) {
            case 0:
                break;
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("uc");
                break;
            case 4:
                System.out.println("dort");
                break;
            case 5:
                System.out.println("bes");
                break;
            case 6:
                System.out.println("alti");
                break;
            case 7:
                System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
        }
    }
}
