package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C03_nestedIfElseİndirimliÜrünsorusu2 {
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

        if(urunAdedi>10){
            //ürün miktarı 10'dan cok olanlar
            if(kartVarMi=='E') {
                indirimOrani = 20;
            } else if (kartVarMi=='H') {
                indirimOrani=15;
            }else {
                System.out.println("Kart bilgisi hatali");
        }
        } else if (urunAdedi>0) {
            //ürün miktari 1-10(dahil) arasında olanlar
            if(kartVarMi=='E'){
                indirimOrani=15;
            } else if (kartVarMi=='H') {
                indirimOrani = 10;
            }else{
                System.out.println("Kart bilgisi hatali");
            }
        }else {
            //ürün miktari 0 veya negatif olanlar
            System.out.println("Ürün miktari hatali");
        }
        System.out.println(indirimOrani+"indirim toplam fiyat:"+ urunAdedi*indirimsizFiyat*(100-indirimOrani)/100);

    }
}
