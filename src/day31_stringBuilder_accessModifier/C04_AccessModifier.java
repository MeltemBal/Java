package day31_stringBuilder_accessModifier;

public class C04_AccessModifier {

    private String strPrivate="Java";
    int sayiDefault; // eger gorunur bir access modifier yoksa, default modofier gecerlidir
    protected boolean blProtected;

    public void methodPublic (){

    }

    /*
    Nasıl ki class level'da olusturulan ama deger atanmyan veriable'lara
    Java default deger tanımlıyorsa

    methodlar veya class level'da olusturulan verable'lar için
    access modifier yazılmazsa
    java access modifier olarak "DEFULT ACCESS MODIFIER" tanımlar

    1- En geniş access modifier public ==> Herkes erişebilir .....
    2- Protected ==> içinde bulundugumuz class,parkage ve baska parkage'daki diğer class'lar
    3- default access modifier ==> içinde bulundugu class ve içinde bulundugu package'daki diğer classlar kullanabilir
    4- en dar access modifier : private ==> sadece içinde bulundugu class'dan kullanabilir

     */
    public static void main(String[] args) {
        /*

        Bir obje olusturursak
        içinde bulundugumuz class'daki
        tum access modifier'lara ulasabiliriz

         */

        C04_AccessModifier obj=new C04_AccessModifier();
        System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();

    }
}

