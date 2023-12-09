package day04_wrapperClass_increment;

public class C05_Preincrement_postincrement {
    public static void main(String[] args) {

        int a = 10;

        a++;

        System.out.println("a nin 11 satirdaki degeri:" + a);

        //a nin 11. satirdaki degeri

        a = 10;

        ++a;

        System.out.println("a nin 19 satırdaki degeri:" + a);
        //a nin 19 satırdaki degeri=11

        /*
        java'da 3 farklı sekılde deger artıtma mümkün

        -sayi=sayi+1;
        -sayi+=1;
        sayi++;

        sadece 3. yöntem için
        java ihtiyaca görer kullabılmesi amacıyla
        iki farklı kullanım olusturmustur
        sayi++ yazabildiğimiz gibi ++sayi' da yazabiliriz

         */
        int b = 10;
        System.out.println("++b yazdıgımda konsolda yazdirilan:" + ++b); //11
        System.out.println("++b 'den 1 satir sonra konsolda b degeri:" + b); //11

        int c = 10;
        System.out.println("c++ yazdıgımda konsolda yazdirilan:" + c++); //10
        System.out.println("c++ 'den 1 satir sonra konsolda b degeri:" + c); //11

        int x = 10;

        int y = x++;
        System.out.println("x:" + x + ",y:" + y); //x:11 y:10

        x = 10;
        y = ++x;
        System.out.println("x:" + x + ",y:" + y); // x:11 y:11


        x = 10;
        System.out.println("x'nin degeri:" + ++x);
        y =x++;
        System.out.println("y'nin degeri:" + y);
        c= y++ + x;
        System.out.println("c'nin degeri:"+c);
        System.out.println("Son toplam:"+(x+y+c));






    }
}
