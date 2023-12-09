package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan satır  ve sütun sayısını alıp
        aşağıdaki şekilde tablo oluşturun

        2 3 4 5 6
        3 4 5 6 7
        4 5 6 7 8
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Her satırda kac sayi olacagını giriniz");
        int sutun = scanner.nextInt();

        for (int i = 0; i <= 3; i++) {  // satırları

            for (int j = 0; j <= 5; j++) { //hr satırdaki sütunları

                System.out.println(i + j + " ");
            }
            System.out.println(" ");
        }
    }
}

