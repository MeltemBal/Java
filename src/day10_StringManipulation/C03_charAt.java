package day10_StringManipulation;

public class C03_charAt {
    public static void main(String[] args) {

        String str= "Java Candir";
        // ilk harfi yazdirin

        System.out.println(str.charAt(0)); // J

        //index =0'dan baslar

        System.out.println(str.charAt(7));

        // son harfini girin
        System.out.println(str.charAt(10)); //r
        System.out.println(str.charAt(11-1)); //r

        System.out.println(str.charAt(str.length()-1)); //

        // eger bir kod yazarken
        //verilen input'taki degişimleri algılasın ve
        //yeni haline göre isteneni yapsın istiyorsak
        //dinamik KOD yazmalıyız
        //bunun için elle yazacagımız index degerleri yerine
        // metnin length'ini kullanabiliriz
        System.out.println(str.length()); //11

        //sondan 3. harfi yazdirın

        System.out.println(str.charAt(str.length()-3)); //d

        //olmayan bir indexi yazdırın
        //System.out.println(str.charAt(20)); //// StringIndexOutOfBoundsException
        //System.out.println(str.charAt(str.length())); // StringIndexOutOfBoundsException
                            //String'de verilen aralıgın dısında hatası

    }
}
