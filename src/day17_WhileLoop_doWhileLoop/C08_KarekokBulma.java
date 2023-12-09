package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C08_KarekokBulma {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //        sayının tam kare olup olmadığını bulunuz,
        //        tamkare ise true değilse false yazdırınız.
        //        Ornek : input : 16, output: 4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen karakök bulmak icin pozitif bir tamsayı girin");

        int sayi = scanner.nextInt();

        int karekokKontrol = 1;

        int flag = 10;

        // for Loop ile yapalım

        for (int i = 1; i < sayi; i++) {

            if (i * i == sayi) {
                flag++;
                break;
            }

        }
        if (flag == 10) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

        // do while ile yapalım

        karekokKontrol = 1;

        flag = 10;

        do {

            if (karekokKontrol * karekokKontrol == sayi) {
                flag++;
                break;
            }
            karekokKontrol++;
        } while (karekokKontrol * karekokKontrol < sayi);
        if (flag == 10) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}
