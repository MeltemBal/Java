package day21_arrays_multiDimensionalArrays;

import day20_arrays.C04_ArrayeElementEkleme;

import java.util.Arrays;

public class C03_ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        // var olan bir Array'e yeni deger atamak mümkün mudur

        int[] arr1 = {3, 5, 6};


        // önce istedigimiz arrayi ayri bir array olarak olusturur
        // sonra da bizim array'imize atama yaparız

        int[] geciciArr = {4, 2, 6};

        arr1 = geciciArr;

        // eger yeni atadıgımız array default degerlerden olusan bir array olacaksa
        // new keyword kullanarak direk atama yapabiliriz

        arr1 = new int[5];

        System.out.println(Arrays.toString(arr1)); //[0, 0, 0, 0, 0]

        // olusturulmus bir array'e uzunlugunu degistirecek sekilde
        // bir element eklemek ya da silmek mümkün müdür?

        int[] sayilar = {4, 2, 1};

        // 4. element olarak 3 ekleyin

        // sayilar[3] = 3; //ArrayIndexOutOfBoundsException

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar, 3);

        System.out.println(Arrays.toString(sayilar)); // [4, 2, 1, 3]

        // sayilar arrayine 5. element olarak 9 ekleyin

        sayilar = C04_ArrayeElementEkleme.arrayElementEkle(sayilar, 9);
        System.out.println(Arrays.toString(sayilar)); //[4, 2, 1, 3, 9]

        // array'in ilk elementi olan 4'ü arraydan silin
        // array'i 4 elementli hale getirin

        // var olan bir array'e uzunlugu degisterecek sekilde yeni element
        // ekleyemeyiz ya da silemeyiz
        // bunun yerine istenen elementlere sahip yeni bir array olusturup
        // sonra yeni array'i eski array'e deger olarak atayabiliriz

        // önce uzunlugu eski array'den 1 eksik olan yeni bir array olusturalım
        int[] yeniSayilar = new int[sayilar.length - 1];
        // Eski array'deki silinecek element dısındaki elementleri
        // yeni array'e kopyalayalım

        for (int i = 0; i < yeniSayilar.length; i++) {

            yeniSayilar[i] = sayilar[i + 1];

        }
            sayilar=yeniSayilar;
            System.out.println(Arrays.toString(sayilar));//[2, 1, 3, 9]

    }
}
