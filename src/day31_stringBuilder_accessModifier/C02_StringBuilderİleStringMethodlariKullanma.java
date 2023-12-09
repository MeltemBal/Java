package day31_stringBuilder_accessModifier;

public class C02_StringBuilderİleStringMethodlariKullanma {

    public static void main(String[] args) {

        /*
        StringBuilder ile kullanılabilen methodlardan
        String char gibi baska data türünden sonuc döndürenler
        StringBuilder'i kalıcı olarak degiştirmezler
         */
        StringBuilder sb=new StringBuilder("Java Candir");

        // sb'yi büyük harfle yazdırın

        System.out.println(sb.toString().toUpperCase()); // JAVA CANDIR

        // StringBuilder'da olmayan String özelliklerini kullanmak istersek
        // önce toString() ile String'e çevirir, sonra istediğimiz String method'unu kullanabiliriz
        // Peki degişiklik kalıcı oldu mu?

        System.out.println(sb); // Java Candir

        // Peki atama yapsak kalıcı olur mu?

        // sb=sb.toString().toUpperCase();
        // farklı data türündeki non prmitive variable'lar
        // birbirine atanamaz veya birbiriyle karsılastırılamaz

        StringBuilder sb1= new StringBuilder("Java");

        // eger sb'nin degerini buyuk harf yapıp,
        // kalıcı olark degşiştirmek istiyorsak

        sb= new StringBuilder(sb.toString().toUpperCase());

        System.out.println(sb); //JAVA CANDİR

        System.out.println(sb.substring(5)); //CANDİR return type String

        System.out.println(sb); //JAVA CANDİR

        System.out.println(sb.charAt(6)); //A  return type char

        System.out.println(sb); // JAVA CANDİR

        System.out.println(sb.toString()); //JAVA CANDİR



    }
}
