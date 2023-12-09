package day31_stringBuilder_accessModifier;

public class C05_ChildOfC04 extends C04_AccessModifier{

    public static void main(String[] args) {

        /*
        aynı package içinde
        farklı bir class'dayız
        ama child class'dayız
         */

        C04_AccessModifier obj=new C04_AccessModifier();
        // System.out.println(obj.strPrivate);

        System.out.println(obj.sayiDefault);
        obj.sayiDefault=30;

        System.out.println(obj.blProtected);
        obj.blProtected= true;

        obj.methodPublic();

    }
}
