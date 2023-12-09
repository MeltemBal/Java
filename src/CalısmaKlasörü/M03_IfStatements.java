package CalısmaKlasörü;

import java.util.Scanner;

public class M03_IfStatements {
    public static void main(String[] args) {

        //kullanicidan sayi isteyin
        // sayi1 >=100              --> merhaba yazdirin
        //eger sayi1 %2 == 1        --> tam bolumemedi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        int sayi1 = scanner.nextInt();

        if (sayi1 >= 100){
            System.out.println("Merhaba");
        }
        if (sayi1 %2 == 1){
            System.out.println("tam bolunemedi");
        }

    }
}
