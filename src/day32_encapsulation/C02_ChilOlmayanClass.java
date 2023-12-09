package day32_encapsulation;

import day31_stringBuilder_accessModifier.C04_AccessModifier;

public class C02_ChilOlmayanClass {

    public static void main(String[] args) {

        C04_AccessModifier obj=new C04_AccessModifier();
        // System.out.println(obj.strPrivate);sadece aynı class'dakiler ulasır
        // System.out.println(obj.sayiDefault); sadece anı parkage'dakiler
        // System.out.println(obj.blProtected); Child class'lar
        obj.methodPublic();


    }
}
