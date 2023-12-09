package day12_strinManipulation;

public class C02_ReplaceAll {
    public static void main(String[] args) {

     String str= "J1a34va12 C87an90d654ir";

        //metinden tüm sayilari temizleyin
        //metni kaydedin

        //ReplaceAll tek tek harfleri değil
        //tüm harfleri ya da tüm rakamları diyebilecegimiz durumlard kullanılıt

        // örnegin bu soruda "tüm sayıları yok etmemiz" lazim

        str= str.replaceAll("\\d", "");

    }
}
