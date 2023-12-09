package day12_strinManipulation;

public class C04_Trim {
    public static void main(String[] args) {

        String str= "       Ali     topa    vur.     ";

        //metindeki fazla kullanılan space'leri temizleyin

        str= str.trim();

        str=str.replaceAll("\\s"," ");


        System.out.println(str); // Ali topa vur.

    }
}
