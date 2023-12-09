package day17_WhileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // 1- while parantezinde kontrol ettiğimiz degısken
        //    loop içinde degısştırılmezse sonsuz loop olusur

        int sayi = 5;
        int sayac = 0;

        while(sayi<=10){

            sayac++;
            System.out.print(sayac+ "  " );
        }

        // 2- Eger loop olusrulmadan önce ihtiyac duydugumuz variable'ları
        // biz olusturuyorsak loop'un ilk defa calısmasını ve kullanıcıdan deger
        // almasını ENGELLEMEYECEK bir deger atamaya DİKKAT ETMELİYİZ,

        // kullanıcıdan sayılar isteyin pozitif
        // verilen sayılar pozitif oldugu muddetce
        // sayıları toplayalım ve negatif sayı girildiginde toplamı yazdıralım

        sayi=20;
        int toplam=0;
        Scanner scanner= new Scanner(System.in);

        while (sayi>0){

            System.out.println("Lutfen toplanmak üzere pozitif tamsayılar girin");
            sayi= scanner.nextInt();

            if (sayi>0) toplam += sayi;

            System.out.println(toplam);

            // 3- Eger loop parantezinde yazdıgımız degişken için
            //    loop içerisinde kullanıcıdan deger alıyorsak
            //    aldıgımız degerin loop'u bitirme özelliği OLMAYAN bir deger
            //   oldugundan emin olduktan sonra işlemimizi yapmalıyız



        }

    }
}
