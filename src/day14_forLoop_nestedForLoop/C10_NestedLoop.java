package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C10_NestedLoop {
    public static void main(String[] args) {
         /*
        Kullanıcıdan satır sayısını alıp
        aşagıdaki sekli çizdirin

        *
        * *
        * * *
        * * * *
        * * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { //satır
            for (int j = 1; j <= i; j++) { // satırdaki yıldız sayısını
                System.out.print(j + " ");
            }
            System.out.print("* ");
            {
            }
            System.out.println("");
        }
    }
}
