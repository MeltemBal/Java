package day08_nestedIfElseStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        //input olarak ver,len bir tamsayi için
        //pozitif veya pozitif degil yazdırın

        int input = 56;

        if (input > 0) {
            System.out.println("sayi pozitif");
        } else {
            System.out.println("Sayi pozitif degil");
        }
        System.out.println(input > 0 ? "pozitif sayi" : "sayi pozitif degil");

        //input olarak verilen sayi
        //cift sayi ise 2 katına cıkarın
        //tek sayi ise degerini 5 artırın
        if (input % 2 == 0) {
            input *= 2;
        } else {
            input += 5;
        }
    }
}
