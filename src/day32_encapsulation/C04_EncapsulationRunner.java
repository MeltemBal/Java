package day32_encapsulation;

public class C04_EncapsulationRunner {

    public static void main(String[] args) {

        // access modifier ile vir variable'a erişim yetkimiz varsa
        // HEm onu yazdırabilir HEM DE deger atayabiliriz
        // ulaşamıyorsak hiçbir işlem yapamayız

        C03_Encapsulation obj = new C03_Encapsulation();
        //  obj.strPrivate = "Private";
        //  System.out.println(obj.strPrivate);

        obj.strDefault = "Default";
        System.out.println(obj.strDefault);
        obj.strProtected = "Protected";
        System.out.println(obj.strProtected);
        obj.strPublic = "Public";
        System.out.println(obj.strPublic);


        // PEKII okuma yani degerini görüntüleme yetkisi ile
        // write yani deger atayabilme yetkisini ayırabilir misiniz?

        /*
        ilgili variable'ları private yaptıgımız için
        access modifier onları kullanmamıza hiçbir şekilde
        izin vermez


       // obj.satisTutari=20;
        //System.out.println(obj.satisTutari);
        //obj.toplamSatisTutari=50;
        //System.out.println(obj.toplamSatisTutari);

        */
        System.out.println(obj.getToplamSatisTutari()); // 0

        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari()); // 250
        // satis tutarının variable'ının degerini yazdırana
        // 100 Euro veriyoruz

        // System.out.println(obj.satisTutari);

        // Toplsm satıs tutarı variable'ına deger atayana da
        // 100 euro veriyoruz

        // obj.toplamSatisTutari = 200;

    }
}
