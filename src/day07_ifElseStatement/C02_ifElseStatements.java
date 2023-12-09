package day07_ifElseStatement;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class C02_ifElseStatements {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan bir harf isteyin, girilen karakter
        kucuk harf ise onu buyuk harf olarak yazdirin,
        yoksa girilen karakteri girildigi gibi yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");

        char girilenHarf = scanner.next().charAt(0);

        //1. yöntem

        if (Character.isLowerCase(girilenHarf)) {
            Character.toUpperCase(girilenHarf);
        } else {
            System.out.println(girilenHarf);
        }
        //2.yöntem

        if (girilenHarf >= 'a' && girilenHarf <='z') {
            System.out.println((char) (girilenHarf));
            }else {
                System.out.println(girilenHarf);
            }

        }


    }
