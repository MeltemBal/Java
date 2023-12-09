package day03_Scanner_dataCasting;

import java.util.Scanner;

public class C07_CharDataTuru {
    public static void main(String[] args) {

        //char özel bir data türüdür
        //'4' 'h'  içine tek bir karakter alır
        // char data türündeki variable 'lar ve degerler
        //matematiksel işlemlerde kullanılırsa ASCII table'daki
        //decimal karşılıkları ile işleme girerler.

        System.out.println("a+b");  //97+98=195
        System.out.println('8'+'1'); //48 +49 =97

        int sayi= 'c';
        System.out.println(sayi);  //99

        char chr = 101;
        System.out.println(chr);



        //kulanıcıdan bir karakter ısteyin
        //kullanıcının girdiği karakterden sonraki 3 karakteri yazın
        // örnek input: l  output: m,n,o

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar= scanner.next().charAt(0);

        System.out.println("girilen karakter:"+ (girilenChar));
        System.out.println("girilen karakterden 1 sonraki karakter"+(char)(girilenChar+1));
        System.out.println("girilen karakterden 2 sonraki karakter"+(char)(girilenChar+2));
        System.out.println("girilen karakterden 3 sonranki karakter"+(char)(girilenChar+3));

    }
}
