package CalısmaKlasörü;

public class M01_HelloJava {

    public static void main(String[] args) {
        //merhaba yazan program
        System.out.println("Hello Java");
        System.out.println("Ben Meltem");

        //char yeniDegisken = 'a'; //tek karakter için kullanılır
        //String yazi = "Bu bir metin"; //Metinler için kullanılır
        //int sayi = 3546; //sayılar için kullanılrı
        //double virgullu=27.5  // küsuratlı sayılar için 64 bit

        String metin = "Degiskenleri ogreniyorum";
        String ismim = "Ben Dilruba";

        System.out.println(metin);
        System.out.println(ismim);
        System.out.println(metin + " " + ismim);

        char ilkHarf = 'M';

        System.out.println("ismimin ilk harfi:" + ilkHarf);

        int yasim = 40;
        String yasMetni = " yasindayim ";
        System.out.println(yasim + yasMetni);
        System.out.println(yasim + yasim);

        double kilom = 89.5;
        System.out.println("Kilom:" + kilom);
        System.out.println(yasim + kilom);

        int toplam = yasim + 45;
        double toplam2 = yasim + 42.5;

        System.out.println(yasim + 45);
        System.out.println(yasim + 42.5);

        int meltem = 45;
        int mehpare = 43;
        int anne = 75;
        int yasToplami = (meltem + mehpare + anne);
        System.out.println("Meltem:" + meltem);
        System.out.println("Mehpare:" + mehpare);
        System.out.println("Anne:" + anne);
        System.out.println("Yaşların toplamı=" + yasToplami);

        int kutu1;
        double kutu2;
        char kutu3;

        kutu1 = 1923;
        kutu2 = 3.4;
        kutu3 = 'd';

        System.out.println("Cumhuriyetin kurulusu: " + kutu1 + " Muzun agirliği: " + kutu2 + " Kutunun adi: " + kutu3);


    }
}
