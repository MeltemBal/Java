package day09_switchStatements;

public class C05_TestSorusu {
    public static void main(String[] args) {

        int maas = 15000;
        switch (maas) {
            case 6000:
                System.out.println("Asgari ucret");
                break;
            case 10000:
                System.out.println("Ogretmen maasi");
                break;
            case 15000:
                System.out.println("Tester maasi");
                break;
            default:
                System.out.println("Yok boyle bir maas");



        }
    }
}
