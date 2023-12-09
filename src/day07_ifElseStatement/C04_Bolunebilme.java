package day07_ifElseStatement;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir tamsayı alın
        // 3ile bölünrbiliyorsa 3'ün katı
        // 5 ile bölünebiliyorsa 5'in katı
        //hem 3 hem de 5 ile bölünebiliyorsa ' süper sayı' yazdırın

        /*
        eger sartlar birbiri ile ilgili ise en önce
        en secici olanı yazmalıyız.

        -Eger ifade else ile bitmezse
        if else statement tüm degerleri KAPSAMIYOR demektir
        yani bazı degerşeri girdiğimizde kod calısır ama
        hiç bir sonuç üretmez
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayı giriniz");

        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Super Sayı");
        }else if (sayi % 3 == 0) {
            System.out.println("3'ün katı");

            }else if (sayi % 5 == 0) {
                System.out.println("5'in katı");
            }

            }


        }
