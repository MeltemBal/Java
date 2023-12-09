package day32_encapsulation;

public class C06_Runner {

    public static void main(String[] args) {

        /*
        Bir classtaki tüm variable'lar private yapılıp
        sadece getter methodları olusturulursa
         bu class read only(immutable) olur
         */

        /*
        Bir variable'ı private yapıp
        hem getter hem de setter metodu olusturursak
        public gibi olur.

       Bu yöntem bazı developer'lar tarafından
       Yapılan işleme vurgu yapmak için kullanılır
         */

        C05_Encapsulation obj = new C05_Encapsulation();

        // isme deger atayabilir miyim?

        obj.setIsim("Ali");
        // isim variable'inin degerini yazdıralım

        System.out.println(obj.getIsim()); // Ali

        // soyisime deger atayalım

        obj.soyisim= "Çelik";

        // soyisim veriable'ının degerini yazdıralım

        System.out.println(obj.soyisim); //Çelik


    }
}
