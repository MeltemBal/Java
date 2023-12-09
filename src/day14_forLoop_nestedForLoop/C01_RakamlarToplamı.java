package day14_forLoop_nestedForLoop;

import java.util.Scanner;

public class C01_RakamlarToplamı {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip,
        // rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayı giriniz");
        int sayi = scanner.nextInt();

        //önce bana basamak lazım
        int basSayısı = (sayi + "").length();
        int birlerBasamagi = 0;
        int rakamlarToplamı = 0;
        int girilenSayi = sayi;
        for (int i = 0; i < basSayısı; i++) {

            birlerBasamagi = girilenSayi % 10;
            rakamlarToplamı += birlerBasamagi;
            girilenSayi /= 10;
        }
        System.out.println("Girilen" + sayi + "sayısının rakamlar toplamı:" + rakamlarToplamı);
    }
}
