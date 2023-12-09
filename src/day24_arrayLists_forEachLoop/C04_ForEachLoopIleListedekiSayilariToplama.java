package day24_arrayLists_forEachLoop;

import java.beans.beancontext.BeanContextChild;
import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoopIleListedekiSayilariToplama {

    public static void main(String[] args) {
        /*
        For*-Each loop
         birden cok element barındıran yapılan için kullanılır

         For each loop'un görevi verdiğimiz
         cok eleman barındıran yapıdaki
         TÜM ELEMENTLERİ bize getirmektir

         Bu işlem için For-Each Loop'a 3 bilgi gereklidir
         1- Bize getirecegi elementlerin data türü
         2-Loop içinde bu elementlere verecegimiz isim(bizim oğlanın adı)
         3- Bu elementleri nereden alıp biz getireceği

         For Each Loop index kullanmadıgı için
         elemnları sıralı getirme mecburiyeti yoktur
         Genellikle sıralı getireceg varsayılarak işlem YAPILAMAZ

               */

        Integer[] arr = {3, 5, 1, 2, 6, 4, 5,1, 7, 8, 4, 2, 5, 6};

        List<Integer> sayilar = new ArrayList<>();

        // Index kullanmadan arr'deki tüm elemenleri
        //sayilar listesine kopyalayın

        for (Integer each : arr
        ) {
            sayilar.add(each);
        }

        System.out.println("Sayilar Listesi :" + sayilar);
    // Sayilar Listesi :[3, 5, 1, 2, 6, 4, 1, 7, 8, 4, 2, 5, 6]

    // index kullanmadan sayılar listesindeki
    // tüm elemenlerin toplamını yazdırın

    int toplam = 0;

        for (Integer each:sayilar
             ) {
            toplam +=each;
        }
        System.out.println("Sayilar listesindeki tüm elementlerin toplami :"+ toplam); //59


}
}





