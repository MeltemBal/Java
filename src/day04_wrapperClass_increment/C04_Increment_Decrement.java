package day04_wrapperClass_increment;

public class C04_Increment_Decrement {
    public static void main(String[] args) {

        int a = 10;
        //a'nin degerini olusturacağımız bir b veriable'na atayın
        //sonra a'nin degerini 1 artırtın

        int b = a;
        a++;

        System.out.println("a:" + a + ",b:" + b); //a=11 , b=10

        a = 10;

        //a'nın degerini 1 artırın
        //sonra a'ninn degerini b'ye atayın

        a++;

        b = a;

        System.out.println("a:" + a + ",b:" + b);

        //a'nın degerini yazdırın
        //sonra a'nın degerini 1 artırın
        System.out.println("a nin degeri:"+a); //10
        a++;

        //burada a'nın degeri :11


        a=10;
        //a'nın degerini 1 artırın
        //sonra a'nın degerini yazdırın

        a++;

        System.out.println("a nin degeri:"+a); //11

        //burada a'nın degeri 11


    }
}
