package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        /*
        Kullanıcıdan satır sayısını alıp
        aşagıdaki sekli çizdirin

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { //satır sayısını kontrol eder
            for (int j = 1; j <= i; j++) { // surun sayısı da satıra baglı
                System.out.print(j+ " ");
            }
            System.out.println("");
        }

    }
}
