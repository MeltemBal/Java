package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C08_NestedForLoop {
    public static void main(String[] args) {

        /*
         Kullanıcıdan satır  ve sütun sayısını alıp
        aşağıdaki şekilde tablo oluşturun

        * * * * *
        * * * * *
        * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("satır sayısını giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Her satırda kac yıldız olacagını giriniz");
        int sutun = scanner.nextInt();

        for (int i = 0; i <= satir; i++) {  //satirlari

            for (int j = 1; j <= sutun; j++) { //satırdaki sutunları
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
