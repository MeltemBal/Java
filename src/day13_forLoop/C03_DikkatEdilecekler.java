package day13_forLoop;

public class C03_DikkatEdilecekler {
    public static void main(String[] args) {

        // Eger i'nin ilk degeri için bile bitiş sartı true olmazsa
        // Loop body'si hiç devreye girmez
        // Loop ÇALIŞIR ama HİÇ BİR İŞLEM YAPMAZ


        for(int i=10; i>20; i++) {

            System.out.println("Bu Loop body'si hiç calışmaz");

        }

        // EGER i'nin bütün degerleri için bitiş sartı TRUE oluyorsa
        // bu duruma teknik olarak SONSUZ LOOP denir
        for(int i=10; i>0; i++){
            System.out.println(i+" ");
        }
    }
}
