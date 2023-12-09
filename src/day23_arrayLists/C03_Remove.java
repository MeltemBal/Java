package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Remove {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); // [3, 5, 2, 0]
        /*
        Remove 2 sekilde yapılabilir
        Remove(index)
        Remove(object)

        sayilar(0) eleman 0 mi yoksa index 0 mi?

        Java da her sey nettir.
        Eger listemiz Integer'lardan olusuyorsa
        Java parametre oalark yazdıgımız int sayıyı direk index kabuleder

        Eger element olarak herhangi bir sayıyı silmek isterseniz
        once bir object olarak o sayıyı tanımlamalı
        sonra silmelisiniz
        */

        System.out.println(sayilar.remove(0)); // 3

        System.out.println(sayilar); // [5, 2, 0]
        // eleman olarak 5'i silmesini istersek
        // önce bir obje olarak 5'i tanımlamalıyız

        Object silinecekElement =5;

        sayilar.remove(silinecekElement);

        System.out.println(sayilar); //[2, 0]



    }
}
