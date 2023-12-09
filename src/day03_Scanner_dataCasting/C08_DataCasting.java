package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C08_DataCasting {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 3;

        System.out.println(sayi1 / sayi2); //6,6666666....6

        //iki int sonuc int olur

        double sayi3 = 3;
        System.out.println(sayi1 / sayi3); //6,6666666666667

        //kullanıcıdan 2 tamsayı alıp 1.sayıyı 2.sayıya bolun
        //sonucu ondalıklı olarak yazdırın

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen 2 tamsayi giriniz");
        sayi1= scanner.nextInt();
        sayi2= scanner.nextInt();

        System.out.println("Verien sayilarin bolumu:"+(sayi1/sayi2));

        double sonuc= (double) sayi1/sayi2;
        System.out.println("verilen sayilarin bolumu"+sonuc);






    }
}
