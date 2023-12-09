package CalısmaKlasörü;

import java.util.Scanner;

public class M03_IfStatemens {
    public static void main(String[] args) {

        //kullanicidan iki sayi isteyin
        //sayi1 == sayi2 --> bravo yazdırin
        //sayi1 %sayi2==0  --> tam boldu yazdirin
        //sayi2>=sayi1 ---> sen buyuksun yazdirin

        Scanner kullanıcı = new Scanner(System.in);
        System.out.println("Lutfen 2 sayi giriniz");

        int sayi1 = kullanıcı.nextInt();
        int sayi2 = kullanıcı.nextInt();

        if (sayi1 == sayi2) {
            System.out.println("Bravo");
        }
        if (sayi1 % sayi2 == 0) {
            System.out.println("Tam böldü");
        }
        if (sayi2 >= sayi1) {
            System.out.println("sen buyuksun");
        }
        }
    }
