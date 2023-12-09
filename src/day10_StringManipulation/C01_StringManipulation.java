package day10_StringManipulation;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String str = "Java Candir";

        //str'i buyuk harflerle yazdırın
            System.out.println(str.toUpperCase()); //JAVA CANDIR
        //str'i KUCUK harflerle yazdırın
        System.out.println(str.toLowerCase()); //Java candir

        //String metodları kullanıldıgında orjinal metin DEGISMEZ
        //degidikliği kalici olarak yapmak istersek ATAMA yapmalıyız

        System.out.println(str); //Java Candir

        str= str.toUpperCase();
        System.out.println(str); //JAVA CANDIR

                //str 'i kücük harfe cevirin
        // ancak I harfi kücük harfe cevrildiğinde ingilizce i olur

        System.out.println(str.toLowerCase()); //Java candir

        //eğer metine ingilizcede olmayan I'yi
        //Turkce kucuk ı'ya cevirmek istersek
        //toLowerCase(Locale...) kullanılabilir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır

        System.out.println("Ahmet Çağrı");





    }
}
