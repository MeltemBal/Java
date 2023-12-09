package day34_inheritanceConstructorCall;

public class C05_Child extends C04_Parent {

    String str = "Java daha guzeldir";
    String t = "Java java java";
    int sayi = 15;
    int b = 25;

    public static void main(String[] args) {

        C05_Child obj = new C05_Child();
        obj.method1();
    }

    public void method1() {

        /*
        Herhangi bir scope'da bir variable kullanmak istediğimizde
        o variable'ın degerini bulmak için
        java
            - önce içinde bulundugu scope
            - scope'da bulamazsa class level'a
            - class'da bulamazsa parent'a
            - paren'ta bulamazsa grand parent'lara bakar
            ve ilk buldugunu kullanır

            EGER this.variable dersek
            bu durumda arama işlemini yaparken
            içinde bulundugumuz scope'u atlayıp
            aramaya class level'dan baslar

            EGER super.variable dersek,
            scope ve class level'ı atlayıp
            aramaya parenr class'dan baslar

            ÖNEMLİ NOT: aramaya baslayacagı yeri Java'ya söyleyince
                        Java soyledeiğimiz yerden baslar ve yukarda yazılan
                        sıralama ile aramaya devam eder
                        eger aradıgı variable'ı
                        aradıgı basamaklarda bulamazsa CTR verir.
         */

        String t = "Hava cok guzel";
        int a = 27;
        int b = 37;
        String str = "Her sey guzel olacak";

        System.out.println(str); // Her sey guzel olacak
        System.out.println(this.str); // Java daha guzeldir
        System.out.println(super.str); // Java guzeldir

        System.out.println(a);// 27
        System.out.println(this.a); // 30
        System.out.println(super.a); // 30
        System.out.println(b); // 37
        System.out.println(this.b); // 25
        //System.out.println(super.b); // CTE
        System.out.println(t); // Hava cok guzel
        System.out.println(this.t); // Java java java
        //System.out.println(super.t); // CTE
        System.out.println(sayi); // 15
        System.out.println(this.sayi); // 15
        System.out.println(super.sayi); // 20
        System.out.println(s); // Java Candir
        System.out.println(this.s);  // Java Candir
        System.out.println(super.s);  // Java Candir



    }

}
