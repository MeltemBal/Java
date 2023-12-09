package day10_StringManipulation;

import java.util.Scanner;

public class C02_Equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMeT";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8; //Ahmet

        //String case sensitive'dir.(büyük-kücük harf duyarlıdır). str1,str2,str3 ve
        //str4'ün degerleri birbirinden farklıdır
        //str1, str5, str66 ve str9'un degerleri ise aynıdır
        //String'de karşılastırma için == kullanırsanız metni aynı olan stringlerde bile
        //false dönebilir
        // == hem metin degerine hem de referansa baktıgı için metni aynı olan
        // farklı String'ler için farklı sonuclar verebilir


        System.out.println(str1 == str5); //Ahmet == Ahmet true
        System.out.println(str1 == str6); //Ahmet == Ahmet false
        System.out.println(str1 == "Ahmet"); //Ahmet == Ahmet true
        System.out.println(str1 == str9); // Ahmet == Ahmet false

        //İki String'in metin olarak aynı olup olmdıgını kontrol etmek için
        //ŞİMDİLİK  == kullanmayacagız
        //Stringlerde  metin olarak aynı olmayı kontrol için
        //equals kullanılır

        //equals metodu() aynı metinler için true doner
        System.out.println(str1.equals(str5)); //Ahmet == Ahmet true
        System.out.println(str1.equals(str6)); //Ahmet == Ahmet true
        System.out.println(str1.equals("Ahmet")); //Ahmet == Ahmet true
        System.out.println(str1.equals(str9)); //Ahmet == Ahmet true

        //equals metodu() aynı metnin farklı yazımları için false sonucunu verir
        System.out.println(str1.equals(str2)); //Ahmet == AHMET false
        System.out.println(str1.equals(str3)); // Ahmet == ahmet false
        System.out.println(str1.equals(str4)); // Ahmet == AhMeT false

        // eger BUYUK KUCUK HARF FARKLI YAZIMLARI DA EŞİT KABUL EDELİM DERSENİZ
        System.out.println(str1.equalsIgnoreCase(str2)); //Ahmet == AHMET true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ahmet == ahmet true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ahmet == AhMeT true

        //benim sifrem 1453.Istanbul

}
}