package day03_Scanner_dataCasting;

public class C05_dataCasting {

    public static void main(String[] args) {

        // küçük data degerindeki degeri büyük data türündeki variable'a atamak isterseniz
        // java bunu otomatik olarak yapar buna auto wideninig denir

        byte a = 15;

        short b = a;

        int c = b;

        Long d = (long) c;

        double e = d;

        // eger buyuk data türündeki degere küçük data degerindeki variable' a
        // atamak istersek java bunu otomatik olarak yapmaz sorumluluğu
        // almamızı ister.sorumluluk almak için büyük data türündeki degerin onune
        //parantez içinde cevirmek istediğimiz küçük data yazarız
        // explicit narrowing


        double f = 34.5;

        int g = (int) f;

        short h = (short) g;

        byte k = (byte) h;


    }
}
