package day28_passByValue;

public class C03_PassByValue {

    public static void main(String[] args) {

        // verilen fiyat üzerinden %10 indirimli fiyat hesaplayıp
        // indirimli fiyatı yazdıran bir method olusturun

        /*
        Farklı scope'ların içinde
        aynı isimde varible'lar olabilir
        Bu variable'larda yapılan degişiklikler
        sadece içinde oldukları scope'da gecerlidir
         */

        double fiyat = 200;

        yuzde10IndirimliFiyatYazdir(fiyat);
        System.out.println(fiyat); //200

    }

    public static void yuzde10IndirimliFiyatYazdir(double fiyat) {

        fiyat = fiyat * 90 / 100;

        System.out.println("İndir,mli fiyat:" + fiyat); // 180
    }


}
