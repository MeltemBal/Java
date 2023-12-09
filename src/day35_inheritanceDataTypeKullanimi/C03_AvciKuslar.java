package day35_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {

    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga= "sivri gagali";

    public static void main(String[] args) {

        /*
        Eger özellikler variable olaral olusturulursa
        güncel bilgiye bakılmaz
        obje hangi data türünü kullanmıssa o class'daki
        diğer objelerle aynı özellikleri tasır

        bir objenin hangi degerleri alacagını bulmak için
        OBJENİN DATA TÜRÜ olan class'dan aramaya baslarız
        ve ilk buldugumuz degeri kullanırız

        aradıgımız variable'ı bulamazsak CTE olur

         NOT : Eger ozellikler variable olarak olusturulduysa
               Consturoctor'in variable'larin degeri uzerinde hicbir etkisi olmuyor
               Tum degerler data type'i olan class'a gore belirleniyor
         */
        C03_AvciKuslar avciKus1=new C03_AvciKuslar();

        System.out.println(avciKus1.omur); // yasar ve olur H
        System.out.println(avciKus1.solunum); // akcigerler nefes alirlar K
        System.out.println(avciKus1.cogalma); // yumurta K
        System.out.println(avciKus1.kanat); // kanatlıdır K
        System.out.println(avciKus1.hareket); // ucarlar AVK
        System.out.println(avciKus1.beslenme); // et AVK
        System.out.println(avciKus1.gaga); // sivri gagalıdır AVK
        System.out.println(avciKus1.pence); // pencelidir AVK

        C02_Kuslar avciKus2= new C03_AvciKuslar();
        System.out.println(avciKus2.omur); // yasar ve olur H
        System.out.println(avciKus2.solunum); // akcigerler nefes alirlar K
        System.out.println(avciKus2.cogalma); // yumurta K
        System.out.println(avciKus2.kanat); // kanatlıdır K
        System.out.println(avciKus2.hareket); // hareket ederler H
        System.out.println(avciKus2.beslenme); // beslenirler H
        System.out.println(avciKus2.gaga); // gagalıdır K
        // System.out.println(avciKus2.pence); // CTE

        C01_Hayvanlar avciKus3= new C03_AvciKuslar();
        System.out.println(avciKus3.omur); // yasar ve olur H
        System.out.println(avciKus3.solunum); // nefes alirlar H
        System.out.println(avciKus3.cogalma); // yumurta H
        // System.out.println(avciKus3.kanat); // CTE
        System.out.println(avciKus3.hareket); // hareket ederler H
        System.out.println(avciKus3.beslenme); // beslenirler H
        // System.out.println(avciKus3.gaga); // CTE
        // System.out.println(avciKus3.pence); // CTE

        System.out.println("======");
        C02_Kuslar kus1= new C02_Kuslar();
        System.out.println(kus1.omur); // yasar ve olur H
        System.out.println(kus1.solunum); // akcigerler nefes alirlar K
        System.out.println(kus1.cogalma); // yumurta K
        System.out.println(kus1.kanat); // kanatlıdır K
        System.out.println(kus1.hareket); // hareket ederler H
        System.out.println(kus1.beslenme); // beslenirler H
        System.out.println(kus1.gaga); // gagalıdır K
        // System.out.println(kus1.pence); // CTE

    }


}
