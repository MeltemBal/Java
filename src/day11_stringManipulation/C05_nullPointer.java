package day11_stringManipulation;

public class C05_nullPointer {

    public static void main(String[] args) {

        String str;

        //System.out.println(str);
        //bir varable'ı deger atamadan olusturabilirsiniz
        // ama deger atamadan kullanamazsınız

        String str2 = "";
        System.out.println("Str2'in degeri:" + str2 + "====");
        System.out.println("Str2'nin uzunlugu:" + str2.length()); //0

        //str2'ye deger"" atayabiliriz
        //ama bu durumda Java bu variable!a bir deger atandıgını kabul eder
        //"" degeri atananları dolu kabul eder
        //baska data turlerinde hiclik atama sansı olmaz

        //null pointer Java tarafından özel bir görev ile olusturulnustur
        //bir variable!ın deger atanmamış oldugunu ısaretler
        // null bir deger degil işaretçidir

        String str3 = null;
        System.out.println(str3); //null

        //null primitive variable'lara yazılamaz
        //sadece non-primitive'lere yazılır

        System.out.println(str3 + "Java"); // nullJava

        //null olarak işaretlenen variable!lar SADECE yazılabilir
        // deger atamadan baska işme isterseniz
        //NullPointerException verir

        //System.out.println(str3.length()); //NullPointerException
        //System.out.println(str3.concat("Java")); //NullPointerException

        String str4 ="123";
        System.out.println(Integer.parseInt(str4)+5);




    }
}
