package day31_stringBuilder_accessModifier;

public class C03_Equals_CompareTo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";
        StringBuilder sb1 = new StringBuilder(str);

        // System.out.println(sb==str); farklı data türündeki non-primitive'ler == ile karşılastırılamaz

        System.out.println(sb == sb1); //false
        System.out.println(sb==sb); // true
        // == ile sb'lerin karşılastırılmasına itiraz etmez
        // ama kendisi ile karşılastırılması hariç sonuç hep false olur

        System.out.println(sb.equals(str)); //false
        System.out.println(sb.equals(sb1)); // false

        System.out.println(sb.equals(sb)); //true
        // Equals ile String veya StringBuilder'lar ile
        //karşılastırılmasına itiraz etmez
        // ama kemdisi ile karsılastırılması hariç, sonuç hep false olur


        // StringBuilder'ların aynı metne sahip olup olmadıgını
        //ogrenmek için compareto kullanılır

        StringBuilder sb2= new StringBuilder("Hava");
        StringBuilder sb3= new StringBuilder("Tava");
        StringBuilder sb4= new StringBuilder("Jale");
        StringBuilder sb5= new StringBuilder("Jandarma");

        System.out.println(sb.compareTo(sb1)); //Java=> Java sonuç 0
        System.out.println(sb.compareTo(sb2)); //Java=> Hava sonuç 2
        System.out.println(sb.compareTo(sb3)); //Java=> Tava sonuç -10
        System.out.println(sb.compareTo(sb4)); //Java=> Jale sonuç 10
        System.out.println(sb.compareTo(sb5)); //Java=> Java sonuç 8

        /*
        CompareTo() ile karşılastırılan StringBuilder'lar
        metin olarak aynı ise sonuç 0 olur

        Metinler ayı degilse harf harf karsılastırır farklı olan iilk harfin
        diğer StringBuilder'daki harf ile arasında ascii tablosunda
        kac karakter oldugunu söyler
         */


    }
}
