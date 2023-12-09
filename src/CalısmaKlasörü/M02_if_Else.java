package CalısmaKlasörü;

import java.util.Scanner;

public class M02_if_Else {
    public static void main(String[] args) {

        Scanner okuyucu = new Scanner(System.in);
        System.out.println("Isminiz nedir");
        String isim = okuyucu.next();
        System.out.println("Merhaba," + isim);
        System.out.println("Yasiniz kac");
        int yas = okuyucu.nextInt();
        System.out.println("Sansli sayiniz");

        int harfSayisi = isim.length();

        int sansliSayi = 0;
        if (yas < 15) {
            sansliSayi = (harfSayisi * yas) % 10;
        } else if (yas < 20) {
            sansliSayi = (yas * yas - harfSayisi) % 10;
        } else if (yas < 40) {
            sansliSayi = (yas + harfSayisi) % 10;

            if (sansliSayi < 0)
                sansliSayi = sansliSayi * 1;
            System.out.println("Sansli sayi");


        }


    }
}
