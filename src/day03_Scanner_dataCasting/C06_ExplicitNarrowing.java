package day03_Scanner_dataCasting;

public class C06_ExplicitNarrowing {
    public static void main(String[] args) {

        //Explicit narrowing yapıldıgında
        //data kayıpları olabilir
        //hatta bazen baska bir dataya dönüsebilir

        double dbl = 34.7;

        int sayi = (int) dbl;

        System.out.println(sayi); //34// ondalık kısmını atar

        int sayi1 = 23 ;
        byte byt = (byte) sayi1;

        System.out.println("23'un byte olarak degeri" + byt);//23

        int sayi2 = 130;
        byt = (byte) sayi2;
        System.out.println("130'un byte olarak degeri" + byt); //-126


        int sayi3 = 260;
        byt = (byte) sayi3;
        System.out.println("260'un byte olarak degeri" + byt); //4


        int sayi4 = 2600;
        byt = (byte) sayi4;
        System.out.println("2600'un byte olarak degeri" + byt); //40

        int sayi5 = 22000000;
        sayi5 = sayi5 + 5000000; //casting yok sınır aşıldı

        System.out.println(sayi5); // -1694967296

    }
}
