package day21_arrays_multiDimensionalArrays;

public class C02StringSplitMetodu {
    public static void main(String[] args) {

        // Verilen bir metinde
        // istenen karakterin kac kere kullanıldıgını yazdırın

        String metin = "Java da her gün yeni bir seyler ogreniyoruz";

        String aranankarakter = "e";

        String[] karakterler = metin.split("");

        int sayac = 0;

        for (int i = 0; i < karakterler.length; i++) {

            if (karakterler[i].equals(aranankarakter)) {
                sayac++;

            }

        }
        System.out.println("Aradiginiz karakter metinde "+ sayac + " defa kullanılmis" );
    }
}
