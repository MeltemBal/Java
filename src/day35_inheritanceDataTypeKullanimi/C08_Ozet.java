package day35_inheritanceDataTypeKullanimi;

public class C08_Ozet {

    /*

    Java'da data type kullanımını su sekilde de sınıflandırabiliriz

    1- Data türü ve constructor aynı ise

        objenin özellikleri ister VARİABLE isterse METHOD olsun
        objenin oldugu class'dan aramaya baslanır
        paren'lara dogru devam edilir
        İLK BULUNAN deger kullanılır

        Deger bulunamazsa CTE olur

     2-    Data türü ve constructor farklı oldugunda
           özelliğin VARIABLE veya METHOD olması farklı işleyiş gerektirir.

           - Eger VARIABLE ise
             data türünün oldugu class'dan aramaya baslayıp, parent'lara dogru devam ederiz.
             ve İLK BULUNAN degeri kullanırız.
             variable'i bulamazsak CTE olur

            - Eger Method ise
            data türünün oldugu class'dan aramaya baslayıp, parent'lara dogru devam ederiz.
            eger bulamazsak CTE olur

            method'u BULUNCA hemen kullanmayız.
            Constructor'ın oldugu class'a kadar
            daha güncel hali(Overriding Method) var mı diye bakılır
            EN GÜNCEL deger kullanılır




     */
}
