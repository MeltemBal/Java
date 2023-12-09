package day32_encapsulation;

import day31_stringBuilder_accessModifier.C04_AccessModifier;

public class C01_ChildClass extends C04_AccessModifier {
    // extends keyword içinde bulundugumuz C01 class'ını
    // C04_AccessModifier class'ının child'ı yapar

    public static void main(String[] args) {


        C04_AccessModifier obj = new C04_AccessModifier();
        // System.out.println(obj.strPrivate); SADECE KENDİ CLASS'I
        //System.out.println(obj.sayiDefault); KENDİ PARKAGE'I  // Diger adı parkage private'dir
        //System.out.println(obj.blProtected);
        obj.methodPublic();

        C01_ChildClass objChild = new C01_ChildClass();
        System.out.println(objChild.blProtected);
        objChild.blProtected = true;

    }

}
