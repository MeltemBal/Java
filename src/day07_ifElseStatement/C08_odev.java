package day07_ifElseStatement;

import java.util.Scanner;

public class C08_odev {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20,
        // yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15,
        // yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kaç adet ürün aldıgınızı yazın");
        int urunSayisi = scanner.nextInt();
        System.out.println("Lutfen urunun liste fiyatını girin");
        double listeFiyati = scanner.nextDouble();
        char musteriKarti = scanner.next().toUpperCase().charAt(0);
        System.out.println("Musteri kartiniz var mı E:Evet H:Hayir");

        if (musteriKarti == 'E' && urunSayisi > 10) {
            System.out.println("10 adetten fazla ürün aldıgınız icin ;  \n%20 indirim uygulanmıstır\n indirimli fiyat:" + listeFiyati * 0.80);
        } else if (musteriKarti == 'E' && urunSayisi <= 10) {
            System.out.println("10 adetten daha az ürün aldıgınız icin ;  \n %15 indirim uygulanmıstır (indirimli fiyat:" + listeFiyati * 0.85);
        } else if (musteriKarti == 'H' && urunSayisi > 10) {
            System.out.println("10 adetten fazla ürün aldıgınız ancak musteri kartiniz olmadigi icin ; \n%15 indirim uygulanmıstır\n indirimli fiyat:" + listeFiyati * 0.85);
        } else if(musteriKarti=='H' && urunSayisi<=10)
            System.out.println("10 adetten daha az ürün aldıgınız ancak musteri kartiniz olmadigi icin ; \n %10 indirim uygulanmıstır\\n indirimli fiyat:" + listeFiyati * 0.90);
    }
}