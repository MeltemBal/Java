package CalısmaKlasörü;

import java.util.Scanner;

public class M04_IfElseIfStatements {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        //Musteri karti varsa 10 urunden fazla alirsa %20, az alirsa %15 indirim yapin,
        //Musteri karti yoksa 10 urunden fazla alirsa %15, az alirsa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen aldıgınız ürün sayısıni giriniz");
        int urunSayisi = scanner.nextInt();

        System.out.println("Ürünün indirimsiz fiyatını girin");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı?      E:Evet    H:Hayır ");
        char musteriKarti = scanner.next().toUpperCase().charAt(0);

        int indirimOrani = 0;

        if (musteriKarti == 'E') {
            if (urunSayisi > 10) {
                indirimOrani = 20;
            } else if (urunSayisi < 10) {
                indirimOrani = 15;
            } else
                System.out.println("Ürün sayısı hatalı");


        } else if (musteriKarti == 'H') {
            if (urunSayisi > 10) {
                indirimOrani = 15;
            } else if (urunSayisi < 10) {
                indirimOrani = 10;
            } else {
                System.out.println("Ürün sayısı hatalı");
            }



        } else {
            System.out.println("Kart bilgisi hatalı");
        }

        if (indirimOrani > 0) {
            System.out.println(indirimOrani+"İndirimli toplam fiyat:"+
                    indirimsizFiyat*urunSayisi*(100-indirimOrani)/100 );

        }
    }


}