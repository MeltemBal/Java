package day26_constructor;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1);
        // Araba özellikleri {
        // Marka : Marka belirtilmemis,
        // model : Model belirtilmemis,
        // renk : Renk belirtilmemis,
        // yil : 1900, fiyat : 0}

        car1.marka = "Opel";
        car1.model = "Vectra";
        car1.renk = "Siyah";
        car1.yil = 2008;
        car1.fiyat = 5000;

        System.out.println(car1);

    }
}
