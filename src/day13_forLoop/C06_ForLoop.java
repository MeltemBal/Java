package day13_forLoop;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan baslangic ve bitis degeri olarak
        // pozitif sayilar alin, sinirlar dahil olarak aralarindaki
        // tum sayilarin toplamini yazdirin. Bitis degeri baslangic degerinden
        //kucuk olsa da program calissin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen başlangıc ve bitiş degeri için pozitif tamsayilar girin");
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();

        int toplam = 0;

        if (bitis < baslangic) {
            for (int i = baslangic; i <= bitis; i++) {
                toplam += i;
            }
        } else { //bitis< baslangıc

            for (int i = bitis; i <= baslangic; i++) {
                toplam += i;
            }
            System.out.println("Girilen sayilarin arasindaki tum sayilarin toplami : " + toplam);

        }
    }
}

