package day12_strinManipulation;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Hava Candir.";

        str.replace("H", "J"); //Java Candir.

        System.out.println(str); //Hava Candir.

        str = str.replace("Hava", "Java").replace(".", "");

        System.out.println(str); // Java Candir

        System.out.println(str.replaceFirst("a", "A")); //JAva candir
        System.out.println(str.replace("a", "A")); //JAvA CAndir

        //bosluğu yok edelim
        System.out.println(str.replace(" ", "")); //JavaCandir

        str = "Ali uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.replace('u', 'U')); // Ali UzUnkavaklaraltindayatarUyUmazoglU

        System.out.println(str.replace("l", "XYZ")); // AXYZi uzunkavakXYZaraXYZtindayataruyumazogXYZu
    }
}