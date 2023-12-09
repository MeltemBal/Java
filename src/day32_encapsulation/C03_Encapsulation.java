package day32_encapsulation;

public class C03_Encapsulation {

    private String strPrivate;
    String strDefault;
    protected String strProtected;
    public String strPublic;

    private  int satisTutari;

    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari += satisTutari;
    }

    private int toplamSatisTutari;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;


    }

    // baska class'lar satistutarı variable'ına deger atayabilsin
    // atanan her deger toplam satıs tutarına otomatik olarak ekslensin
    // ama stis tutari veriable'nın degerini kimse yazdıramasın.
    // deger atanabilsin ama atanan degerler görülemesin

    // toplam satis tutarı degerini baska class'lar görebilsin
    // ama kimse toplam satis tutarı veriable'ına deger atayamasın
    // degeri görülebilsin ama deger atanamasın
    public static void main(String[] args) {

        /*
        Direk erişim için sadece access modifier yeterli olmaz
        static keywoerd'e bakmak gerekir

         */

        C03_Encapsulation obj= new C03_Encapsulation();

        obj.strDefault="Default variable";
        System.out.println(obj.strDefault); // Default variable

        obj.strPrivate="private default";
        System.out.println(obj.strPrivate); // private variable


    }

}
