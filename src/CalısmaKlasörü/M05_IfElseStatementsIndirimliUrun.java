package CalısmaKlasörü;

import java.util.Scanner;

public class M05_IfElseStatementsIndirimliUrun {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Satin aldıgınız ürün adedini giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("Aldıgınız urunun indirimsiz fiyatını giriniz");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Musteri indirim kartiniz var mi? E:Evet , H:Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        int indirimOrani = 0;

        if (urunAdedi > 10) { // 1. şart seti ana üçlü
            /*
            aşagıdaki set nested if seti
             */
            if (kartVarMi == 'E') {
                indirimOrani = 20;
            } else if (kartVarMi == 'H') {
                indirimOrani = 15;
            } else
                System.out.println("Hatalı giriş");

        }else if (urunAdedi < 10) { // 2.şart seti ana üçlü
             /*
            aşagıdaki set nested if seti
             */
                if(kartVarMi== 'E'){
                    indirimOrani=15;
                }else if (kartVarMi=='H'){
                    indirimOrani=10;
                } else
                    System.out.println("Hatalı giriş");

        } else //Ana üçlü
            System.out.println("gecersiz giris");

        System.out.println("Toplam satış fiyatı:"+urunAdedi*indirimsizFiyat*(100-indirimOrani)/100);
    }
}

