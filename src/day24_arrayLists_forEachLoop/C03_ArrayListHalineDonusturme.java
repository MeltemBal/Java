package day24_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayListHalineDonusturme {

    public static void main(String[] args) {

        Integer[] sayilaArray = {1, 2, 3, 6, 7, 4, 3, 5};
        /*

            Bir array'i list haline getirmek için en guvenilir yontem
            bir loop ile tum elementleri list'e kopyalamaktır

            Aslında daha kısa bir yol vardır
            ama iki buyuk yan etkisi oldugundan
            bunlara d,ikkatb etmek gerekir

            1- Olusturdugumu liste
            Arrays class'i ile olusturuldugundan
            ekleme / çıkarma gibi listenin uzunlugunu degiştirecek
            işlemlere izin vermez

            2- Array ve bu array'den olusturulan list birbiri ile bağımlı kalır
            Birinde sonradan yapılan degişiklikler
            otomatik olarak digerine de işlenir

         */

        List<Integer> sayilarListesi = Arrays.asList(sayilaArray);

        System.out.println("Sayilar Listesi: " + sayilarListesi);
        // Sayilar Listesi : [1,2,3,6,7,4,3,5]

        // sayılar listesine 9'u ekleyin

        // sayilarListesi.add(9); // UnsupportedOperationException

        // Listeden 7'yi silin

        Object silinecekElement = 7;

        //sayilarListesi.remove(silinecekElement);UnsupportedOperationException

        System.out.println("Sayilar Listesi:" + sayilarListesi);
        System.out.println("Sayilar array'i: " + Arrays.toString(sayilaArray));

        // array'in 2. index'indeki sayiyi 10 yapin
        sayilaArray[2] = 10;

        System.out.println("Array update sonrasi Sayilar Listesi" + sayilarListesi);
        System.out.println(" Array update sonrası Satilar Array:" + Arrays.toString(sayilaArray));


        List<Integer> fiyatList = new ArrayList<>();
        fiyatList.add(10);
        fiyatList.add(20);
        fiyatList.add(30);

        Integer[] kontrolArrayi = {10, 20, 30};

        // fiyat listesinin kontrol listesi olarak verilen array ile
        // aynı oldugunu test edin

        List<Integer> kontrolListesi = Arrays.asList(kontrolArrayi);

        if (fiyatList.equals(kontrolListesi)) {
            System.out.println("test PASSED");
        } else {
            System.out.println("test FAILED");
        }


    }

}
