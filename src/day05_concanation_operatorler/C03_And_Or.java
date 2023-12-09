package day05_concanation_operatorler;

import java.util.Scanner;

public class C03_And_Or {
    public static void main(String[] args) {

        //kullanıcıdan not isteyin
        //girilen not 0 ile 100 arasındaysa true, yoksa false yazdırsın
        // 0 ve 100 dahil

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");
        int not= scanner.nextInt();

        System.out.println(not>=0 && not <=100);

        //not 50'den küçükse veya 80'den büyükse true
        //arasında ise false yazdırın
        //eger istenen durum bir aralık ise And operatörü kullanılır
        // eger istenen durum bir aralıgın dışında kalan bölge ise
        //Ya OR kullanılır
        //ya da aralığı AND ile yazıp başına ! koyarız

        System.out.println(not< 50 || not >80);

        //önce istenmeyen durumu yazalım

        System.out.println( ! (not>=50 && not <=80)); // ! istenmeyen durum

            Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String isim= scan.next();
        System.out.println(isim);










    }
}
