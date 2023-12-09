package day31_stringBuilder_accessModifier;

public class C01_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.capacity()); //27
        System.out.println(sb1.length()); //11

        sb1.append(", bundan suphe eden mi var ?");

        System.out.println(sb1); //Java Candir, bundan suphe eden mi var
        // StringBuilder mutable oldugundan
        // method ile yapılan degişiklikler kalıcı olur

        System.out.println(sb1.capacity()); //56
        System.out.println(sb1.length()); //39

        // capasity ve lenght 'i eşitlemek isterseniz

        sb1.trimToSize();
        System.out.println(sb1.capacity()); //39
        System.out.println(sb1.length()); //39

        String str = "Hava çok guzel";

        sb1.append(str, 5,9);

        // sb1'in sonuna str'ın belirtilen aralıgındaki karakterleri ekler

        System.out.println(sb1); //Java Candir, bundan suphe eden mi var ?çok

        sb1.insert(5,"niye bu kadar ");
        // sb1'in istenen yerine verilen string'i insert eder

        System.out.println(sb1); //Java niye bu kadar Candir, bundan suphe eden mi var ?çok

        sb1.insert(18, str,4,8);
        // ekleme yapılacak metnin neresine yapılacagını(sb1)
        // ekleme yapılmak istenen string'in adı(str)
        // eklemenın nerden başlayıp nerde bitecegi (4,8)
        /*
        18.index'e ait str'in istenen parcasını insert eder
         */

        System.out.println(sb1); // Java niye bu kadar çok Candir, bundan suphe eden mi var ?çok

        sb1.delete(5,10); //Java bu kadar çok Candir, bundan suphe eden mi var ?çok

        sb1.deleteCharAt(54);

        System.out.println(sb1); //Java bu kadar çok Candir, bundan suphe eden mi var ?ço

        System.out.println(sb1);

        sb1.delete(52,55);

        System.out.println(sb1); //Java bu kadar çok Candir, bundan suphe eden mi var ?

        // bu cümleyi terse çevirin

        System.out.println(sb1.reverse());
        //? rav im nede ehpus nadnub ,ridnaC koç radak ub avaJ

        System.out.println(sb1);// ? rav im nede ehpus nadnub ,ridnaC koç radak ub avaJ

        sb1.reverse();

        System.out.println(sb1); //Java bu kadar çok Candir, bundan suphe eden mi var ?

        // Stringbuşlder mutable oldugundan,
        // sout'un içinde bile yaptıgımız degişiklikler kalıcı olur

        sb1.replace(23,49,"");

        System.out.println(sb1);//Java bu kadar çok Candir ?





    }
}
